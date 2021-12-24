package com.demo.spring.utils;

import com.demo.spring.pojo.Listout;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author zhang
 * @version 1.0
 * @TODO 订单查询
 * @date 2021/12/24 星期五 19:43
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ListoutSearchParam {
    private Integer cno;
    private Integer page;
    private Integer pageSize;
}
