package com.demo.spring.service;

import com.demo.spring.pojo.Guestinfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.demo.spring.utils.RespBean;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author zhang
 * @since 2021-12-21
 */
public interface IGuestinfoService extends IService<Guestinfo> {

    RespBean getGestInfo(int uid);

    RespBean updateGesteInfo(Guestinfo guestinfo);
}
