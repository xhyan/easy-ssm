package com.xhyan.zero.common.domain;

import com.xhyan.zero.common.base.BaseDomain;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "auth_sys_user")
public class AuthSysUser extends BaseDomain {
	/**
	 * 登录名
	 */
	@Column(name = "user_name")
	private String userName;

	/**
	 * 用户状态
	 */
	private Boolean status;

	/**
	 * 密码
	 */
	private String password;

	@Column(name = "real_name")
	private String realName;

	private Boolean sex;

	private String phone;

	private String mobile;

	private String email;

	@Column(name = "last_login")
	private Date lastLogin;

	@Column(name = "valid_begin_time")
	private Date validBeginTime;

	@Column(name = "valid_end_time")
	private Date validEndTime;

	private String remark;

	/**
	 * 是否是超级管理员
	 */
	@Column(name = "is_super")
	private Byte isSuper;
}