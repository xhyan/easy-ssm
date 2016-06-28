package com.xhyan.zero.common.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "cru_account_withdraw")
public class CruAccountWithdraw extends BaseDomain {


	/**
	 * 账户Id
	 */
	@Column(name = "account_id")
	private Long accountId;

	/**
	 * 账户类型(冗余字段),与account.type相同
	 */
	@Column(name = "cru_account_type")
	private Byte cruAccountType;

	/**
	 * 日提现额度
	 */
	@Column(name = "daily_amount")
	private Long dailyAmount;

	/**
	 * 每笔最低提现金额
	 */
	@Column(name = "each_min_amount")
	private Long eachMinAmount;

	/**
	 * 日提现次数
	 */
	@Column(name = "daily_times")
	private Integer dailyTimes;
	/**
	 * 状态(1:生效2:失效)
	 */
	private Integer status;

}