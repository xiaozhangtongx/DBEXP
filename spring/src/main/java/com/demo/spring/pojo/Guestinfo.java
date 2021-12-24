package com.demo.spring.pojo;

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
public class Guestinfo extends User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户账号
     */
    @TableId("Uid")
    private Integer uid;

    /**
     * 订货地址
     */
    @TableField("Location")
    private String location;

    /**
     * 赊额
     */
    @TableField("Borrow")
    private Float borrow;

    /**
     * 余额
     */
    @TableField("Rest")
    private Float rest;

    /**
     * 折扣
     */
    @TableField("Cheap")
    private Float cheap;


}
