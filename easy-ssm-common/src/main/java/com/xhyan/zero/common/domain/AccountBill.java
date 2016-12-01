package com.xhyan.zero.common.domain;

import com.xhyan.zero.common.base.BaseDomain;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "account_bill")
public class AccountBill extends BaseDomain {
	/**
	 * 关联账户主表id
	 */
	@Column(name = "account_id")
	private Long accountId;

	/**
	 * 流水发生的商户id
	 */
	@Column(name = "occurred_partner_id")
	private Long occurredPartnerId;

	/**
	 * 渠道账号 (如:银行卡号,支付宝账号,地利宝资金账号；根据channel_id确定)
	 */
	@Column(name = "channel_account")
	private String channelAccount;

	/**
	 * 业务类型(关联biz_type.id)
	 */
	@Column(name = "biz_type")
	private Long bizType;

	/**
	 * 业务编号(充值id,提现id,转账id)
	 */
	@Column(name = "biz_num")
	private Long bizNum;

	/**
	 * 流水类型:1收入,2支出
	 */
	private Byte type;

	/**
	 * 渠道ID
	 */
	@Column(name = "channel_id")
	private Long channelId;

	/**
	 * 通道ID
	 */
	@Column(name = "pipeline_id")
	private Long pipelineId;

	/**
	 * 流水备注
	 */
	private String name;

	/**
	 * 发生金额，单位：分
	 */
	private Long amount;

	/**
	 * 账户当前余额，单位：分
	 */
	@Column(name = "current_amount")
	private Long currentAmount;

	/**
	 * 记账日(日切相关,对账时使用)
	 */
	@Column(name = "trade_date")
	private Date tradeDate;

	/**
	 * 备注
	 */
	private String memo;
}