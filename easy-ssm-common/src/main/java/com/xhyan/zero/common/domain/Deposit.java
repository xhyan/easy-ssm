package com.xhyan.zero.common.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Data
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
}