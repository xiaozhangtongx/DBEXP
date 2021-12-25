package com.demo.spring.controller;


import com.demo.spring.service.impl.SmalloutServiceImpl;
import com.demo.spring.utils.RespBean;
import com.demo.spring.utils.SmallestParam;
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
public class SmalloutController {
    @Autowired
    private SmalloutServiceImpl smalloutService;

    @RequestMapping("/getSmallout")
    public RespBean getSmallout(@RequestBody SmallestParam smallestParam) {
        return smalloutService.getSmallout(smallestParam);
    }

}

