package com.xhyan.zero.common.domain;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "account_own_partner")
public class AccountOwnPartner extends BaseDomain {
	/**
	 * 资金账号ID
	 */
	@Column(name = "account_id")
	private Long accountId;

	/**
	 * 接入方ID
	 */
	@Column(name = "partner_id")
	private Long partnerId;

	/**
	 * 获取资金账号ID
	 *
	 * @return account_id - 资金账号ID
	 */
	public Long getAccountId() {
		return accountId;
	}

	/**
	 * 设置资金账号ID
	 *
	 * @param accountId 资金账号ID
	 */
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	/**
	 * 获取接入方ID
	 *
	 * @return partner_id - 接入方ID
	 */
	public Long getPartnerId() {
		return partnerId;
	}

	/**
	 * 设置接入方ID
	 *
	 * @param partnerId 接入方ID
	 */
	public void setPartnerId(Long partnerId) {
		this.partnerId = partnerId;
	}
}