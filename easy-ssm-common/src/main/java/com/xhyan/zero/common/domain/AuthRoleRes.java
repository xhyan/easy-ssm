package com.xhyan.zero.common.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "auth_role_res")
public class AuthRoleRes extends BaseDomain {
	@Id
	@Column(name = "role_id")
	private Integer roleId;

	@Id
	@Column(name = "res_id")
	private Integer resId;

}