package com.xhyan.zero.common.domain;

import com.xhyan.zero.common.base.BaseDomain;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "pipeline_contacts")
public class PipelineContacts extends BaseDomain {
	/**
	 * 通道编号
	 */
	@Column(name = "pipeline_id")
	private Long pipelineId;

	/**
	 * 姓名.
	 */
	private String name;

	/**
	 * 职务.
	 */
	private String position;

	/**
	 * 地址.
	 */
	private String address;

	/**
	 * 手机.
	 */
	private String mobile;

	/**
	 * 电话.
	 */
	private String tel;

	/**
	 * 邮箱.
	 */
	private String email;
}