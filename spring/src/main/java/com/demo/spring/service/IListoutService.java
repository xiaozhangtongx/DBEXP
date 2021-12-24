package com.demo.spring.service;

import com.demo.spring.pojo.Listout;
import com.baomidou.mybatisplus.extension.service.IService;
import com.demo.spring.utils.AddSmallout;
import com.demo.spring.utils.ListoutSearchParam;
import com.demo.spring.utils.RespBean;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author zhang
 * @since 2021-12-21
 */
public interface IListoutService extends IService<Listout> {

    RespBean addStout(AddSmallout addSmallout);

    RespBean getStout(ListoutSearchParam listoutSearchParam);
}
