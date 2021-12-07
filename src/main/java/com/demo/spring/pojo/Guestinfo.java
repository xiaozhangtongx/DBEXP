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
public class Guestinfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("Uid")
    private Integer uid;

    @TableField("Location")
    private String location;

    @TableField("Borrow")
    private Float borrow;

    @TableField("Rest")
    private Float rest;

    @TableField("Cheap")
    private Float cheap;


}
