package com.demo.spring.service.impl;

import com.demo.spring.pojo.Smallout;
import com.demo.spring.mapper.SmalloutMapper;
import com.demo.spring.service.ISmalloutService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo.spring.utils.AddSmallout;
import com.demo.spring.utils.RespBean;
import com.demo.spring.utils.SmallestParam;
import com.demo.spring.vo.Usmallout;
import com.demo.spring.vo.SmallOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author zhang
 * @since 2021-12-21
 */

@Service
public class SmalloutServiceImpl extends ServiceImpl<SmalloutMapper, Smallout> implements ISmalloutService {

    @Autowired
    private SmalloutMapper smalloutMapper;


    @Override
    public RespBean addSmalltout(AddSmallout addSmallout) {
//        System.out.println(addSmallout);
        ArrayList<Smallout> list = new ArrayList<>();
        List<Usmallout> list1 = addSmallout.getSmallout();
        System.out.println(list1);
        for (Usmallout o : list1) {
            Smallout smallout = new Smallout();
            smallout.setSmallid(addSmallout.getSmallid());
            smallout.setGid(o.getGid());
            smallout.setMoney(o.getPrice() * o.getGnum());
            smallout.setGnum(o.getGnum());
            list.add(smallout);
        }
        System.out.println(list);
        RespBean respBean = new RespBean();
        int insert = smalloutMapper.insertBatchSomeColumn(list);
        if (insert == 0) {
            respBean = respBean.error("订单添加失败，请稍后再试！");
        } else {
            respBean = respBean.success("订单添加成功！");
        }
        respBean = respBean.success("订单添加成功！");
        return respBean;
    }

    @Override
    public RespBean getSmallout(SmallestParam smallestParam) {
        List<SmallOut> smallOutList = smalloutMapper.getSmallout(smallestParam.getUid(), smallestParam.getSmallid());
        System.out.println(smallestParam);
        RespBean respBean = new RespBean();
        if (!smallOutList.isEmpty()) {
            respBean = respBean.success("订单细则获取成功！", smallOutList);
        } else {
            respBean = respBean.error("订单细则获取失败！");
        }
        return respBean;
    }
}
