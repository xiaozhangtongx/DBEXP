package com.demo.spring.controller;


import com.demo.spring.pojo.Guestinfo;
import com.demo.spring.service.impl.GuestinfoServiceImpl;
import com.demo.spring.service.impl.ListoutServiceImpl;
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
public class GuestinfoController {
    @Autowired
    private GuestinfoServiceImpl guestinfoService;

    /**
     * 获取顾客信息
     *
     * @param uid 顾客id
     * @return 顾客信息
     */
    @RequestMapping("/getGestInfo")
    private RespBean getGestInfo(int uid) {
        return guestinfoService.getGestInfo(uid);
    }

    /**
     * 更新顾客信息
     *
     * @param guestinfo 顾客信息
     * @return 更新的结果
     */
    @RequestMapping("/upGesteInfo")
    private RespBean updateGesteInfo(@RequestBody Guestinfo guestinfo) {
        System.out.println(guestinfo);
        return guestinfoService.updateGesteInfo(guestinfo);
    }
}

