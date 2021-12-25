package com.demo.spring.controller;


import com.demo.spring.pojo.Listout;
import com.demo.spring.service.impl.ListoutServiceImpl;
import com.demo.spring.utils.AddSmallout;
import com.demo.spring.utils.GoodSearchParam;
import com.demo.spring.utils.ListoutSearchParam;
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
public class ListoutController {
    @Autowired
    private ListoutServiceImpl listoutService;

    /**
     * 添加订货单
     *
     * @param addSmallout 订货单
     * @return 添加的结果
     */
    @RequestMapping("/stout")
    public RespBean addStout(@RequestBody AddSmallout addSmallout) {
        System.out.println(addSmallout);
        return listoutService.addStout(addSmallout);
    }

    /**
     * 获取订单信息
     *
     * @param listoutSearchParam 程序订单的信息
     * @return 订单信息
     */
    @RequestMapping("/getstout")
    public RespBean getStout(@RequestBody ListoutSearchParam listoutSearchParam) {
        return listoutService.getStout(listoutSearchParam);
    }

    /**
     * 删除订单
     *
     * @param smallid 细则号
     * @return 删除的结果
     */
    @RequestMapping("/deletestout")
    public RespBean deleteStout(String smallid) {
        return listoutService.deleteStout(smallid);
    }

}

