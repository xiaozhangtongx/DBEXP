package com.demo.spring.pojo;

import com.baomidou.mybatisplus.annotation.IdType;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 *
 * </p>
 *
 * @author zhang
 * @since 2021-12-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Listout extends Smallout implements Serializable {

    private static final long serialVersionUID = 1L;

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
     * 细则号
     */
    @TableField("SmallID")
    private String smallid;


}
