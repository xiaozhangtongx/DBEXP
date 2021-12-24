package com.demo.spring.service.impl;

import com.demo.spring.pojo.Shopcat;
import com.demo.spring.mapper.ShopcatMapper;
import com.demo.spring.service.IShopcatService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhang
 * @since 2021-12-21
 */
@Service
public class ShopcatServiceImpl extends ServiceImpl<ShopcatMapper, Shopcat> implements IShopcatService {

}
