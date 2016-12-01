package com.xhyan.zero.common.domain;

import com.xhyan.zero.common.base.BaseDomain;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "withdraw")
public class Withdraw extends BaseDomain {

	/**
	 * 提款账号id
	 */
	@Column(name = "account_id")
	private Long accountId;

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
	 * 支付方式id
	 */
	@Column(name = "payment_type_id")
	private Long paymentTypeId;

	/**
	 * 渠道支付记录
	 */
	@Column(name = "channel_type_id")
	private Long channelTypeId;

	/**
	 * 通道ID
	 */
	@Column(name = "channel_id")
	private Long channelId;

	/**
	 * 银行名称
	 */
	@Column(name = "bank_name")
	private String bankName;

	/**
	 * 银行卡开户名
	 */
	@Column(name = "bank_customer_name")
	private String bankCustomerName;

	/**
	 * 银行卡号
	 */
	@Column(name = "bank_number")
	private String bankNumber;

	/**
	 * 名称/备注
	 */
	private String name;

	/**
	 * 取款金额
	 */
	private Long amount;

	/**
	 * 提现状态,1成功,2失败,3平台处理中,4银行处理中
	 */
	private Byte status;

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
}