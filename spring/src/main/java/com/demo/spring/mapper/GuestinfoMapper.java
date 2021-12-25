package com.demo.spring.mapper;

import com.demo.spring.pojo.Guestinfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.demo.spring.pojo.Shopcat;
import com.demo.spring.vo.GuestInfo;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author zhang
 * @since 2021-12-21
 */
public interface GuestinfoMapper extends BaseMapper<Guestinfo> {
    List<GuestInfo> getGestInfo(int uid);
}
