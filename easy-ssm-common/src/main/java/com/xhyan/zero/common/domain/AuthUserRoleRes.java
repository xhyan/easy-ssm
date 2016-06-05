package com.xhyan.zero.common.domain;

import javax.persistence.Column;
import javax.persistence.Table;

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

	/**
	 * 获取用户id
	 *
	 * @return user_id - 用户id
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * 设置用户id
	 *
	 * @param userId 用户id
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * 获取角色id
	 *
	 * @return role_id - 角色id
	 */
	public Long getRoleId() {
		return roleId;
	}

	/**
	 * 设置角色id
	 *
	 * @param roleId 角色id
	 */
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

}