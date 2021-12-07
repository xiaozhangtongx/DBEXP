package com.demo.spring.pojo;

import java.util.Date;
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
public class Listout implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("LNo")
    private Integer lno;

    @TableField("CNo")
    private Integer cno;

    @TableField("Location")
    private String location;

    @TableField("BDate")
    private Date bdate;

    @TableField("SmallID")
    private Integer smallid;


}
