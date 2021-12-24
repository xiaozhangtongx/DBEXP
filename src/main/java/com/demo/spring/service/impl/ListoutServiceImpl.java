package com.demo.spring.service.impl;

import com.demo.spring.pojo.Listout;
import com.demo.spring.mapper.ListoutMapper;
import com.demo.spring.service.IListoutService;
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
public class ListoutServiceImpl extends ServiceImpl<ListoutMapper, Listout> implements IListoutService {

}
