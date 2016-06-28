package com.xhyan.zero.common.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
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
}