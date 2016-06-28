package com.xhyan.zero.common.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "auth_resource")
public class AuthResource extends BaseDomain {
	/**
	 * URL路径
	 */
	@Column(name = "url_path")
	private String urlPath;

	@Column(name = "parent_id")
	private String parentId;

	/**
	 * 描述
	 */
	private String remark;

}