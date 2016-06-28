package com.xhyan.zero.common.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
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
}