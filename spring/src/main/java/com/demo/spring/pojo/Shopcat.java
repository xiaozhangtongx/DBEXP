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
public class Shopcat extends Goods implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户名
     */
    @TableId("Uid")
    private Integer uid;

    /**
     * 商品货号
     */
    @TableField("Gid")
    private Integer gid;

    /**
     * 购货数量
     */
    @TableField("GNum")
    private Integer gnum;

}
