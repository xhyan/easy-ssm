package com.xhyan.zero.common.domain;

import com.xhyan.zero.common.base.BaseDomain;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "account_daily_snapshot")
public class AccountDailySnapshot extends BaseDomain {
	/**
	 * 账户ID
	 */
	@Column(name = "account_id")
	private Long accountId;

	/**
	 * 账户可交易额度
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
	 * 交易日
	 */
	@Column(name = "trade_date")
	private Date tradeDate;

}