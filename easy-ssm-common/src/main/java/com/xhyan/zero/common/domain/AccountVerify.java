package com.xhyan.zero.common.domain;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "account_verify")
public class AccountVerify extends BaseDomain {
	/**
	 * 账户id
	 */
	@Column(name = "account_id")
	private Long accountId;

	/**
	 * 手机号
	 */
	private String mobile;

	/**
	 * 业务编码，每种业务有唯一的编码？？？
	 */
	@Column(name = "business_code")
	private Integer businessCode;

	/**
	 * 随机码
	 */
	@Column(name = "random_code")
	private String randomCode;

	/**
	 * 最后有效时间
	 */
	private Date priod;

	/**
	 * 验证码状态：1表示未使用 2表示已使用
	 */
	private Integer status;

	/**
	 * 获取账户id
	 *
	 * @return account_id - 账户id
	 */
	public Long getAccountId() {
		return accountId;
	}

	/**
	 * 设置账户id
	 *
	 * @param accountId 账户id
	 */
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	/**
	 * 获取手机号
	 *
	 * @return mobile - 手机号
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * 设置手机号
	 *
	 * @param mobile 手机号
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * 获取业务编码，每种业务有唯一的编码？？？
	 *
	 * @return business_code - 业务编码，每种业务有唯一的编码？？？
	 */
	public Integer getBusinessCode() {
		return businessCode;
	}

	/**
	 * 设置业务编码，每种业务有唯一的编码？？？
	 *
	 * @param businessCode 业务编码，每种业务有唯一的编码？？？
	 */
	public void setBusinessCode(Integer businessCode) {
		this.businessCode = businessCode;
	}

	/**
	 * 获取随机码
	 *
	 * @return random_code - 随机码
	 */
	public String getRandomCode() {
		return randomCode;
	}

	/**
	 * 设置随机码
	 *
	 * @param randomCode 随机码
	 */
	public void setRandomCode(String randomCode) {
		this.randomCode = randomCode;
	}

	/**
	 * 获取最后有效时间
	 *
	 * @return priod - 最后有效时间
	 */
	public Date getPriod() {
		return priod;
	}

	/**
	 * 设置最后有效时间
	 *
	 * @param priod 最后有效时间
	 */
	public void setPriod(Date priod) {
		this.priod = priod;
	}

	/**
	 * 获取验证码状态：1表示未使用 2表示已使用
	 *
	 * @return status - 验证码状态：1表示未使用 2表示已使用
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * 设置验证码状态：1表示未使用 2表示已使用
	 *
	 * @param status 验证码状态：1表示未使用 2表示已使用
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
}