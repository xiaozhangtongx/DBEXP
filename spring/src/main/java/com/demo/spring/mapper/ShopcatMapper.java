package com.demo.spring.mapper;

import com.demo.spring.pojo.Shopcat;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.demo.spring.utils.Page;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author zhang
 * @since 2021-12-21
 */
public interface ShopcatMapper extends BaseMapper<Shopcat> {
    List<Shopcat> getAllShopcat(int uid);
}
