package com.xhyan.zero.common.domain;

import javax.persistence.Column;
import javax.persistence.Table;

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


	/**
	 * 获取交易号
	 *
	 * @return trade_id - 交易号
	 */
	public Long getTradeId() {
		return tradeId;
	}

	/**
	 * 设置交易号
	 *
	 * @param tradeId 交易号
	 */
	public void setTradeId(Long tradeId) {
		this.tradeId = tradeId;
	}

	/**
	 * 获取发生的商户Id
	 *
	 * @return occurred_partner_id - 发生的商户Id
	 */
	public Long getOccurredPartnerId() {
		return occurredPartnerId;
	}

	/**
	 * 设置发生的商户Id
	 *
	 * @param occurredPartnerId 发生的商户Id
	 */
	public void setOccurredPartnerId(Long occurredPartnerId) {
		this.occurredPartnerId = occurredPartnerId;
	}

	/**
	 * 获取退款方(account_id)
	 *
	 * @return refund_account_id - 退款方(account_id)
	 */
	public Long getRefundAccountId() {
		return refundAccountId;
	}

	/**
	 * 设置退款方(account_id)
	 *
	 * @param refundAccountId 退款方(account_id)
	 */
	public void setRefundAccountId(Long refundAccountId) {
		this.refundAccountId = refundAccountId;
	}

	/**
	 * 获取收款方(account_id)
	 *
	 * @return payee_account_id - 收款方(account_id)
	 */
	public Long getPayeeAccountId() {
		return payeeAccountId;
	}

	/**
	 * 设置收款方(account_id)
	 *
	 * @param payeeAccountId 收款方(account_id)
	 */
	public void setPayeeAccountId(Long payeeAccountId) {
		this.payeeAccountId = payeeAccountId;
	}

	/**
	 * 获取退款名称
	 *
	 * @return refund_name - 退款名称
	 */
	public String getRefundName() {
		return refundName;
	}

	/**
	 * 设置退款名称
	 *
	 * @param refundName 退款名称
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
	 * 获取退款状态(1:已受理,2:处理中,3:失败,0:已退款)
	 *
	 * @return refund_status - 退款状态(1:已受理,2:处理中,3:失败,0:已退款)
	 */
	public Byte getRefundStatus() {
		return refundStatus;
	}

	/**
	 * 设置退款状态(1:已受理,2:处理中,3:失败,0:已退款)
	 *
	 * @param refundStatus 退款状态(1:已受理,2:处理中,3:失败,0:已退款)
	 */
	public void setRefundStatus(Byte refundStatus) {
		this.refundStatus = refundStatus;
	}

}