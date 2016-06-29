package com.xhyan.zero.common.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Data
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

}