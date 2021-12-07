package com.demo.spring.service.impl;

import com.demo.spring.pojo.Smallout;
import com.demo.spring.mapper.SmalloutMapper;
import com.demo.spring.service.ISmalloutService;
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
public class SmalloutServiceImpl extends ServiceImpl<SmalloutMapper, Smallout> implements ISmalloutService {

}
