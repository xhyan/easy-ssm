package com.xhyan.zero.common.domain;

import com.xhyan.zero.common.base.BaseDomain;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Data
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

}