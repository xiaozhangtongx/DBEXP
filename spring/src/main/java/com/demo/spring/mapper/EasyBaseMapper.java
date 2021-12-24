package com.demo.spring.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.Collection;

/**
 * @author zhang
 * @version 1.0
 * @TODO 扩展通用 Mapper，支持数据批量插入
 * @date 2021/12/24 星期五 13:14
 */

public interface EasyBaseMapper<T> extends BaseMapper<T> {
    /**
     * 批量插入 仅适用于mysql
     *
     * @param entityList 实体列表
     * @return 影响行数
     */
    Integer insertBatchSomeColumn(Collection<T> entityList);
}
