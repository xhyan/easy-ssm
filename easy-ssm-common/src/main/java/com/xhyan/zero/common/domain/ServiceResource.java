package com.xhyan.zero.common.domain;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

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


	/**
	 * 获取服务key
	 *
	 * @return key - 服务key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * 设置服务key
	 *
	 * @param key 服务key
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * 获取服务名
	 *
	 * @return name - 服务名
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置服务名
	 *
	 * @param name 服务名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取服务描述
	 *
	 * @return description - 服务描述
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * 设置服务描述
	 *
	 * @param description 服务描述
	 */
	public void setDescription(String description) {
		this.description = description;
	}


	/**
	 * 获取数据的版本号
	 *
	 * @return version - 数据的版本号
	 */
	public Integer getVersion() {
		return version;
	}

	/**
	 * 设置数据的版本号
	 *
	 * @param version 数据的版本号
	 */
	public void setVersion(Integer version) {
		this.version = version;
	}

	/**
	 * 获取数据的同步状态
	 *
	 * @return sync_status - 数据的同步状态
	 */
	public Byte getSyncStatus() {
		return syncStatus;
	}

	/**
	 * 设置数据的同步状态
	 *
	 * @param syncStatus 数据的同步状态
	 */
	public void setSyncStatus(Byte syncStatus) {
		this.syncStatus = syncStatus;
	}

	/**
	 * 获取最近一次同步数据的时间
	 *
	 * @return sync_time - 最近一次同步数据的时间
	 */
	public Date getSyncTime() {
		return syncTime;
	}

	/**
	 * 设置最近一次同步数据的时间
	 *
	 * @param syncTime 最近一次同步数据的时间
	 */
	public void setSyncTime(Date syncTime) {
		this.syncTime = syncTime;
	}
}