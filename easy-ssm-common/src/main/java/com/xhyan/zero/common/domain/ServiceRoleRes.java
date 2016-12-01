package com.xhyan.zero.common.domain;

import com.xhyan.zero.common.base.BaseDomain;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "service_role_res")
public class ServiceRoleRes extends BaseDomain {
	/**
	 * 角色ID
	 */
	@Column(name = "service_role_id")
	private Long serviceRoleId;

	/**
	 * 服务ID
	 */
	@Column(name = "service_res_id")
	private Long serviceResId;
}