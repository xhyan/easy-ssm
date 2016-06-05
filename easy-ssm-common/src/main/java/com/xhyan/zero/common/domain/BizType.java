package com.xhyan.zero.common.domain;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "biz_type")
public class BizType extends BaseDomain {
	/**
	 * 业务类型名称
	 */
	@Column(name = "biz_name")
	private String bizName;

	/**
	 * 备注
	 */
	private String memo;


	/**
	 * 获取业务类型名称
	 *
	 * @return biz_name - 业务类型名称
	 */
	public String getBizName() {
		return bizName;
	}

	/**
	 * 设置业务类型名称
	 *
	 * @param bizName 业务类型名称
	 */
	public void setBizName(String bizName) {
		this.bizName = bizName;
	}

	/**
	 * 获取备注
	 *
	 * @return memo - 备注
	 */
	public String getMemo() {
		return memo;
	}

	/**
	 * 设置备注
	 *
	 * @param memo 备注
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}
}