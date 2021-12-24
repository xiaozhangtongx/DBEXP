package com.demo.spring.controller;


import com.demo.spring.pojo.Shopcat;
import com.demo.spring.service.impl.ShopcatServiceImpl;
import com.demo.spring.utils.Page;
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
public class ShopcatController {
    @Autowired
    private ShopcatServiceImpl shopcatService;

    @RequestMapping("/addsCart")
    public RespBean addsCart(@RequestBody Shopcat shopcat) {
        return shopcatService.addsCart(shopcat);
    }

    @RequestMapping("/getShopCart")
    public RespBean getAllShort(int uid) {
        return shopcatService.getAllShopcat(uid);
    }

}

