package com.xhyan.zero.common.domain;

import javax.persistence.Column;
import javax.persistence.Table;

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

	/**
	 * 获取角色ID
	 *
	 * @return service_role_id - 角色ID
	 */
	public Long getServiceRoleId() {
		return serviceRoleId;
	}

	/**
	 * 设置角色ID
	 *
	 * @param serviceRoleId 角色ID
	 */
	public void setServiceRoleId(Long serviceRoleId) {
		this.serviceRoleId = serviceRoleId;
	}

	/**
	 * 获取服务ID
	 *
	 * @return service_res_id - 服务ID
	 */
	public Long getServiceResId() {
		return serviceResId;
	}

	/**
	 * 设置服务ID
	 *
	 * @param serviceResId 服务ID
	 */
	public void setServiceResId(Long serviceResId) {
		this.serviceResId = serviceResId;
	}
}