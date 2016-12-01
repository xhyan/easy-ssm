package com.xhyan.zero.common.domain;

import com.xhyan.zero.common.base.BaseDomain;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "account_fund")
public class AccountFund extends BaseDomain {
	/**
	 * 账号id
	 */
	@Column(name = "account_id")
	private Long accountId;

	/**
	 * 资金类型，默认为0账户交易资金
	 */
	private Byte type;

	/**
	 * 可用余额
	 */
	private Long balance;

	/**
	 * 可交易的信用额度
	 */
	@Column(name = "credit_amount")
	private Long creditAmount;

	/**
	 * 已冻结的额度
	 */
	@Column(name = "frozen_amount")
	private Long frozenAmount;

	/**
	 * 日切可交易额度
	 */
	@Column(name = "daily_balance")
	private Long dailyBalance;

	/**
	 * 日切可交易信用额度
	 */
	@Column(name = "daily_credit_amount")
	private Long dailyCreditAmount;

	/**
	 * 日切已冻结额度
	 */
	@Column(name = "daily_frozen_amount")
	private Long dailyFrozenAmount;
}