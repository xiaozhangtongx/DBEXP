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
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户账号
     */
    @TableId("Uid")
    private Integer uid;

    @TableField("Uname")
    private String uname;

    @TableField("Upwd")
    private String upwd;

    @TableField("Role")
    private String role;


}
