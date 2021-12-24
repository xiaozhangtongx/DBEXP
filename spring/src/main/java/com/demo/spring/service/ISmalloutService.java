package com.demo.spring.service;

import com.demo.spring.pojo.Smallout;
import com.baomidou.mybatisplus.extension.service.IService;
import com.demo.spring.utils.AddSmallout;
import com.demo.spring.utils.RespBean;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author zhang
 * @since 2021-12-21
 */
public interface ISmalloutService extends IService<Smallout> {
    RespBean addSmalltout(AddSmallout addSmallout);
}
