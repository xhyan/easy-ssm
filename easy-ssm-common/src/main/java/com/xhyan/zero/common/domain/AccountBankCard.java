package com.xhyan.zero.common.domain;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "account_bank_card")
public class AccountBankCard extends BaseDomain {
	/**
	 * 账户id
	 */
	@Column(name = "account_id")
	private Long accountId;

	/**
	 * 持卡人姓名
	 */
	private String name;

	/**
	 * 证件类型(1:身份证,2护照)
	 */
	@Column(name = "credential_type")
	private Byte credentialType;

	/**
	 * 证件号
	 */
	@Column(name = "credential_no")
	private String credentialNo;

	/**
	 * 片卡类型:1储蓄卡,2信用卡
	 */
	private Byte type;

	/**
	 * 银行卡号
	 */
	private String number;

	/**
	 * 手机号
	 */
	private String mobile;

	/**
	 * 分支行清算行号(bank_branch.clean_bank_no)
	 */
	@Column(name = "clean_bank_no")
	private String cleanBankNo;

	/**
	 * 开户行所在城市
	 */
	private String city;

	/**
	 * 否是默认银行卡
	 */
	@Column(name = "is_default")
	private Byte isDefault;

	/**
	 * 是否已开通快捷支付,0否，1是
	 */
	@Column(name = "is_quick_payment")
	private Byte isQuickPayment;

	/**
	 * 绑定时间
	 */
	@Column(name = "bind_time")
	private Date bindTime;

	/**
	 * 状态(0，不启用；1，已启用)
	 */
	private Byte status;

	/**
	 * 快捷支付配置信息json串(各通道自行定义结构；如绑定的通道ID,银行用户协议号,银行卡支付协议号)
	 */
	@Column(name = "quick_payment_config_content")
	private String quickPaymentConfigContent;

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
	 * 获取持卡人姓名
	 *
	 * @return name - 持卡人姓名
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置持卡人姓名
	 *
	 * @param name 持卡人姓名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取证件类型(1:身份证,2护照)
	 *
	 * @return credential_type - 证件类型(1:身份证,2护照)
	 */
	public Byte getCredentialType() {
		return credentialType;
	}

	/**
	 * 设置证件类型(1:身份证,2护照)
	 *
	 * @param credentialType 证件类型(1:身份证,2护照)
	 */
	public void setCredentialType(Byte credentialType) {
		this.credentialType = credentialType;
	}

	/**
	 * 获取证件号
	 *
	 * @return credential_no - 证件号
	 */
	public String getCredentialNo() {
		return credentialNo;
	}

	/**
	 * 设置证件号
	 *
	 * @param credentialNo 证件号
	 */
	public void setCredentialNo(String credentialNo) {
		this.credentialNo = credentialNo;
	}

	/**
	 * 获取片卡类型:1储蓄卡,2信用卡
	 *
	 * @return type - 片卡类型:1储蓄卡,2信用卡
	 */
	public Byte getType() {
		return type;
	}

	/**
	 * 设置片卡类型:1储蓄卡,2信用卡
	 *
	 * @param type 片卡类型:1储蓄卡,2信用卡
	 */
	public void setType(Byte type) {
		this.type = type;
	}

	/**
	 * 获取银行卡号
	 *
	 * @return number - 银行卡号
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * 设置银行卡号
	 *
	 * @param number 银行卡号
	 */
	public void setNumber(String number) {
		this.number = number;
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
	 * 获取分支行清算行号(bank_branch.clean_bank_no)
	 *
	 * @return clean_bank_no - 分支行清算行号(bank_branch.clean_bank_no)
	 */
	public String getCleanBankNo() {
		return cleanBankNo;
	}

	/**
	 * 设置分支行清算行号(bank_branch.clean_bank_no)
	 *
	 * @param cleanBankNo 分支行清算行号(bank_branch.clean_bank_no)
	 */
	public void setCleanBankNo(String cleanBankNo) {
		this.cleanBankNo = cleanBankNo;
	}

	/**
	 * 获取开户行所在城市
	 *
	 * @return city - 开户行所在城市
	 */
	public String getCity() {
		return city;
	}

	/**
	 * 设置开户行所在城市
	 *
	 * @param city 开户行所在城市
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * 获取否是默认银行卡
	 *
	 * @return is_default - 否是默认银行卡
	 */
	public Byte getIsDefault() {
		return isDefault;
	}

	/**
	 * 设置否是默认银行卡
	 *
	 * @param isDefault 否是默认银行卡
	 */
	public void setIsDefault(Byte isDefault) {
		this.isDefault = isDefault;
	}

	/**
	 * 获取是否已开通快捷支付,0否，1是
	 *
	 * @return is_quick_payment - 是否已开通快捷支付,0否，1是
	 */
	public Byte getIsQuickPayment() {
		return isQuickPayment;
	}

	/**
	 * 设置是否已开通快捷支付,0否，1是
	 *
	 * @param isQuickPayment 是否已开通快捷支付,0否，1是
	 */
	public void setIsQuickPayment(Byte isQuickPayment) {
		this.isQuickPayment = isQuickPayment;
	}

	/**
	 * 获取绑定时间
	 *
	 * @return bind_time - 绑定时间
	 */
	public Date getBindTime() {
		return bindTime;
	}

	/**
	 * 设置绑定时间
	 *
	 * @param bindTime 绑定时间
	 */
	public void setBindTime(Date bindTime) {
		this.bindTime = bindTime;
	}

	/**
	 * 获取状态(0，不启用；1，已启用)
	 *
	 * @return status - 状态(0，不启用；1，已启用)
	 */
	public Byte getStatus() {
		return status;
	}

	/**
	 * 设置状态(0，不启用；1，已启用)
	 *
	 * @param status 状态(0，不启用；1，已启用)
	 */
	public void setStatus(Byte status) {
		this.status = status;
	}


	/**
	 * 获取快捷支付配置信息json串(各通道自行定义结构；如绑定的通道ID,银行用户协议号,银行卡支付协议号)
	 *
	 * @return quick_payment_config_content - 快捷支付配置信息json串(各通道自行定义结构；如绑定的通道ID,银行用户协议号,银行卡支付协议号)
	 */
	public String getQuickPaymentConfigContent() {
		return quickPaymentConfigContent;
	}

	/**
	 * 设置快捷支付配置信息json串(各通道自行定义结构；如绑定的通道ID,银行用户协议号,银行卡支付协议号)
	 *
	 * @param quickPaymentConfigContent 快捷支付配置信息json串(各通道自行定义结构；如绑定的通道ID,银行用户协议号,银行卡支付协议号)
	 */
	public void setQuickPaymentConfigContent(String quickPaymentConfigContent) {
		this.quickPaymentConfigContent = quickPaymentConfigContent;
	}
}