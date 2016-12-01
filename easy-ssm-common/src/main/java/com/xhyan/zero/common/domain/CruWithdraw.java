package com.xhyan.zero.common.domain;

import com.xhyan.zero.common.base.BaseDomain;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "cru_withdraw")
public class CruWithdraw extends BaseDomain {


	/**
	 * 账户类型(1:个人账户2：企业账户3：商户账户)
	 */
	@Column(name = "account_type")
	private Integer accountType;

	/**
	 * 规则名(不再使用)
	 */
	private String name;

	/**
	 * 备注(不再使用)
	 */
	private String comment;

	/**
	 * 日提现额度
	 */
	@Column(name = "daily_amount")
	private Long dailyAmount;

	/**
	 * 最低提现金额
	 */
	@Column(name = "min_amount")
	private Long minAmount;

	/**
	 * 日提现次数
	 */
	private Integer times;

}