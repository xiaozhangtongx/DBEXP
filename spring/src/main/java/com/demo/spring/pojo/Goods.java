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
 * @since 2021-12-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Goods implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("GID")
    private Integer gid;

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

    @TableField("Descri")
    private String descri;

    /**
     * 单价
     */
    @TableField("Price")
    private Float price;


}
