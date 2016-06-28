package com.xhyan.zero.common.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
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
}