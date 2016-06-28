package com.xhyan.zero.common.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "auth_user_role_res")
public class AuthUserRoleRes extends BaseDomain {
	/**
	 * 用户id
	 */
	@Column(name = "user_id")
	private Long userId;

	/**
	 * 角色id
	 */
	@Column(name = "role_id")
	private Long roleId;
}