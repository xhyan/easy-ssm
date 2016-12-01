package com.xhyan.zero.common.domain;

import com.xhyan.zero.common.base.BaseDomain;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Data
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
}