package com.demo.spring.mapper;

import com.demo.spring.pojo.Smallout;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.demo.spring.vo.SmallOut;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author zhang
 * @since 2021-12-21
 */
public interface SmalloutMapper extends EasyBaseMapper<Smallout> {
    List<SmallOut> getSmallout(int uid, String smallid);
}