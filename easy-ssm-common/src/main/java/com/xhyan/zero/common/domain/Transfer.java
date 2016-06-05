package com.xhyan.zero.common.domain;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "transfer")
public class Transfer extends BaseDomain {


	/**
	 * 转出方id
	 */
	@Column(name = "src_account_id")
	private Long srcAccountId;

	/**
	 * 转入方id
	 */
	@Column(name = "des_account_id")
	private Long desAccountId;

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
	 * 转账金额
	 */
	private Long amount;

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
	 * 获取转出方id
	 *
	 * @return src_account_id - 转出方id
	 */
	public Long getSrcAccountId() {
		return srcAccountId;
	}

	/**
	 * 设置转出方id
	 *
	 * @param srcAccountId 转出方id
	 */
	public void setSrcAccountId(Long srcAccountId) {
		this.srcAccountId = srcAccountId;
	}

	/**
	 * 获取转入方id
	 *
	 * @return des_account_id - 转入方id
	 */
	public Long getDesAccountId() {
		return desAccountId;
	}

	/**
	 * 设置转入方id
	 *
	 * @param desAccountId 转入方id
	 */
	public void setDesAccountId(Long desAccountId) {
		this.desAccountId = desAccountId;
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
	 * 获取转账金额
	 *
	 * @return amount - 转账金额
	 */
	public Long getAmount() {
		return amount;
	}

	/**
	 * 设置转账金额
	 *
	 * @param amount 转账金额
	 */
	public void setAmount(Long amount) {
		this.amount = amount;
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