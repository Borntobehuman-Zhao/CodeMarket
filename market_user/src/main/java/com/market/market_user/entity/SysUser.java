package com.market.market_user.entity;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 系统用户表I
 * </p>
 *
 * @author zhaoyx
 * @since 2021-03-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;

    private String name;

    private String phone;

    /**
     * 0代表女，1代表男
     */
    private Integer sex;

    /**
     * 默认值100，小于100无法接受任务
     */
    private Integer credibility;

    /**
     * 用户等级，初始等级为1
     */
    private Integer level;

    /**
     * 初始经验为0
     */
    private Integer experience;

    /**
     * 初始用户积累资金为0
     */
    private Integer funds;

    /**
     * 用户所属角色编号
     */
    private Integer roleId;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 1是启用，0是不启用
     */
    private Integer enableStatus;


}
