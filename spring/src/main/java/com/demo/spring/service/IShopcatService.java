package com.demo.spring.service;

import com.demo.spring.pojo.Shopcat;
import com.baomidou.mybatisplus.extension.service.IService;
import com.demo.spring.utils.Page;
import com.demo.spring.utils.RespBean;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author zhang
 * @since 2021-12-21
 */
public interface IShopcatService extends IService<Shopcat> {

    RespBean addsCart(Shopcat shopcat);

    RespBean getAllShopcat(int uid);
}
