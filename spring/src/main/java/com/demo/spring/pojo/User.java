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
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户账号
     */
    @TableId("Uid")
    private Integer uid;

    /**
     * 用户密码
     */
    @TableField("Upward")
    private String upward;

    /**
     * 用户角色
     */
    @TableField("Role")
    private String role;

    /**
     * 用户状态
     */
    @TableField("State")
    private Integer state;


}
