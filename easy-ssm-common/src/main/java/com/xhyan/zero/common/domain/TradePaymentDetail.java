package com.xhyan.zero.common.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "trade_payment_detail")
public class TradePaymentDetail extends BaseDomain {

	/**
	 * 关联交易号ID(trade.id)
	 */
	@Column(name = "trade_id")
	private Long tradeId;

	/**
	 * 支付记录id
	 */
	@Column(name = "payment_id")
	private Long paymentId;

	/**
	 * 渠道(支付)账号(地利宝账号，支付宝账号，微信账号，银行卡等)
	 */
	@Column(name = "channel_account")
	private String channelAccount;

	/**
	 * 渠道id(channel.id)
	 */
	@Column(name = "channel_id")
	private Long channelId;

	/**
	 * 通道ID
	 */
	@Column(name = "pipeline_id")
	private Long pipelineId;

	/**
	 * 退款渠道名称(冗余)
	 */
	@Column(name = "channel_name")
	private String channelName;

	/**
	 * 金额
	 */
	private Long amount;

	/**
	 * 状态:1待付款,2付款成功,3付款失败
	 */
	private Byte status;
}