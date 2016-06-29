package com.xhyan.zero.common.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "service_resource")
public class ServiceResource extends BaseDomain {

	/**
	 * 服务key
	 */
	private String key;

	/**
	 * 服务名
	 */
	private String name;

	/**
	 * 服务描述
	 */
	private String description;

	/**
	 * 数据的版本号
	 */
	private Integer version;

	/**
	 * 数据的同步状态
	 */
	@Column(name = "sync_status")
	private Byte syncStatus;

	/**
	 * 最近一次同步数据的时间
	 */
	@Column(name = "sync_time")
	private Date syncTime;
}