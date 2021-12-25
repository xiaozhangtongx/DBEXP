package com.demo.spring.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.demo.spring.pojo.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author zhang
 * @version 1.0
 * @TODO 顾客信息
 * @date 2021/12/25 星期六 17:47
 */

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GuestInfo extends User {
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

    /**
     * 用户名
     */
    @TableField("Uname")
    private String uname;
}
