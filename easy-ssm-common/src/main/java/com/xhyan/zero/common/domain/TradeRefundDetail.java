package com.xhyan.zero.common.domain;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "trade_refund_detail")
public class TradeRefundDetail extends BaseDomain {


	/**
	 * 关联交易号ID(trade.id)
	 */
	@Column(name = "trade_id")
	private Long tradeId;

	/**
	 * 关联交易支付ID
	 */
	@Column(name = "pament_id")
	private Long pamentId;

	/**
	 * 交易退款id
	 */
	@Column(name = "refund_id")
	private Long refundId;

	/**
	 * 退款账户id(冗余)
	 */
	@Column(name = "refund_account_id")
	private Long refundAccountId;

	/**
	 * 退款名称(冗余)
	 */
	@Column(name = "refund_name")
	private String refundName;

	/**
	 * 退款金额
	 */
	@Column(name = "refund_amount")
	private Long refundAmount;

	/**
	 * 退款渠道id
	 */
	@Column(name = "refund_channel_id")
	private Long refundChannelId;

	/**
	 * 退款渠道名称(冗余)
	 */
	@Column(name = "refund_channel_name")
	private String refundChannelName;

	/**
	 * 通道id
	 */
	@Column(name = "refund_pipeline_id")
	private Long refundPipelineId;

	/**
	 * 退款状态(1:已受理,2:处理中,3:失败,0:成功)
	 */
	@Column(name = "refund_status")
	private Byte refundStatus;

	/**
	 * 失败原因
	 */
	@Column(name = "error_reason")
	private String errorReason;

	/**
	 * 提交渠道处理时间
	 */
	@Column(name = "gmt_sumbit_channel")
	private Date gmtSumbitChannel;


	/**
	 * 获取关联交易号ID(trade.id)
	 *
	 * @return trade_id - 关联交易号ID(trade.id)
	 */
	public Long getTradeId() {
		return tradeId;
	}

	/**
	 * 设置关联交易号ID(trade.id)
	 *
	 * @param tradeId 关联交易号ID(trade.id)
	 */
	public void setTradeId(Long tradeId) {
		this.tradeId = tradeId;
	}

	/**
	 * 获取关联交易支付ID
	 *
	 * @return pament_id - 关联交易支付ID
	 */
	public Long getPamentId() {
		return pamentId;
	}

	/**
	 * 设置关联交易支付ID
	 *
	 * @param pamentId 关联交易支付ID
	 */
	public void setPamentId(Long pamentId) {
		this.pamentId = pamentId;
	}

	/**
	 * 获取交易退款id
	 *
	 * @return refund_id - 交易退款id
	 */
	public Long getRefundId() {
		return refundId;
	}

	/**
	 * 设置交易退款id
	 *
	 * @param refundId 交易退款id
	 */
	public void setRefundId(Long refundId) {
		this.refundId = refundId;
	}

	/**
	 * 获取退款账户id(冗余)
	 *
	 * @return refund_account_id - 退款账户id(冗余)
	 */
	public Long getRefundAccountId() {
		return refundAccountId;
	}

	/**
	 * 设置退款账户id(冗余)
	 *
	 * @param refundAccountId 退款账户id(冗余)
	 */
	public void setRefundAccountId(Long refundAccountId) {
		this.refundAccountId = refundAccountId;
	}

	/**
	 * 获取退款名称(冗余)
	 *
	 * @return refund_name - 退款名称(冗余)
	 */
	public String getRefundName() {
		return refundName;
	}

	/**
	 * 设置退款名称(冗余)
	 *
	 * @param refundName 退款名称(冗余)
	 */
	public void setRefundName(String refundName) {
		this.refundName = refundName;
	}

	/**
	 * 获取退款金额
	 *
	 * @return refund_amount - 退款金额
	 */
	public Long getRefundAmount() {
		return refundAmount;
	}

	/**
	 * 设置退款金额
	 *
	 * @param refundAmount 退款金额
	 */
	public void setRefundAmount(Long refundAmount) {
		this.refundAmount = refundAmount;
	}

	/**
	 * 获取退款渠道id
	 *
	 * @return refund_channel_id - 退款渠道id
	 */
	public Long getRefundChannelId() {
		return refundChannelId;
	}

	/**
	 * 设置退款渠道id
	 *
	 * @param refundChannelId 退款渠道id
	 */
	public void setRefundChannelId(Long refundChannelId) {
		this.refundChannelId = refundChannelId;
	}

	/**
	 * 获取退款渠道名称(冗余)
	 *
	 * @return refund_channel_name - 退款渠道名称(冗余)
	 */
	public String getRefundChannelName() {
		return refundChannelName;
	}

	/**
	 * 设置退款渠道名称(冗余)
	 *
	 * @param refundChannelName 退款渠道名称(冗余)
	 */
	public void setRefundChannelName(String refundChannelName) {
		this.refundChannelName = refundChannelName;
	}

	/**
	 * 获取通道id
	 *
	 * @return refund_pipeline_id - 通道id
	 */
	public Long getRefundPipelineId() {
		return refundPipelineId;
	}

	/**
	 * 设置通道id
	 *
	 * @param refundPipelineId 通道id
	 */
	public void setRefundPipelineId(Long refundPipelineId) {
		this.refundPipelineId = refundPipelineId;
	}

	/**
	 * 获取退款状态(1:已受理,2:处理中,3:失败,0:成功)
	 *
	 * @return refund_status - 退款状态(1:已受理,2:处理中,3:失败,0:成功)
	 */
	public Byte getRefundStatus() {
		return refundStatus;
	}

	/**
	 * 设置退款状态(1:已受理,2:处理中,3:失败,0:成功)
	 *
	 * @param refundStatus 退款状态(1:已受理,2:处理中,3:失败,0:成功)
	 */
	public void setRefundStatus(Byte refundStatus) {
		this.refundStatus = refundStatus;
	}

	/**
	 * 获取失败原因
	 *
	 * @return error_reason - 失败原因
	 */
	public String getErrorReason() {
		return errorReason;
	}

	/**
	 * 设置失败原因
	 *
	 * @param errorReason 失败原因
	 */
	public void setErrorReason(String errorReason) {
		this.errorReason = errorReason;
	}

	/**
	 * 获取提交渠道处理时间
	 *
	 * @return gmt_sumbit_channel - 提交渠道处理时间
	 */
	public Date getGmtSumbitChannel() {
		return gmtSumbitChannel;
	}

	/**
	 * 设置提交渠道处理时间
	 *
	 * @param gmtSumbitChannel 提交渠道处理时间
	 */
	public void setGmtSumbitChannel(Date gmtSumbitChannel) {
		this.gmtSumbitChannel = gmtSumbitChannel;
	}

}