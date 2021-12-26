package com.demo.spring.vo;

import com.demo.spring.pojo.Goods;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author zhang
 * @version 1.0
 * @TODO 前端传递的订单细则
 * @date 2021/12/24 星期五 14:27
 */

@EqualsAndHashCode(callSuper = false)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usmallout extends Goods {
    /**
     * gnum 订货数量
     */
    private Integer gnum;
    /**
     * 货物号
     */
    private Integer gid;
    /**
     * 货物价格
     */
    private Float price;

}
