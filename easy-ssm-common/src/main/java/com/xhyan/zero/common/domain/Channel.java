package com.xhyan.zero.common.domain;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "channel")
public class Channel extends BaseDomain {

	/**
	 * 状态:1正常,2暂停
	 */
	private Byte status;

	/**
	 * 渠道代号,如(ABC,ALIPAY,WEIPAY,UMPAY),本表唯一
	 */
	private String code;

	/**
	 * 渠道简称
	 */
	@Column(name = "short_name")
	private String shortName;

	/**
	 * 渠道名称
	 */
	private String name;

	/**
	 * 渠道网址
	 */
	private String website;

	/**
	 * 渠道的icon地址
	 */
	@Column(name = "icon_url")
	private String iconUrl;

	/**
	 * 渠道分类:1金融机构(如银行)，2非金融机构(支付宝,联动优势,微信支付等)
	 */
	private Byte type;

	/**
	 * 渠道支持的银行账户类型(0:全部,1:借记卡,2:贷记卡)
	 */
	@Column(name = "bank_account_type")
	private Byte bankAccountType;

	/**
	 * 渠道支持的网银类型(0:全部;1:个人网银,2:企业网银)
	 */
	@Column(name = "internet_bank_type")
	private Byte internetBankType;


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
	 * 获取渠道代号,如(ABC,ALIPAY,WEIPAY,UMPAY),本表唯一
	 *
	 * @return code - 渠道代号,如(ABC,ALIPAY,WEIPAY,UMPAY),本表唯一
	 */
	public String getCode() {
		return code;
	}

	/**
	 * 设置渠道代号,如(ABC,ALIPAY,WEIPAY,UMPAY),本表唯一
	 *
	 * @param code 渠道代号,如(ABC,ALIPAY,WEIPAY,UMPAY),本表唯一
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * 获取渠道简称
	 *
	 * @return short_name - 渠道简称
	 */
	public String getShortName() {
		return shortName;
	}

	/**
	 * 设置渠道简称
	 *
	 * @param shortName 渠道简称
	 */
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	/**
	 * 获取渠道名称
	 *
	 * @return name - 渠道名称
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置渠道名称
	 *
	 * @param name 渠道名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取渠道网址
	 *
	 * @return website - 渠道网址
	 */
	public String getWebsite() {
		return website;
	}

	/**
	 * 设置渠道网址
	 *
	 * @param website 渠道网址
	 */
	public void setWebsite(String website) {
		this.website = website;
	}

	/**
	 * 获取渠道的icon地址
	 *
	 * @return icon_url - 渠道的icon地址
	 */
	public String getIconUrl() {
		return iconUrl;
	}

	/**
	 * 设置渠道的icon地址
	 *
	 * @param iconUrl 渠道的icon地址
	 */
	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

	/**
	 * 获取渠道分类:1金融机构(如银行)，2非金融机构(支付宝,联动优势,微信支付等)
	 *
	 * @return type - 渠道分类:1金融机构(如银行)，2非金融机构(支付宝,联动优势,微信支付等)
	 */
	public Byte getType() {
		return type;
	}

	/**
	 * 设置渠道分类:1金融机构(如银行)，2非金融机构(支付宝,联动优势,微信支付等)
	 *
	 * @param type 渠道分类:1金融机构(如银行)，2非金融机构(支付宝,联动优势,微信支付等)
	 */
	public void setType(Byte type) {
		this.type = type;
	}

	/**
	 * 获取渠道支持的银行账户类型(0:全部,1:借记卡,2:贷记卡)
	 *
	 * @return bank_account_type - 渠道支持的银行账户类型(0:全部,1:借记卡,2:贷记卡)
	 */
	public Byte getBankAccountType() {
		return bankAccountType;
	}

	/**
	 * 设置渠道支持的银行账户类型(0:全部,1:借记卡,2:贷记卡)
	 *
	 * @param bankAccountType 渠道支持的银行账户类型(0:全部,1:借记卡,2:贷记卡)
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

}