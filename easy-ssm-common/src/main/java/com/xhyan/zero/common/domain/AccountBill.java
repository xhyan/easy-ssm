package com.xhyan.zero.common.domain;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

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

	/**
	 * 获取关联账户主表id
	 *
	 * @return account_id - 关联账户主表id
	 */
	public Long getAccountId() {
		return accountId;
	}

	/**
	 * 设置关联账户主表id
	 *
	 * @param accountId 关联账户主表id
	 */
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
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
	 * 获取渠道账号 (如:银行卡号,支付宝账号,地利宝资金账号；根据channel_id确定)
	 *
	 * @return channel_account - 渠道账号 (如:银行卡号,支付宝账号,地利宝资金账号；根据channel_id确定)
	 */
	public String getChannelAccount() {
		return channelAccount;
	}

	/**
	 * 设置渠道账号 (如:银行卡号,支付宝账号,地利宝资金账号；根据channel_id确定)
	 *
	 * @param channelAccount 渠道账号 (如:银行卡号,支付宝账号,地利宝资金账号；根据channel_id确定)
	 */
	public void setChannelAccount(String channelAccount) {
		this.channelAccount = channelAccount;
	}

	/**
	 * 获取业务类型(关联biz_type.id)
	 *
	 * @return biz_type - 业务类型(关联biz_type.id)
	 */
	public Long getBizType() {
		return bizType;
	}

	/**
	 * 设置业务类型(关联biz_type.id)
	 *
	 * @param bizType 业务类型(关联biz_type.id)
	 */
	public void setBizType(Long bizType) {
		this.bizType = bizType;
	}

	/**
	 * 获取业务编号(充值id,提现id,转账id)
	 *
	 * @return biz_num - 业务编号(充值id,提现id,转账id)
	 */
	public Long getBizNum() {
		return bizNum;
	}

	/**
	 * 设置业务编号(充值id,提现id,转账id)
	 *
	 * @param bizNum 业务编号(充值id,提现id,转账id)
	 */
	public void setBizNum(Long bizNum) {
		this.bizNum = bizNum;
	}

	/**
	 * 获取流水类型:1收入,2支出
	 *
	 * @return type - 流水类型:1收入,2支出
	 */
	public Byte getType() {
		return type;
	}

	/**
	 * 设置流水类型:1收入,2支出
	 *
	 * @param type 流水类型:1收入,2支出
	 */
	public void setType(Byte type) {
		this.type = type;
	}

	/**
	 * 获取渠道ID
	 *
	 * @return channel_id - 渠道ID
	 */
	public Long getChannelId() {
		return channelId;
	}

	/**
	 * 设置渠道ID
	 *
	 * @param channelId 渠道ID
	 */
	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}

	/**
	 * 获取通道ID
	 *
	 * @return pipeline_id - 通道ID
	 */
	public Long getPipelineId() {
		return pipelineId;
	}

	/**
	 * 设置通道ID
	 *
	 * @param pipelineId 通道ID
	 */
	public void setPipelineId(Long pipelineId) {
		this.pipelineId = pipelineId;
	}

	/**
	 * 获取流水备注
	 *
	 * @return name - 流水备注
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置流水备注
	 *
	 * @param name 流水备注
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取发生金额，单位：分
	 *
	 * @return amount - 发生金额，单位：分
	 */
	public Long getAmount() {
		return amount;
	}

	/**
	 * 设置发生金额，单位：分
	 *
	 * @param amount 发生金额，单位：分
	 */
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	/**
	 * 获取账户当前余额，单位：分
	 *
	 * @return current_amount - 账户当前余额，单位：分
	 */
	public Long getCurrentAmount() {
		return currentAmount;
	}

	/**
	 * 设置账户当前余额，单位：分
	 *
	 * @param currentAmount 账户当前余额，单位：分
	 */
	public void setCurrentAmount(Long currentAmount) {
		this.currentAmount = currentAmount;
	}

	/**
	 * 获取记账日(日切相关,对账时使用)
	 *
	 * @return trade_date - 记账日(日切相关,对账时使用)
	 */
	public Date getTradeDate() {
		return tradeDate;
	}

	/**
	 * 设置记账日(日切相关,对账时使用)
	 *
	 * @param tradeDate 记账日(日切相关,对账时使用)
	 */
	public void setTradeDate(Date tradeDate) {
		this.tradeDate = tradeDate;
	}

	/**
	 * 获取备注
	 *
	 * @return memo - 备注
	 */
	public String getMemo() {
		return memo;
	}

	/**
	 * 设置备注
	 *
	 * @param memo 备注
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}
}