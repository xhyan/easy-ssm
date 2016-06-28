package com.xhyan.zero.common.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "account")
public class Account extends BaseDomain {


	/**
	 * 登录名
	 */
	@Column(name = "login_name")
	private String loginName;

	/**
	 * 登录密码(不可逆加密)
	 */
	@Column(name = "login_pwd")
	private String loginPwd;

	/**
	 * 交易密码(不可逆加密)
	 */
	@Column(name = "trade_pwd")
	private String tradePwd;

	/**
	 * 账号绑定邮箱
	 */
	private String email;

	/**
	 * 账号绑定备用邮箱
	 */
	@Column(name = "email_backup")
	private String emailBackup;

	/**
	 * 账号绑定手机号
	 */
	private String mobile;

	/**
	 * 账户类型(1个人账户；2企业账户)
	 */
	private Byte type;

	/**
	 * 账户性质（1资金账户，3商户账户，4担保账户）
	 */
	private Byte property;

	/**
	 * 支付功能控制标志？？？
	 */
	@Column(name = "pay_flag")
	private Long payFlag;

	/**
	 * 账户状态：1正常,2受限,3冻结,4注销
	 */
	private Byte status;


	/**
	 * 扩展字段
	 */
	private String extend;

}