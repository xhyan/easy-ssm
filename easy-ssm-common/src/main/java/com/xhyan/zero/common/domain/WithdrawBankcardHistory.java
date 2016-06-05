package com.xhyan.zero.common.domain;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "withdraw_bankcard_history")
public class WithdrawBankcardHistory extends BaseDomain {


	/**
	 * 转出地利宝账户id
	 */
	@Column(name = "account_id")
	private Long accountId;

	/**
	 * 银行卡对应的银行渠道Id
	 */
	@Column(name = "channel_id")
	private Long channelId;

	/**
	 * 银行卡号
	 */
	@Column(name = "bank_card_number")
	private String bankCardNumber;

	/**
	 * 银行卡账户名
	 */
	@Column(name = "bank_account_name")
	private String bankAccountName;


	/**
	 * 获取转出地利宝账户id
	 *
	 * @return account_id - 转出地利宝账户id
	 */
	public Long getAccountId() {
		return accountId;
	}

	/**
	 * 设置转出地利宝账户id
	 *
	 * @param accountId 转出地利宝账户id
	 */
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	/**
	 * 获取银行卡对应的银行渠道Id
	 *
	 * @return channel_id - 银行卡对应的银行渠道Id
	 */
	public Long getChannelId() {
		return channelId;
	}

	/**
	 * 设置银行卡对应的银行渠道Id
	 *
	 * @param channelId 银行卡对应的银行渠道Id
	 */
	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}

	/**
	 * 获取银行卡号
	 *
	 * @return bank_card_number - 银行卡号
	 */
	public String getBankCardNumber() {
		return bankCardNumber;
	}

	/**
	 * 设置银行卡号
	 *
	 * @param bankCardNumber 银行卡号
	 */
	public void setBankCardNumber(String bankCardNumber) {
		this.bankCardNumber = bankCardNumber;
	}

	/**
	 * 获取银行卡账户名
	 *
	 * @return bank_account_name - 银行卡账户名
	 */
	public String getBankAccountName() {
		return bankAccountName;
	}

	/**
	 * 设置银行卡账户名
	 *
	 * @param bankAccountName 银行卡账户名
	 */
	public void setBankAccountName(String bankAccountName) {
		this.bankAccountName = bankAccountName;
	}

}