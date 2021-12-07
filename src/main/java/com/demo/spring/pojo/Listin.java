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
public class Listin implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("LNO")
    private Integer lno;

    @TableField("Location")
    private String location;

    @TableField("Date")
    private Date date;

    /**
     * 参照SmallIN
     */
    @TableField("SmallID")
    private Integer smallid;


}
