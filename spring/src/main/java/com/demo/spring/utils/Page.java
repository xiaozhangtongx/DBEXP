package com.demo.spring.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhang
 * @version 1.0
 * @TODO 分页查询
 * @date 2021/12/23 星期四 14:56
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Page {
    int pageStart;
    int pageSize;
}
