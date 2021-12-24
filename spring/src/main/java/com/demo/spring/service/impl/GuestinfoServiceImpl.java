package com.demo.spring.service.impl;

import com.demo.spring.pojo.Guestinfo;
import com.demo.spring.mapper.GuestinfoMapper;
import com.demo.spring.service.IGuestinfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo.spring.utils.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author zhang
 * @since 2021-12-21
 */
@Service
public class GuestinfoServiceImpl extends ServiceImpl<GuestinfoMapper, Guestinfo> implements IGuestinfoService {

    @Autowired
    private GuestinfoMapper guestinfoMapper;

    @Override
    public RespBean getGestInfo(int uid) {
        List<Guestinfo> gestInfo = guestinfoMapper.getGestInfo(uid);
        RespBean respBean = new RespBean();
        if (!gestInfo.isEmpty()) {
            respBean = respBean.success("顾客信息获取成功！", gestInfo);
        } else {
            respBean = respBean.error("顾客信息获取失败！");
        }
        return respBean;
    }
}
