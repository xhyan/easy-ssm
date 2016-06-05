package com.xhyan.zero.common.domain;

import javax.persistence.Column;
import javax.persistence.Table;

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


	/**
	 * 获取转账类型(3:转账到地利宝4:转账到银行卡)
	 *
	 * @return transfer_type - 转账类型(3:转账到地利宝4:转账到银行卡)
	 */
	public Integer getTransferType() {
		return transferType;
	}

	/**
	 * 设置转账类型(3:转账到地利宝4:转账到银行卡)
	 *
	 * @param transferType 转账类型(3:转账到地利宝4:转账到银行卡)
	 */
	public void setTransferType(Integer transferType) {
		this.transferType = transferType;
	}

	/**
	 * 获取账户类型(1:个人账户2：企业账户3：商户账户)
	 *
	 * @return account_type - 账户类型(1:个人账户2：企业账户3：商户账户)
	 */
	public Integer getAccountType() {
		return accountType;
	}

	/**
	 * 设置账户类型(1:个人账户2：企业账户3：商户账户)
	 *
	 * @param accountType 账户类型(1:个人账户2：企业账户3：商户账户)
	 */
	public void setAccountType(Integer accountType) {
		this.accountType = accountType;
	}

	/**
	 * 获取日转账额度
	 *
	 * @return daily_amount - 日转账额度
	 */
	public Long getDailyAmount() {
		return dailyAmount;
	}

	/**
	 * 设置日转账额度
	 *
	 * @param dailyAmount 日转账额度
	 */
	public void setDailyAmount(Long dailyAmount) {
		this.dailyAmount = dailyAmount;
	}

	/**
	 * 获取日免手续费额度
	 *
	 * @return daily_free_amount - 日免手续费额度
	 */
	public Long getDailyFreeAmount() {
		return dailyFreeAmount;
	}

	/**
	 * 设置日免手续费额度
	 *
	 * @param dailyFreeAmount 日免手续费额度
	 */
	public void setDailyFreeAmount(Long dailyFreeAmount) {
		this.dailyFreeAmount = dailyFreeAmount;
	}

	/**
	 * 获取每笔最低转账金额
	 *
	 * @return each_min_amount - 每笔最低转账金额
	 */
	public Long getEachMinAmount() {
		return eachMinAmount;
	}

	/**
	 * 设置每笔最低转账金额
	 *
	 * @param eachMinAmount 每笔最低转账金额
	 */
	public void setEachMinAmount(Long eachMinAmount) {
		this.eachMinAmount = eachMinAmount;
	}

	/**
	 * 获取每笔最低手续费
	 *
	 * @return each_min_fee - 每笔最低手续费
	 */
	public Long getEachMinFee() {
		return eachMinFee;
	}

	/**
	 * 设置每笔最低手续费
	 *
	 * @param eachMinFee 每笔最低手续费
	 */
	public void setEachMinFee(Long eachMinFee) {
		this.eachMinFee = eachMinFee;
	}

	/**
	 * 获取每笔最高手续费
	 *
	 * @return each_max_fee - 每笔最高手续费
	 */
	public Long getEachMaxFee() {
		return eachMaxFee;
	}

	/**
	 * 设置每笔最高手续费
	 *
	 * @param eachMaxFee 每笔最高手续费
	 */
	public void setEachMaxFee(Long eachMaxFee) {
		this.eachMaxFee = eachMaxFee;
	}

	/**
	 * 获取手续费率
	 *
	 * @return fee_percent - 手续费率
	 */
	public String getFeePercent() {
		return feePercent;
	}

	/**
	 * 设置手续费率
	 *
	 * @param feePercent 手续费率
	 */
	public void setFeePercent(String feePercent) {
		this.feePercent = feePercent;
	}
}