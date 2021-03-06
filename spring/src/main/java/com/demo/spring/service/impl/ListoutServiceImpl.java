package com.demo.spring.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.demo.spring.pojo.Goods;
import com.demo.spring.pojo.Listout;
import com.demo.spring.mapper.ListoutMapper;
import com.demo.spring.pojo.Shopcat;
import com.demo.spring.pojo.Smallout;
import com.demo.spring.service.IListoutService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo.spring.utils.AddSmallout;
import com.demo.spring.utils.ListoutSearchParam;
import com.demo.spring.utils.RespBean;
import com.demo.spring.vo.Usmallout;
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

    @Autowired
    private GoodsServiceImpl goodsService;


    @Override
    public RespBean addStout(AddSmallout addSmallout) {
        List<Usmallout> list1 = addSmallout.getSmallout();
        System.out.println(list1);
        for (Usmallout o : list1) {
            Goods goods = new Goods();
            goods.setGrest(o.getGrest() - o.getGnum());
            goods.setGid(o.getGid());
            goodsService.updateGoods(goods);
        }
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
        queryWrapper.select("LNo", "SmallID", "Location", "BDate", "CNo", "Lstate").eq("CNo", listoutSearchParam.getCno()).ne("Lstate", 0).orderByDesc("BDate");
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

    @Override
    public RespBean getStouts(ListoutSearchParam listoutSearchParam) {
        QueryWrapper<Listout> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("LNo", "SmallID", "Location", "BDate", "CNo", "Lstate").ne("Lstate", 0).orderByDesc("BDate");
        IPage<Map<String, Object>> page = new Page<>(listoutSearchParam.getPage(), listoutSearchParam.getPageSize());
        IPage<Map<String, Object>> mapIPage = listoutMapper.selectMapsPage(page, queryWrapper);
        System.out.println(mapIPage);
        RespBean respBean = new RespBean();
        if (mapIPage.getSize() == 0) {
            respBean = respBean.error("暂时还没有订单！");
        } else {
            respBean = respBean.success("订单列表更新成功！", mapIPage);
        }
        return respBean;
    }

    @Override
    public RespBean finishStout(int lno) {
        UpdateWrapper<Listout> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("Lno", lno).set("Lstate", 2);
        Integer rows = listoutMapper.update(null, updateWrapper);
        System.out.println(rows);
        RespBean respBean = new RespBean();
        if (rows != 0) {
            respBean = respBean.success("订单删除成功！");
        } else {
            respBean = respBean.error("订单删除失败！");
        }
        return respBean;
    }

    @Override
    public RespBean deleteStout(String smallid) {
        UpdateWrapper<Listout> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("SmallID", smallid).set("Lstate", 0);
        Integer rows = listoutMapper.update(null, updateWrapper);
        System.out.println(rows);
        RespBean respBean = new RespBean();
        if (rows != 0) {
            respBean = respBean.success("订单删除成功！");
        } else {
            respBean = respBean.error("订单删除失败！");
        }
        return respBean;
    }

}
