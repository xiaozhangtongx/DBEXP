package com.demo.spring.service.impl;

import com.demo.spring.pojo.Goods;
import com.demo.spring.mapper.GoodsMapper;
import com.demo.spring.service.IGoodsService;
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
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements IGoodsService {

}
