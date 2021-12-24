package com.demo.spring.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.demo.spring.pojo.Goods;
import com.demo.spring.mapper.GoodsMapper;
import com.demo.spring.service.IGoodsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo.spring.utils.GoodSearchParam;
import com.demo.spring.utils.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements IGoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public RespBean getGoods(GoodSearchParam goodSearchParam) {
        QueryWrapper<Goods> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("GID", goodSearchParam.getGid()).like("Name", goodSearchParam.getGname()).like("Kinds", goodSearchParam.getKinds()).orderByAsc("Price");
        IPage<Map<String, Object>> page = new Page<>(goodSearchParam.getPage(), goodSearchParam.getPageSize());
        IPage<Map<String, Object>> mapIPage = goodsMapper.selectMapsPage(page, queryWrapper);
        System.out.println(mapIPage);
        RespBean respBean = new RespBean();
        if (mapIPage.getSize() == 0) {
            respBean = respBean.error("暂无该商品！");
        } else {
            respBean = respBean.success("商品列表更新成功！", mapIPage);
        }
        return respBean;
    }
}
