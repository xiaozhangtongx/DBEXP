package com.demo.spring.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhang
 * @version 1.0
 * @TODO 商品搜索信息类
 * @date 2021/11/18 星期四 17:52
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoodSearchParam {
    private String gid;
    private String gname;
    private String kinds;
    private Integer page;
    private Integer pageSize;
}
