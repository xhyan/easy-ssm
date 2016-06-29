package com.xhyan.zero.common.domain;

import lombok.Data;

import javax.persistence.Table;

@Data
@Table(name = "service_role")
public class ServiceRole extends BaseDomain {
	/**
	 * 角色名称
	 */
	private String name;

	private String memo;
}