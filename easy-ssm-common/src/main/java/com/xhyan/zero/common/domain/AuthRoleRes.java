package com.xhyan.zero.common.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "auth_role_res")
public class AuthRoleRes extends BaseDomain {
	@Id
	@Column(name = "role_id")
	private Integer roleId;

	@Id
	@Column(name = "res_id")
	private Integer resId;

	/**
	 * @return role_id
	 */
	public Integer getRoleId() {
		return roleId;
	}

	/**
	 * @param roleId
	 */
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	/**
	 * @return res_id
	 */
	public Integer getResId() {
		return resId;
	}

	/**
	 * @param resId
	 */
	public void setResId(Integer resId) {
		this.resId = resId;
	}
}