package com.xhyan.zero.common.domain;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "deposit")
public class Deposit extends BaseDomain {


	/**
	 * 账户id
	 */
	@Column(name = "account_id")
	private Long accountId;

	/**
	 * 支付方式id
	 */
	@Column(name = "payment_type_id")
	private Long paymentTypeId;

	/**
	 * 渠道id
	 */
	@Column(name = "channel_id")
	private Long channelId;

	/**
	 * 通道ID(充值成功后写入)
	 */
	@Column(name = "pipeline_id")
	private Long pipelineId;

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
	 * 名称
	 */
	private String name;

	/**
	 * 充值金额
	 */
	private Long amount;

	/**
	 * 交易日
	 */
	@Column(name = "trade_date")
	private Date tradeDate;

	/**
	 * 充值状态,1成功,2失败,3处理中
	 */
	private Byte status;

	/**
	 * 商户的充值成功回调url
	 */
	@Column(name = "notify_url")
	private String notifyUrl;


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
	 * 获取渠道id
	 *
	 * @return channel_id - 渠道id
	 */
	public Long getChannelId() {
		return channelId;
	}

	/**
	 * 设置渠道id
	 *
	 * @param channelId 渠道id
	 */
	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}

	/**
	 * 获取通道ID(充值成功后写入)
	 *
	 * @return pipeline_id - 通道ID(充值成功后写入)
	 */
	public Long getPipelineId() {
		return pipelineId;
	}

	/**
	 * 设置通道ID(充值成功后写入)
	 *
	 * @param pipelineId 通道ID(充值成功后写入)
	 */
	public void setPipelineId(Long pipelineId) {
		this.pipelineId = pipelineId;
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
	 * 获取名称
	 *
	 * @return name - 名称
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置名称
	 *
	 * @param name 名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取充值金额
	 *
	 * @return amount - 充值金额
	 */
	public Long getAmount() {
		return amount;
	}

	/**
	 * 设置充值金额
	 *
	 * @param amount 充值金额
	 */
	public void setAmount(Long amount) {
		this.amount = amount;
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

	/**
	 * 获取充值状态,1成功,2失败,3处理中
	 *
	 * @return status - 充值状态,1成功,2失败,3处理中
	 */
	public Byte getStatus() {
		return status;
	}

	/**
	 * 设置充值状态,1成功,2失败,3处理中
	 *
	 * @param status 充值状态,1成功,2失败,3处理中
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

}