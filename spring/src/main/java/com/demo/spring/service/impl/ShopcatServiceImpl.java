package com.demo.spring.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.demo.spring.pojo.Shopcat;
import com.demo.spring.mapper.ShopcatMapper;
import com.demo.spring.pojo.User;
import com.demo.spring.service.IShopcatService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo.spring.utils.Page;
import com.demo.spring.utils.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
public class ShopcatServiceImpl extends ServiceImpl<ShopcatMapper, Shopcat> implements IShopcatService {

    @Autowired
    private ShopcatMapper shopcatMapper;

    @Override
    public RespBean addsCart(Shopcat shopcat) {
        QueryWrapper<Shopcat> wrapperUser = new QueryWrapper<>();
        wrapperUser.eq("Gid", shopcat.getGid());
        List<Shopcat> shopcats = shopcatMapper.selectList(wrapperUser);
        RespBean respBean = new RespBean();
        if (shopcats.isEmpty()) {
            int insert = shopcatMapper.insert(shopcat);
            if (insert == 0) {
                respBean = respBean.error("添加购物车失败，请稍后再试！");
            } else {
                respBean = respBean.success("添加购物车成功！");
            }
        } else {
            respBean = respBean.error("该商品已在购物车，请勿重复添加");
        }
        return respBean;
    }

    @Override
    public RespBean getAllShopcat(int uid) {
        List<Shopcat> allShopcat = shopcatMapper.getAllShopcat(uid);
        RespBean respBean = new RespBean();
        if (!allShopcat.isEmpty()) {
            respBean = respBean.success("获取购物车列表成功！", allShopcat);
        } else {
            respBean = respBean.error("获取购物车为空，赶快去购物吧！");
        }
        return respBean;
    }
}
