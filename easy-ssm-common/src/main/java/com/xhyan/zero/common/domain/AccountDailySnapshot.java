package com.xhyan.zero.common.domain;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "account_daily_snapshot")
public class AccountDailySnapshot extends BaseDomain{
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

	/**
	 * 获取账户ID
	 *
	 * @return account_id - 账户ID
	 */
	public Long getAccountId() {
		return accountId;
	}

	/**
	 * 设置账户ID
	 *
	 * @param accountId 账户ID
	 */
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	/**
	 * 获取账户可交易额度
	 *
	 * @return balance - 账户可交易额度
	 */
	public Long getBalance() {
		return balance;
	}

	/**
	 * 设置账户可交易额度
	 *
	 * @param balance 账户可交易额度
	 */
	public void setBalance(Long balance) {
		this.balance = balance;
	}

	/**
	 * 获取可交易的信用额度
	 *
	 * @return credit_amount - 可交易的信用额度
	 */
	public Long getCreditAmount() {
		return creditAmount;
	}

	/**
	 * 设置可交易的信用额度
	 *
	 * @param creditAmount 可交易的信用额度
	 */
	public void setCreditAmount(Long creditAmount) {
		this.creditAmount = creditAmount;
	}

	/**
	 * 获取已冻结的额度
	 *
	 * @return frozen_amount - 已冻结的额度
	 */
	public Long getFrozenAmount() {
		return frozenAmount;
	}

	/**
	 * 设置已冻结的额度
	 *
	 * @param frozenAmount 已冻结的额度
	 */
	public void setFrozenAmount(Long frozenAmount) {
		this.frozenAmount = frozenAmount;
	}

	/**
	 * 获取交易日
	 *
	 * @return trade_date - 交易日
	 */
	public Date getTradeDate() {
		return tradeDate;
	}

	/**
	 * 设置交易日
	 *
	 * @param tradeDate 交易日
	 */
	public void setTradeDate(Date tradeDate) {
		this.tradeDate = tradeDate;
	}

}