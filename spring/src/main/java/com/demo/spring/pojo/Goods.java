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
public class Goods implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 商品货号
     */
    @TableId("GID")
    private Integer gid;

    /**
     * 商品名称
     */
    @TableField("Name")
    private String name;

    /**
     * 生产厂商
     */
    @TableField("Maker")
    private String maker;

    /**
     * 剩余的某种货物的数量
     */
    @TableField("GRest")
    private Integer grest;

    /**
     * 低于该量则需补货
     */
    @TableField("LowLimit")
    private Integer lowlimit;

    /**
     * 商品描述
     */
    @TableField("Descri")
    private String descri;

    /**
     * 单价
     */
    @TableField("Price")
    private Float price;

    /**
     * 商品种类
     */
    @TableField("Kinds")
    private String kinds;

    /**
     * 商品照片
     */
    @TableField("Photo")
    private String photo;

    /**
     * 商品照片
     */
    @TableField("Gstate")
    private Integer gstate;


}
