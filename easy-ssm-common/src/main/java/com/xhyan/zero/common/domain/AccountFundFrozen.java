package com.xhyan.zero.common.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "account_fund_frozen")
public class AccountFundFrozen extends BaseDomain {
	/**
	 * 帐户的id
	 */
	@Column(name = "account_id")
	private Long accountId;

	/**
	 * 业务编号id(old-out_biz_no)
	 */
	@Column(name = "biz_num")
	private Long bizNum;

	/**
	 * 业务类型(biz_type.id)
	 */
	@Column(name = "biz_type")
	private Byte bizType;

	/**
	 * 冻结解冻的金额
	 */
	private Long amount;

	/**
	 * 使用信用额度
	 */
	@Column(name = "credit_amount")
	private Long creditAmount;

	/**
	 * 冻结状态:1冻结 2解冻
	 */
	@Column(name = "freeze_status")
	private Byte freezeStatus;

	/**
	 * 冻结时间
	 */
	@Column(name = "freeze_date")
	private Date freezeDate;

	/**
	 * 解冻时间
	 */
	@Column(name = "unfreeze_date")
	private Date unfreezeDate;

	/**
	 * 冻结交易日
	 */
	@Column(name = "freeze_trade_date")
	private Date freezeTradeDate;

	/**
	 * 解冻交易日
	 */
	@Column(name = "unfreeze_trade_date")
	private Date unfreezeTradeDate;

	/**
	 * 备注
	 */
	private String remark;

	/**
	 * 获取帐户的id
	 *
	 * @return account_id - 帐户的id
	 */
	public Long getAccountId() {
		return accountId;
	}

	/**
	 * 设置帐户的id
	 *
	 * @param accountId 帐户的id
	 */
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

}