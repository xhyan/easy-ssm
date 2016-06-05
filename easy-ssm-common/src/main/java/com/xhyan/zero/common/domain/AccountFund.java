package com.xhyan.zero.common.domain;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "account_fund")
public class AccountFund extends BaseDomain{
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

	/**
	 * 获取账号id
	 *
	 * @return account_id - 账号id
	 */
	public Long getAccountId() {
		return accountId;
	}

	/**
	 * 设置账号id
	 *
	 * @param accountId 账号id
	 */
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	/**
	 * 获取资金类型，默认为0账户交易资金
	 *
	 * @return type - 资金类型，默认为0账户交易资金
	 */
	public Byte getType() {
		return type;
	}

	/**
	 * 设置资金类型，默认为0账户交易资金
	 *
	 * @param type 资金类型，默认为0账户交易资金
	 */
	public void setType(Byte type) {
		this.type = type;
	}

	/**
	 * 获取可用余额
	 *
	 * @return balance - 可用余额
	 */
	public Long getBalance() {
		return balance;
	}

	/**
	 * 设置可用余额
	 *
	 * @param balance 可用余额
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
	 * 获取日切可交易额度
	 *
	 * @return daily_balance - 日切可交易额度
	 */
	public Long getDailyBalance() {
		return dailyBalance;
	}

	/**
	 * 设置日切可交易额度
	 *
	 * @param dailyBalance 日切可交易额度
	 */
	public void setDailyBalance(Long dailyBalance) {
		this.dailyBalance = dailyBalance;
	}

	/**
	 * 获取日切可交易信用额度
	 *
	 * @return daily_credit_amount - 日切可交易信用额度
	 */
	public Long getDailyCreditAmount() {
		return dailyCreditAmount;
	}

	/**
	 * 设置日切可交易信用额度
	 *
	 * @param dailyCreditAmount 日切可交易信用额度
	 */
	public void setDailyCreditAmount(Long dailyCreditAmount) {
		this.dailyCreditAmount = dailyCreditAmount;
	}

	/**
	 * 获取日切已冻结额度
	 *
	 * @return daily_frozen_amount - 日切已冻结额度
	 */
	public Long getDailyFrozenAmount() {
		return dailyFrozenAmount;
	}

	/**
	 * 设置日切已冻结额度
	 *
	 * @param dailyFrozenAmount 日切已冻结额度
	 */
	public void setDailyFrozenAmount(Long dailyFrozenAmount) {
		this.dailyFrozenAmount = dailyFrozenAmount;
	}

}