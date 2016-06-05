package com.xhyan.zero.common.domain;

import javax.persistence.Column;
import javax.persistence.Table;

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

	/**
	 * 获取账户id
	 *
	 * @return account_id - 账户id
	 */
	public Long getAccountId() {
		return accountId;
	}

	/**
	 * 设置账户id
	 *
	 * @param accountId 账户id
	 */
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	/**
	 * 获取操作类型(1:冻结2:解冻3:受限4:解限5:注销)
	 *
	 * @return type - 操作类型(1:冻结2:解冻3:受限4:解限5:注销)
	 */
	public Byte getType() {
		return type;
	}

	/**
	 * 设置操作类型(1:冻结2:解冻3:受限4:解限5:注销)
	 *
	 * @param type 操作类型(1:冻结2:解冻3:受限4:解限5:注销)
	 */
	public void setType(Byte type) {
		this.type = type;
	}

	/**
	 * 获取操作员id
	 *
	 * @return user_id - 操作员id
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * 设置操作员id
	 *
	 * @param userId 操作员id
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * 获取操作员姓名(冗余字段)
	 *
	 * @return user_name - 操作员姓名(冗余字段)
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * 设置操作员姓名(冗余字段)
	 *
	 * @param userName 操作员姓名(冗余字段)
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * 获取备注
	 *
	 * @return remark - 备注
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * 设置备注
	 *
	 * @param remark 备注
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
}