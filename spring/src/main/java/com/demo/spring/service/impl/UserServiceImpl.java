package com.demo.spring.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.demo.spring.mapper.GuestinfoMapper;
import com.demo.spring.pojo.Guestinfo;
import com.demo.spring.pojo.Shopcat;
import com.demo.spring.pojo.User;
import com.demo.spring.mapper.UserMapper;
import com.demo.spring.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo.spring.utils.RespBean;
import com.demo.spring.utils.UserLoginParam;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    public UserMapper userMapper;

    @Autowired
    public GuestinfoMapper guestinfoMapper;

    /**
     * 用户登录
     *
     * @param userLoginParam 用户登录信息
     * @return 用户登录的结果
     */
    @Override
    public RespBean userLogin(UserLoginParam userLoginParam) {
        QueryWrapper<User> wrapperUser = new QueryWrapper<>();
        wrapperUser.eq("Uid", userLoginParam.getUid())
                .eq("Upward", userLoginParam.getUpward())
                .eq("State", 1);
        List<User> users = userMapper.selectList(wrapperUser);
        RespBean respBean = new RespBean();
        if (users.isEmpty()) {
            System.out.println("密码错误");
            respBean = respBean.error("账号或密码输入错误，请重新输入你的账号和密码");
        } else {
            respBean = respBean.success("账号密码，输入正确", users);
        }
        return respBean;
    }

    /**
     * 修改用户密码
     *
     * @param user 用户信息
     * @return 修改的结果
     */
    @Override
    public RespBean changePwd(User user) {
        int rows = userMapper.updateById(user);
        RespBean respBean = new RespBean();
        if (rows != 0) {
            respBean = respBean.success("密码修改成功！");
        } else {
            respBean = respBean.error("密码修改失败！");
        }
        return respBean;
    }

    /**
     * 用户注册
     *
     * @param user 用户信息
     * @return 注册的结果
     */
    @Override
    public RespBean userRegister(User user) {
        QueryWrapper<User> wrapperUser = new QueryWrapper<>();
        wrapperUser.eq("Uid", user.getUid());
        List<User> users = userMapper.selectList(wrapperUser);
        RespBean respBean = new RespBean();
        if (users.isEmpty()) {
            int insert = userMapper.insert(user);
            if (insert == 0) {
                respBean = respBean.error("注册失败，请稍后再试！");
            } else {
                Guestinfo guestinfo = new Guestinfo();
                guestinfo.setUid(user.getUid());
                int i = guestinfoMapper.insert(guestinfo);
                if (i != 0) {
                    respBean = respBean.success("用户注册成功！");
                } else {
                    respBean = respBean.error("注册失败，请稍后再试！");
                }
            }
        } else {
            respBean = respBean.error("改账号已被其他用户注册，请你换个账号试试！");
        }
        return respBean;
    }
}
