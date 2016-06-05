package com.xhyan.zero.common.domain;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "pipeline")
public class Pipeline extends BaseDomain {

	/**
	 * 通道代号,如(ABC,ALIPAY,WEIPAY,UMPAY)
	 */
	private String code;

	/**
	 * 通道分类:1金融机构(如银行)，2非金融机构(支付宝,联动优势,微信支付等)
	 */
	private Byte type;

	/**
	 * 通道名称
	 */
	private String name;

	/**
	 * 通道简称
	 */
	@Column(name = "short_name")
	private String shortName;

	/**
	 * 合作开始时间
	 */
	@Column(name = "start_time")
	private Date startTime;

	/**
	 * 合作结束时间
	 */
	@Column(name = "end_time")
	private Date endTime;

	/**
	 * 长期合作,1是,2否
	 */
	@Column(name = "long_time")
	private Byte longTime;

	/**
	 * 状态:1正常,2暂停
	 */
	private Byte status;

	/**
	 * 渠道支持的银行账户类型(0：全部,1:借记卡,2:贷记卡)
	 */
	@Column(name = "bank_account_type")
	private Byte bankAccountType;

	/**
	 * 渠道支持的网银类型(0:全部;1:个人网银,2:企业网银)
	 */
	@Column(name = "internet_bank_type")
	private Byte internetBankType;

	/**
	 * 签约协议号，外部通道分配给平台的身份
	 */
	@Column(name = "protocol_no")
	private String protocolNo;

	/**
	 * 渠道配置信息(根据不同渠道自行定义，如托管银行，账号，密码等信息)
	 */
	@Column(name = "config_content")
	private String configContent;


	/**
	 * 获取通道代号,如(ABC,ALIPAY,WEIPAY,UMPAY)
	 *
	 * @return code - 通道代号,如(ABC,ALIPAY,WEIPAY,UMPAY)
	 */
	public String getCode() {
		return code;
	}

	/**
	 * 设置通道代号,如(ABC,ALIPAY,WEIPAY,UMPAY)
	 *
	 * @param code 通道代号,如(ABC,ALIPAY,WEIPAY,UMPAY)
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * 获取通道分类:1金融机构(如银行)，2非金融机构(支付宝,联动优势,微信支付等)
	 *
	 * @return type - 通道分类:1金融机构(如银行)，2非金融机构(支付宝,联动优势,微信支付等)
	 */
	public Byte getType() {
		return type;
	}

	/**
	 * 设置通道分类:1金融机构(如银行)，2非金融机构(支付宝,联动优势,微信支付等)
	 *
	 * @param type 通道分类:1金融机构(如银行)，2非金融机构(支付宝,联动优势,微信支付等)
	 */
	public void setType(Byte type) {
		this.type = type;
	}

	/**
	 * 获取通道名称
	 *
	 * @return name - 通道名称
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置通道名称
	 *
	 * @param name 通道名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取通道简称
	 *
	 * @return short_name - 通道简称
	 */
	public String getShortName() {
		return shortName;
	}

	/**
	 * 设置通道简称
	 *
	 * @param shortName 通道简称
	 */
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	/**
	 * 获取合作开始时间
	 *
	 * @return start_time - 合作开始时间
	 */
	public Date getStartTime() {
		return startTime;
	}

	/**
	 * 设置合作开始时间
	 *
	 * @param startTime 合作开始时间
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	/**
	 * 获取合作结束时间
	 *
	 * @return end_time - 合作结束时间
	 */
	public Date getEndTime() {
		return endTime;
	}

	/**
	 * 设置合作结束时间
	 *
	 * @param endTime 合作结束时间
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	/**
	 * 获取长期合作,1是,2否
	 *
	 * @return long_time - 长期合作,1是,2否
	 */
	public Byte getLongTime() {
		return longTime;
	}

	/**
	 * 设置长期合作,1是,2否
	 *
	 * @param longTime 长期合作,1是,2否
	 */
	public void setLongTime(Byte longTime) {
		this.longTime = longTime;
	}

	/**
	 * 获取状态:1正常,2暂停
	 *
	 * @return status - 状态:1正常,2暂停
	 */
	public Byte getStatus() {
		return status;
	}

	/**
	 * 设置状态:1正常,2暂停
	 *
	 * @param status 状态:1正常,2暂停
	 */
	public void setStatus(Byte status) {
		this.status = status;
	}

	/**
	 * 获取渠道支持的银行账户类型(0：全部,1:借记卡,2:贷记卡)
	 *
	 * @return bank_account_type - 渠道支持的银行账户类型(0：全部,1:借记卡,2:贷记卡)
	 */
	public Byte getBankAccountType() {
		return bankAccountType;
	}

	/**
	 * 设置渠道支持的银行账户类型(0：全部,1:借记卡,2:贷记卡)
	 *
	 * @param bankAccountType 渠道支持的银行账户类型(0：全部,1:借记卡,2:贷记卡)
	 */
	public void setBankAccountType(Byte bankAccountType) {
		this.bankAccountType = bankAccountType;
	}

	/**
	 * 获取渠道支持的网银类型(0:全部;1:个人网银,2:企业网银)
	 *
	 * @return internet_bank_type - 渠道支持的网银类型(0:全部;1:个人网银,2:企业网银)
	 */
	public Byte getInternetBankType() {
		return internetBankType;
	}

	/**
	 * 设置渠道支持的网银类型(0:全部;1:个人网银,2:企业网银)
	 *
	 * @param internetBankType 渠道支持的网银类型(0:全部;1:个人网银,2:企业网银)
	 */
	public void setInternetBankType(Byte internetBankType) {
		this.internetBankType = internetBankType;
	}

	/**
	 * 获取签约协议号，外部通道分配给平台的身份
	 *
	 * @return protocol_no - 签约协议号，外部通道分配给平台的身份
	 */
	public String getProtocolNo() {
		return protocolNo;
	}

	/**
	 * 设置签约协议号，外部通道分配给平台的身份
	 *
	 * @param protocolNo 签约协议号，外部通道分配给平台的身份
	 */
	public void setProtocolNo(String protocolNo) {
		this.protocolNo = protocolNo;
	}

	/**
	 * 获取渠道配置信息(根据不同渠道自行定义，如托管银行，账号，密码等信息)
	 *
	 * @return config_content - 渠道配置信息(根据不同渠道自行定义，如托管银行，账号，密码等信息)
	 */
	public String getConfigContent() {
		return configContent;
	}

	/**
	 * 设置渠道配置信息(根据不同渠道自行定义，如托管银行，账号，密码等信息)
	 *
	 * @param configContent 渠道配置信息(根据不同渠道自行定义，如托管银行，账号，密码等信息)
	 */
	public void setConfigContent(String configContent) {
		this.configContent = configContent;
	}
}