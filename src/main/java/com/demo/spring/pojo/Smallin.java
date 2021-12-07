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
public class Smallin implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("SmallID")
    private Integer smallid;

    @TableField("GNum")
    private Integer gnum;

    @TableField("Money")
    private Integer money;

    @TableField("GID")
    private Integer gid;


}
