package com.demo.spring.controller;


import com.demo.spring.service.impl.GoodsServiceImpl;
import com.demo.spring.utils.GoodSearchParam;
import com.demo.spring.utils.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author zhang
 * @since 2021-12-21
 */
@RestController
public class GoodsController {

    @Autowired
    private GoodsServiceImpl goodsService;


    /**
     * 获取商品信息
     *
     * @param goodSearchParam 用户要查询的信息
     * @return 商品信息
     */
    @RequestMapping("/goods")
    public RespBean getGoods(@RequestBody GoodSearchParam goodSearchParam) {
        return goodsService.getGoods(goodSearchParam);
    }

}

