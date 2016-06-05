package com.xhyan.zero.common.domain;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "withdraw")
public class Withdraw extends BaseDomain {

	/**
	 * 提款账号id
	 */
	@Column(name = "account_id")
	private Long accountId;

	/**
	 * 外部业务流水号
	 */
	@Column(name = "out_biz_no")
	private String outBizNo;

	/**
	 * 流水发生的商户id
	 */
	@Column(name = "occurred_partner_id")
	private Long occurredPartnerId;

	/**
	 * 支付方式id
	 */
	@Column(name = "payment_type_id")
	private Long paymentTypeId;

	/**
	 * 渠道支付记录
	 */
	@Column(name = "channel_type_id")
	private Long channelTypeId;

	/**
	 * 通道ID
	 */
	@Column(name = "channel_id")
	private Long channelId;

	/**
	 * 银行名称
	 */
	@Column(name = "bank_name")
	private String bankName;

	/**
	 * 银行卡开户名
	 */
	@Column(name = "bank_customer_name")
	private String bankCustomerName;

	/**
	 * 银行卡号
	 */
	@Column(name = "bank_number")
	private String bankNumber;

	/**
	 * 名称/备注
	 */
	private String name;

	/**
	 * 取款金额
	 */
	private Long amount;

	/**
	 * 提现状态,1成功,2失败,3平台处理中,4银行处理中
	 */
	private Byte status;

	/**
	 * 商户的充值成功回调url
	 */
	@Column(name = "notify_url")
	private String notifyUrl;

	/**
	 * 交易日
	 */
	@Column(name = "trade_date")
	private Date tradeDate;


	/**
	 * 获取提款账号id
	 *
	 * @return account_id - 提款账号id
	 */
	public Long getAccountId() {
		return accountId;
	}

	/**
	 * 设置提款账号id
	 *
	 * @param accountId 提款账号id
	 */
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	/**
	 * 获取外部业务流水号
	 *
	 * @return out_biz_no - 外部业务流水号
	 */
	public String getOutBizNo() {
		return outBizNo;
	}

	/**
	 * 设置外部业务流水号
	 *
	 * @param outBizNo 外部业务流水号
	 */
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	/**
	 * 获取流水发生的商户id
	 *
	 * @return occurred_partner_id - 流水发生的商户id
	 */
	public Long getOccurredPartnerId() {
		return occurredPartnerId;
	}

	/**
	 * 设置流水发生的商户id
	 *
	 * @param occurredPartnerId 流水发生的商户id
	 */
	public void setOccurredPartnerId(Long occurredPartnerId) {
		this.occurredPartnerId = occurredPartnerId;
	}

	/**
	 * 获取支付方式id
	 *
	 * @return payment_type_id - 支付方式id
	 */
	public Long getPaymentTypeId() {
		return paymentTypeId;
	}

	/**
	 * 设置支付方式id
	 *
	 * @param paymentTypeId 支付方式id
	 */
	public void setPaymentTypeId(Long paymentTypeId) {
		this.paymentTypeId = paymentTypeId;
	}

	/**
	 * 获取渠道支付记录
	 *
	 * @return channel_type_id - 渠道支付记录
	 */
	public Long getChannelTypeId() {
		return channelTypeId;
	}

	/**
	 * 设置渠道支付记录
	 *
	 * @param channelTypeId 渠道支付记录
	 */
	public void setChannelTypeId(Long channelTypeId) {
		this.channelTypeId = channelTypeId;
	}

	/**
	 * 获取通道ID
	 *
	 * @return channel_id - 通道ID
	 */
	public Long getChannelId() {
		return channelId;
	}

	/**
	 * 设置通道ID
	 *
	 * @param channelId 通道ID
	 */
	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}

	/**
	 * 获取银行名称
	 *
	 * @return bank_name - 银行名称
	 */
	public String getBankName() {
		return bankName;
	}

	/**
	 * 设置银行名称
	 *
	 * @param bankName 银行名称
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	/**
	 * 获取银行卡开户名
	 *
	 * @return bank_customer_name - 银行卡开户名
	 */
	public String getBankCustomerName() {
		return bankCustomerName;
	}

	/**
	 * 设置银行卡开户名
	 *
	 * @param bankCustomerName 银行卡开户名
	 */
	public void setBankCustomerName(String bankCustomerName) {
		this.bankCustomerName = bankCustomerName;
	}

	/**
	 * 获取银行卡号
	 *
	 * @return bank_number - 银行卡号
	 */
	public String getBankNumber() {
		return bankNumber;
	}

	/**
	 * 设置银行卡号
	 *
	 * @param bankNumber 银行卡号
	 */
	public void setBankNumber(String bankNumber) {
		this.bankNumber = bankNumber;
	}

	/**
	 * 获取名称/备注
	 *
	 * @return name - 名称/备注
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置名称/备注
	 *
	 * @param name 名称/备注
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取取款金额
	 *
	 * @return amount - 取款金额
	 */
	public Long getAmount() {
		return amount;
	}

	/**
	 * 设置取款金额
	 *
	 * @param amount 取款金额
	 */
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	/**
	 * 获取提现状态,1成功,2失败,3平台处理中,4银行处理中
	 *
	 * @return status - 提现状态,1成功,2失败,3平台处理中,4银行处理中
	 */
	public Byte getStatus() {
		return status;
	}

	/**
	 * 设置提现状态,1成功,2失败,3平台处理中,4银行处理中
	 *
	 * @param status 提现状态,1成功,2失败,3平台处理中,4银行处理中
	 */
	public void setStatus(Byte status) {
		this.status = status;
	}

	/**
	 * 获取商户的充值成功回调url
	 *
	 * @return notify_url - 商户的充值成功回调url
	 */
	public String getNotifyUrl() {
		return notifyUrl;
	}

	/**
	 * 设置商户的充值成功回调url
	 *
	 * @param notifyUrl 商户的充值成功回调url
	 */
	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
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