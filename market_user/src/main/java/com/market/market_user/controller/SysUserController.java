package com.market.market_user.controller;

import com.market.market_user.service.SysUserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 服务控制器
 *
 * @author zhaoyx
 * @description 由 Mybatisplus Code Generator 创建
 * @since 2020-11-25 10:59:02
 */
@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/sysUser")
public class SysUserController {
    private final SysUserService sysUserService;
}