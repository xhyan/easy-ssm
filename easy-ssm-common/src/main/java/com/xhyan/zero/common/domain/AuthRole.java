package com.xhyan.zero.common.domain;

import com.xhyan.zero.common.base.BaseDomain;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "auth_role")
public class AuthRole extends BaseDomain {
	/**
	 * 角色名称
	 */
	@Column(name = "role_name")
	private String roleName;

	/**
	 * 备注
	 */
	private String remark;

	/**
	 * 创建人
	 */
	@Column(name = "create_by")
	private Long createBy;
}