package com.xhyan.zero.common.domain;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "deposit_refund")
public class DepositRefund extends BaseDomain {


	/**
	 * 渠道充值记录id
	 */
	@Column(name = "deposit_id")
	private Long depositId;

	/**
	 * 账户id
	 */
	@Column(name = "account_id")
	private Long accountId;

	/**
	 * 渠道id
	 */
	@Column(name = "channel_id")
	private Long channelId;

	/**
	 * 通道ID
	 */
	@Column(name = "pipeline_id")
	private Long pipelineId;

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
	 * 充值退回状态：1成功2失败3处理中
	 */
	private Byte status;


	/**
	 * 获取渠道充值记录id
	 *
	 * @return deposit_id - 渠道充值记录id
	 */
	public Long getDepositId() {
		return depositId;
	}

	/**
	 * 设置渠道充值记录id
	 *
	 * @param depositId 渠道充值记录id
	 */
	public void setDepositId(Long depositId) {
		this.depositId = depositId;
	}

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
	 * 获取 通道ID
	 *
	 * @return pipeline_id -  通道ID
	 */
	public Long getPipelineId() {
		return pipelineId;
	}

	/**
	 * 设置 通道ID
	 *
	 * @param pipelineId 通道ID
	 */
	public void setPipelineId(Long pipelineId) {
		this.pipelineId = pipelineId;
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
	 * 获取充值退回状态：1成功2失败3处理中
	 *
	 * @return status - 充值退回状态：1成功2失败3处理中
	 */
	public Byte getStatus() {
		return status;
	}

	/**
	 * 设置充值退回状态：1成功2失败3处理中
	 *
	 * @param status 充值退回状态：1成功2失败3处理中
	 */
	public void setStatus(Byte status) {
		this.status = status;
	}

}