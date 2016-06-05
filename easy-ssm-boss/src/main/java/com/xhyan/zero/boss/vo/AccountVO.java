package com.xhyan.zero.boss.vo;

/**
 * 账户信息视图对象
 */
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

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmailBackup() {
		return emailBackup;
	}

	public void setEmailBackup(String emailBackup) {
		this.emailBackup = emailBackup;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Byte getType() {
		return type;
	}

	public void setType(Byte type) {
		this.type = type;
	}

	public Byte getProperty() {
		return property;
	}

	public void setProperty(Byte property) {
		this.property = property;
	}

	public Long getPayFlag() {
		return payFlag;
	}

	public void setPayFlag(Long payFlag) {
		this.payFlag = payFlag;
	}

	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	public String getExtend() {
		return extend;
	}

	public void setExtend(String extend) {
		this.extend = extend;
	}

	@Override
	public String toString() {
		return "AccountVO{" +
				"loginName='" + loginName + '\'' +
				", email='" + email + '\'' +
				", emailBackup='" + emailBackup + '\'' +
				", mobile='" + mobile + '\'' +
				", type=" + type +
				", property=" + property +
				", payFlag=" + payFlag +
				", status=" + status +
				", extend='" + extend + '\'' +
				'}';
	}
}
