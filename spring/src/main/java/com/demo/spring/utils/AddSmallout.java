package com.demo.spring.utils;

import com.demo.spring.vo.Usmallout;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @author zhang
 * @version 1.0
 * @TODO 用户细则
 * @date 2021/12/23 星期四 23:30
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddSmallout {
    @JsonProperty(value = "SmallID")
    private String smallid;
    @JsonProperty(value = "Location")
    private String location;
    @JsonProperty(value = "BDate")
    private Date date;
    @JsonProperty(value = "CNo")
    private Integer cno;
    @JsonProperty(value = "Smallout")
    private List<Usmallout> smallout;
}
