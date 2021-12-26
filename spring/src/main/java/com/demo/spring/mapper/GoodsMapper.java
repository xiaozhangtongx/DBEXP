package com.demo.spring.mapper;

import com.demo.spring.pojo.Goods;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author zhang
 * @since 2021-12-21
 */
public interface GoodsMapper extends BaseMapper<Goods> {
    List<Goods> getwarnGoods();
}
