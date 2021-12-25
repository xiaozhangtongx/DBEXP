package com.demo.spring.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.demo.spring.vo.GuestInfo;
import com.demo.spring.pojo.Guestinfo;
import com.demo.spring.mapper.GuestinfoMapper;
import com.demo.spring.pojo.Listout;
import com.demo.spring.service.IGuestinfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo.spring.utils.RespBean;
import com.demo.spring.vo.GuestInfo;
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
        List<GuestInfo> gestInfo = guestinfoMapper.getGestInfo(uid);
        RespBean respBean = new RespBean();
        if (!gestInfo.isEmpty()) {
            respBean = respBean.success("顾客信息获取成功！", gestInfo);
        } else {
            respBean = respBean.error("顾客信息获取失败！");
        }
        return respBean;
    }

    @Override
    public RespBean updateGesteInfo(Guestinfo guestinfo) {
        int rows = guestinfoMapper.updateById(guestinfo);
        RespBean respBean = new RespBean();
        if (rows != 0) {
            respBean = respBean.success("信息更新成功！");
        } else {
            respBean = respBean.error("信息更新失败！");
        }
        return respBean;
    }
}
