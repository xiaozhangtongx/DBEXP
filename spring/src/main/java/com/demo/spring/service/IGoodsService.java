package com.demo.spring.service;

import com.demo.spring.pojo.Goods;
import com.baomidou.mybatisplus.extension.service.IService;
import com.demo.spring.utils.GoodSearchParam;
import com.demo.spring.utils.RespBean;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhang
 * @since 2021-12-21
 */
public interface IGoodsService extends IService<Goods> {

    RespBean getGoods(GoodSearchParam goodSearchParam);

    RespBean updateGoods(Goods goods);

    RespBean addGoods(Goods goods);

    RespBean getwarnGoods();
}
