package com.xhyan.zero.common.domain;

import com.xhyan.zero.common.base.BaseDomain;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "pipeline_bill")
public class PipelineBill extends BaseDomain {


	/**
	 * 账户id
	 */
	@Column(name = "account_id")
	private Long accountId;

	/**
	 * 通道账号 (如：银行卡号,支付宝账号,地利宝资金账号；根据channel_id确定)
	 */
	@Column(name = "channel_account")
	private String channelAccount;

	/**
	 * 渠道的id
	 */
	@Column(name = "channel_id")
	private Long channelId;

	/**
	 * 通道ID
	 */
	@Column(name = "pipeline_id")
	private Long pipelineId;

	/**
	 * 发生的商户ID
	 */
	@Column(name = "occurred_partner_id")
	private Long occurredPartnerId;

	/**
	 * 业务编号id(充值id,提现id,转账id等)
	 */
	@Column(name = "biz_num")
	private Long bizNum;

	/**
	 * 业务类型(关联biz_type.id)
	 */
	@Column(name = "biz_type")
	private Long bizType;

	/**
	 * 流水类型:1收入,2支出
	 */
	private Byte type;

	/**
	 * 通道流水号(通道返回)
	 */
	@Column(name = "channel_sn")
	private String channelSn;

	/**
	 * 金额，单位：分
	 */
	private Long amount;

	/**
	 * 记账日(日切相关,对账时使用)
	 */
	@Column(name = "trade_date")
	private Date tradeDate;

	/**
	 * 通道返回的对账日期
	 */
	@Column(name = "settle_date")
	private Date settleDate;

	/**
	 * 通道流水状态:1处理中,2成功,3失败,4取消
	 */
	private Byte status;

	/**
	 * 备注
	 */
	private String memo;
}