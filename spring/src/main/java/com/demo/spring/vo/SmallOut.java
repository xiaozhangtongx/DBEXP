package com.demo.spring.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.demo.spring.pojo.Goods;
import com.demo.spring.pojo.Smallout;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @author zhang
 * @version 1.0
 * @TODO 订单细则数据库存储
 * @date 2021/12/24 星期五 21:42
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SmallOut extends Goods {
    private static final long serialVersionUID = 1L;

    /**
     * 细则号
     */
    @TableId("SmallID")
    private String smallid;

    /**
     * 货物数量
     */
    @TableField("GNum")
    private Integer gnum;

    /**
     * 购买该货物的总金额
     */
    @TableField("Money")
    private Float money;

    /**
     * 参照Goods
     */
    @TableField("GID")
    private Integer gid;

    /**
     * 订单号
     */
    @TableId(value = "LNo", type = IdType.AUTO)
    private Integer lno;

    /**
     * 顾客号
     */
    @TableField("CNo")
    private Integer cno;

    /**
     * 收获地址
     */
    @TableField("Location")
    private String location;

    /**
     * 订货日期
     */
    @TableField("BDate")
    private Date bdate;

    /**
     * 订单状态
     */
    @TableField("Lstate")
    private Integer state;
}
