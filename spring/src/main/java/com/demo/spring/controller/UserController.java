package com.demo.spring.controller;


import com.demo.spring.pojo.User;
import com.demo.spring.service.impl.UserServiceImpl;
import com.demo.spring.utils.RespBean;
import com.demo.spring.utils.UserLoginParam;
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
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    /**
     * 用户登录
     *
     * @param userLoginParam 用户登录信息
     * @return 用户信息
     */
    @RequestMapping("/login")
    public RespBean userLogin(@RequestBody UserLoginParam userLoginParam) {
        return userService.userLogin(userLoginParam);
    }


    /**
     * 用户登录
     *
     * @param user 用户注册信息
     * @return 用户注册结果
     */
    @RequestMapping("/register")
    public RespBean userRegister(@RequestBody User user) {
        return userService.userRegister(user);
    }

    /**
     * 修改用户密码
     *
     * @param user 用户信息
     * @return 修改的结果
     */
    @RequestMapping("/changepwd")
    public RespBean changePwd(@RequestBody User user) {
        return userService.changePwd(user);
    }

}

