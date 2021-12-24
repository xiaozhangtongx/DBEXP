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
public class Smallout implements Serializable {

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


}
