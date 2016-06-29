package com.xhyan.zero.common.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Data
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
}