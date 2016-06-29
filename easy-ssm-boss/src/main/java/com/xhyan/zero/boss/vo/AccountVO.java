package com.xhyan.zero.boss.vo;

import lombok.Data;

/**
 * 账户信息视图对象
 */
@Data
public class AccountVO extends BaseVO {

	/**
	 * 登录名
	 */
	private String loginName;

	/**
	 * 账号绑定邮箱
	 */
	private String email;

	/**
	 * 账号绑定备用邮箱
	 */
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
	 * 支付功能控制标志
	 */
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
