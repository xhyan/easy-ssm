package com.xhyan.zero.common.domain;

import com.xhyan.zero.common.base.BaseDomain;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;


@Data
@Table(name = "trade_payment")
public class TradePayment extends BaseDomain {

	/**
	 * 关联交易号ID(trade.id)
	 */
	@Column(name = "trade_id")
	private Long tradeId;

	/**
	 * 付款账户(account.id)
	 */
	@Column(name = "src_account_id")
	private Long srcAccountId;

	/**
	 * 收款账户(account.id)
	 */
	@Column(name = "des_account_id")
	private Long desAccountId;

	/**
	 * 支付总额
	 */
	private Long amount;

	/**
	 * 使用的余额额度
	 */
	@Column(name = "used_balance")
	private Long usedBalance;

	/**
	 * 使用信用余额
	 */
	@Column(name = "used_credit")
	private Long usedCredit;

	/**
	 * 交易日
	 */
	@Column(name = "trade_date")
	private Date tradeDate;

	/**
	 * 付款备注
	 */
	private String comment;

	/**
	 * 状态:1待付款,2付款成功,3付款失败
	 */
	private Byte status;
}