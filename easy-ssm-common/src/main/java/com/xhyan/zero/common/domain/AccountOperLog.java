package com.xhyan.zero.common.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "account_oper_log")
public class AccountOperLog extends BaseDomain {
	/**
	 * 账户id
	 */
	@Column(name = "account_id")
	private Long accountId;

	/**
	 * 操作类型(1:冻结2:解冻3:受限4:解限5:注销)
	 */
	private Byte type;

	/**
	 * 操作员id
	 */
	@Column(name = "user_id")
	private Long userId;

	/**
	 * 操作员姓名(冗余字段)
	 */
	@Column(name = "user_name")
	private String userName;

	/**
	 * 备注
	 */
	private String remark;

}