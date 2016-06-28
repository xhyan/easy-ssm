package com.xhyan.zero.common.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
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
}