package com.xhyan.zero.common.domain;

import javax.persistence.Table;

@Table(name = "service_role")
public class ServiceRole extends BaseDomain {


	/**
	 * 角色名称
	 */
	private String name;

	private String memo;


	/**
	 * 获取角色名称
	 *
	 * @return name - 角色名称
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置角色名称
	 *
	 * @param name 角色名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return memo
	 */
	public String getMemo() {
		return memo;
	}

	/**
	 * @param memo
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}
}