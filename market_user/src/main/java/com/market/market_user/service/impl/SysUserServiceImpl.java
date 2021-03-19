package com.market.market_user.service.impl;

import com.market.market_user.entity.SysUser;
import com.market.market_user.mapper.SysUserMapper;
import com.market.market_user.service.ISysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统用户表I 服务实现类
 * </p>
 *
 * @author zhaoyx
 * @since 2021-03-17
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {
}
