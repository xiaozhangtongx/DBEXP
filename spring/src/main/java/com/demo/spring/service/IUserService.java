package com.demo.spring.service;

import com.demo.spring.pojo.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.demo.spring.utils.RespBean;
import com.demo.spring.utils.UserLoginParam;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhang
 * @since 2021-12-21
 */
public interface IUserService extends IService<User> {

    RespBean userLogin(UserLoginParam userLoginParam);
}
