package com.demo.spring.controller;


import com.demo.spring.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author zhang
 * @since 2021-12-07
 */
@RestController
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/test")
    private String test() {
        return "hello";
    }
}

