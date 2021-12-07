package com.demo.spring.service.impl;

import com.demo.spring.pojo.Guestinfo;
import com.demo.spring.mapper.GuestinfoMapper;
import com.demo.spring.service.IGuestinfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhang
 * @since 2021-12-07
 */
@Service
public class GuestinfoServiceImpl extends ServiceImpl<GuestinfoMapper, Guestinfo> implements IGuestinfoService {

}
