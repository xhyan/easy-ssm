package com.xhyan.zero.common.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;


@Data
@Table(name = "trade_refund")
public class TradeRefund extends BaseDomain {

	/**
	 * 交易号
	 */
	@Column(name = "trade_id")
	private Long tradeId;

	/**
	 * 发生的商户Id
	 */
	@Column(name = "occurred_partner_id")
	private Long occurredPartnerId;

	/**
	 * 退款方(account_id)
	 */
	@Column(name = "refund_account_id")
	private Long refundAccountId;

	/**
	 * 收款方(account_id)
	 */
	@Column(name = "payee_account_id")
	private Long payeeAccountId;

	/**
	 * 退款名称
	 */
	@Column(name = "refund_name")
	private String refundName;

	/**
	 * 退款金额
	 */
	@Column(name = "refund_amount")
	private Long refundAmount;

	/**
	 * 退款状态(1:已受理,2:处理中,3:失败,0:已退款)
	 */
	@Column(name = "refund_status")
	private Byte refundStatus;

}