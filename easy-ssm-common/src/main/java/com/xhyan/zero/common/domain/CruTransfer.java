package com.xhyan.zero.common.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "cru_transfer")
public class CruTransfer extends BaseDomain {
	/**
	 * 转账类型(3:转账到地利宝4:转账到银行卡)
	 */
	@Column(name = "transfer_type")
	private Integer transferType;

	/**
	 * 账户类型(1:个人账户2：企业账户3：商户账户)
	 */
	@Column(name = "account_type")
	private Integer accountType;

	/**
	 * 日转账额度
	 */
	@Column(name = "daily_amount")
	private Long dailyAmount;

	/**
	 * 日免手续费额度
	 */
	@Column(name = "daily_free_amount")
	private Long dailyFreeAmount;

	/**
	 * 每笔最低转账金额
	 */
	@Column(name = "each_min_amount")
	private Long eachMinAmount;

	/**
	 * 每笔最低手续费
	 */
	@Column(name = "each_min_fee")
	private Long eachMinFee;

	/**
	 * 每笔最高手续费
	 */
	@Column(name = "each_max_fee")
	private Long eachMaxFee;

	/**
	 * 手续费率
	 */
	@Column(name = "fee_percent")
	private String feePercent;
}