package com.xhyan.zero.common.domain;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "trade_status_notify")
public class TradeStatusNotify extends BaseDomain {

	/**
	 * 交易号
	 */
	@Column(name = "trade_id")
	private Long tradeId;

	/**
	 * 外部系统交易号
	 */
	@Column(name = "out_trade_no")
	private String outTradeNo;

	/**
	 * 通知类型(1:支付通知；2:关闭通知；3；完成通知)
	 */
	private Byte type;

	/**
	 * 支付金额(支付通知使用)
	 */
	@Column(name = "pay_amount")
	private Long payAmount;

	/**
	 * 异步通知url
	 */
	@Column(name = "notify_url")
	private String notifyUrl;

	/**
	 * 交易的状态
	 */
	@Column(name = "trade_status")
	private Byte tradeStatus;

	/**
	 * 交易状态改变时间
	 */
	@Column(name = "trade_status_alter_time")
	private Date tradeStatusAlterTime;

	/**
	 * 最近一次同步的时间
	 */
	@Column(name = "notify_time")
	private Date notifyTime;

	/**
	 * 通知状态：1，待同步；2，待重试；3，已同步;4:同步中
	 */
	private Byte status;

	/**
	 * 通知失败的错误原因
	 */
	@Column(name = "fail_reason")
	private String failReason;


	/**
	 * 扩展字段 json格式
	 */
	private String reserved;


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
	 * 获取外部系统交易号
	 *
	 * @return out_trade_no - 外部系统交易号
	 */
	public String getOutTradeNo() {
		return outTradeNo;
	}

	/**
	 * 设置外部系统交易号
	 *
	 * @param outTradeNo 外部系统交易号
	 */
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	/**
	 * 获取通知类型(1:支付通知；2:关闭通知；3；完成通知)
	 *
	 * @return type - 通知类型(1:支付通知；2:关闭通知；3；完成通知)
	 */
	public Byte getType() {
		return type;
	}

	/**
	 * 设置通知类型(1:支付通知；2:关闭通知；3；完成通知)
	 *
	 * @param type 通知类型(1:支付通知；2:关闭通知；3；完成通知)
	 */
	public void setType(Byte type) {
		this.type = type;
	}

	/**
	 * 获取支付金额(支付通知使用)
	 *
	 * @return pay_amount - 支付金额(支付通知使用)
	 */
	public Long getPayAmount() {
		return payAmount;
	}

	/**
	 * 设置支付金额(支付通知使用)
	 *
	 * @param payAmount 支付金额(支付通知使用)
	 */
	public void setPayAmount(Long payAmount) {
		this.payAmount = payAmount;
	}

	/**
	 * 获取异步通知url
	 *
	 * @return notify_url - 异步通知url
	 */
	public String getNotifyUrl() {
		return notifyUrl;
	}

	/**
	 * 设置异步通知url
	 *
	 * @param notifyUrl 异步通知url
	 */
	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	/**
	 * 获取交易的状态
	 *
	 * @return trade_status - 交易的状态
	 */
	public Byte getTradeStatus() {
		return tradeStatus;
	}

	/**
	 * 设置交易的状态
	 *
	 * @param tradeStatus 交易的状态
	 */
	public void setTradeStatus(Byte tradeStatus) {
		this.tradeStatus = tradeStatus;
	}

	/**
	 * 获取交易状态改变时间
	 *
	 * @return trade_status_alter_time - 交易状态改变时间
	 */
	public Date getTradeStatusAlterTime() {
		return tradeStatusAlterTime;
	}

	/**
	 * 设置交易状态改变时间
	 *
	 * @param tradeStatusAlterTime 交易状态改变时间
	 */
	public void setTradeStatusAlterTime(Date tradeStatusAlterTime) {
		this.tradeStatusAlterTime = tradeStatusAlterTime;
	}

	/**
	 * 获取最近一次同步的时间
	 *
	 * @return notify_time - 最近一次同步的时间
	 */
	public Date getNotifyTime() {
		return notifyTime;
	}

	/**
	 * 设置最近一次同步的时间
	 *
	 * @param notifyTime 最近一次同步的时间
	 */
	public void setNotifyTime(Date notifyTime) {
		this.notifyTime = notifyTime;
	}

	/**
	 * 获取通知状态：1，待同步；2，待重试；3，已同步;4:同步中
	 *
	 * @return status - 通知状态：1，待同步；2，待重试；3，已同步;4:同步中
	 */
	public Byte getStatus() {
		return status;
	}

	/**
	 * 设置通知状态：1，待同步；2，待重试；3，已同步;4:同步中
	 *
	 * @param status 通知状态：1，待同步；2，待重试；3，已同步;4:同步中
	 */
	public void setStatus(Byte status) {
		this.status = status;
	}

	/**
	 * 获取通知失败的错误原因
	 *
	 * @return fail_reason - 通知失败的错误原因
	 */
	public String getFailReason() {
		return failReason;
	}

	/**
	 * 设置通知失败的错误原因
	 *
	 * @param failReason 通知失败的错误原因
	 */
	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}


	/**
	 * 获取扩展字段 json格式
	 *
	 * @return reserved - 扩展字段 json格式
	 */
	public String getReserved() {
		return reserved;
	}

	/**
	 * 设置扩展字段 json格式
	 *
	 * @param reserved 扩展字段 json格式
	 */
	public void setReserved(String reserved) {
		this.reserved = reserved;
	}
}