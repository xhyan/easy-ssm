package com.xhyan.zero.common.domain;

import com.xhyan.zero.common.base.BaseDomain;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "bank_card_bin")
public class BankCardBin extends BaseDomain {


	/**
	 * 卡bin：银行卡前n位，判断卡号的银行归属
	 */
	@Column(name = "card_bin")
	private String cardBin;

	/**
	 * 渠道编码
	 */
	@Column(name = "channel_code")
	private String channelCode;

	/**
	 * 银行卡名称
	 */
	@Column(name = "card_name")
	private String cardName;

	/**
	 * 卡类型：CC 贷记卡；DC 借记卡；SC 准贷记卡
	 */
	@Column(name = "card_type")
	private String cardType;

	/**
	 * 卡bin位数
	 */
	@Column(name = "bin_digits")
	private Integer binDigits;

	/**
	 * 银行卡号位数
	 */
	@Column(name = "card_digits")
	private Integer cardDigits;

	/**
	 * 卡bin标志：0表示不启用，1表示启用
	 */
	private Integer flag;
}