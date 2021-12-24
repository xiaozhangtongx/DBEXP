package com.demo.spring.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.demo.spring.pojo.Goods;
import com.demo.spring.pojo.Listout;
import com.demo.spring.mapper.ListoutMapper;
import com.demo.spring.pojo.Shopcat;
import com.demo.spring.service.IListoutService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo.spring.utils.AddSmallout;
import com.demo.spring.utils.ListoutSearchParam;
import com.demo.spring.utils.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author zhang
 * @since 2021-12-21
 */
@Service
public class ListoutServiceImpl extends ServiceImpl<ListoutMapper, Listout> implements IListoutService {
    @Autowired
    private ListoutMapper listoutMapper;

    @Autowired
    private SmalloutServiceImpl smalloutService;

    @Override
    public RespBean addStout(AddSmallout addSmallout) {
        System.out.println(addSmallout);
        System.out.println(addSmallout.getSmallout());
        Listout listout = new Listout();
        listout.setSmallid(addSmallout.getSmallid());
        listout.setLocation(addSmallout.getLocation());
        listout.setBdate(addSmallout.getDate());
        listout.setCno(addSmallout.getCno());
        listoutMapper.insert(listout);
        return smalloutService.addSmalltout(addSmallout);
    }

    @Override
    public RespBean getStout(ListoutSearchParam listoutSearchParam) {
        QueryWrapper<Listout> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("LNo", "SmallID", "Location", "BDate", "CNo").eq("CNo", listoutSearchParam.getCno()).orderByDesc("BDate");
        IPage<Map<String, Object>> page = new Page<>(listoutSearchParam.getPage(), listoutSearchParam.getPageSize());
        IPage<Map<String, Object>> mapIPage = listoutMapper.selectMapsPage(page, queryWrapper);
        System.out.println(mapIPage);
        RespBean respBean = new RespBean();
        if (mapIPage.getSize() == 0) {
            respBean = respBean.error("你暂时还没有订单！");
        } else {
            respBean = respBean.success("订单列表更新成功！", mapIPage);
        }
        return respBean;
    }
}
