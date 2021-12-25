package com.demo.spring.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhang
 * @version 1.0
 * @TODO 订单细则
 * @date 2021/12/24 星期五 22:15
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SmallestParam {
    private Integer uid;
    private String smallid;
}
