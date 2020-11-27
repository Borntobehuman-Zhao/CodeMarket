package com.market.market_user.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * (sys_user)实体类
 *
 * @author zhaoyx
 * @since 2020-11-25 10:59:02
 * @description 由 Mybatisplus Code Generator 创建
 */

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@Accessors(chain = true)
@TableName("sys_user")
public class SysUser extends Model<SysUser> implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * id
     */
    @TableId
	private Integer id;
    /**
     * lockedFlag
     */
    private Integer lockedFlag;
    /**
     * password
     */
    private String password;
    /**
     * username
     */
    private String username;

}