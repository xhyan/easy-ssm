package com.xhyan.zero.common.domain;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "account_login_way")
public class AccountLoginWay extends BaseDomain {
	/**
	 * 账号ID
	 */
	@Column(name = "account_id")
	private Long accountId;

	/**
	 * 第三方登录账号
	 */
	@Column(name = "third_login_name")
	private String thirdLoginName;

	/**
	 * 登录方式:1资金账号登录，2家丰网帐号登录，3交易结算账号登录
	 */
	@Column(name = "login_way")
	private Integer loginWay;

	/**
	 * 备注
	 */
	private String memo;

	/**
	 * 配置信息(不同登录方式自行配置)
	 */
	@Column(name = "config_content")
	private String configContent;

	/**
	 * 获取账号ID
	 *
	 * @return account_id - 账号ID
	 */
	public Long getAccountId() {
		return accountId;
	}

	/**
	 * 设置账号ID
	 *
	 * @param accountId 账号ID
	 */
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	/**
	 * 获取第三方登录账号
	 *
	 * @return third_login_name - 第三方登录账号
	 */
	public String getThirdLoginName() {
		return thirdLoginName;
	}

	/**
	 * 设置第三方登录账号
	 *
	 * @param thirdLoginName 第三方登录账号
	 */
	public void setThirdLoginName(String thirdLoginName) {
		this.thirdLoginName = thirdLoginName;
	}

	/**
	 * 获取登录方式:1资金账号登录，2家丰网帐号登录，3交易结算账号登录
	 *
	 * @return login_way - 登录方式:1资金账号登录，2家丰网帐号登录，3交易结算账号登录
	 */
	public Integer getLoginWay() {
		return loginWay;
	}

	/**
	 * 设置登录方式:1资金账号登录，2家丰网帐号登录，3交易结算账号登录
	 *
	 * @param loginWay 登录方式:1资金账号登录，2家丰网帐号登录，3交易结算账号登录
	 */
	public void setLoginWay(Integer loginWay) {
		this.loginWay = loginWay;
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

	/**
	 * 获取配置信息(不同登录方式自行配置)
	 *
	 * @return config_content - 配置信息(不同登录方式自行配置)
	 */
	public String getConfigContent() {
		return configContent;
	}

	/**
	 * 设置配置信息(不同登录方式自行配置)
	 *
	 * @param configContent 配置信息(不同登录方式自行配置)
	 */
	public void setConfigContent(String configContent) {
		this.configContent = configContent;
	}
}