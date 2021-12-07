package com.demo.spring.service.impl;

import com.demo.spring.pojo.Smallin;
import com.demo.spring.mapper.SmallinMapper;
import com.demo.spring.service.ISmallinService;
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
public class SmallinServiceImpl extends ServiceImpl<SmallinMapper, Smallin> implements ISmallinService {

}
