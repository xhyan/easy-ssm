package com.xhyan.zero.common.domain;

import javax.persistence.Column;
import javax.persistence.Table;

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


	/**
	 * 获取卡bin：银行卡前n位，判断卡号的银行归属
	 *
	 * @return card_bin - 卡bin：银行卡前n位，判断卡号的银行归属
	 */
	public String getCardBin() {
		return cardBin;
	}

	/**
	 * 设置卡bin：银行卡前n位，判断卡号的银行归属
	 *
	 * @param cardBin 卡bin：银行卡前n位，判断卡号的银行归属
	 */
	public void setCardBin(String cardBin) {
		this.cardBin = cardBin;
	}

	/**
	 * 获取渠道编码
	 *
	 * @return channel_code - 渠道编码
	 */
	public String getChannelCode() {
		return channelCode;
	}

	/**
	 * 设置渠道编码
	 *
	 * @param channelCode 渠道编码
	 */
	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	/**
	 * 获取银行卡名称
	 *
	 * @return card_name - 银行卡名称
	 */
	public String getCardName() {
		return cardName;
	}

	/**
	 * 设置银行卡名称
	 *
	 * @param cardName 银行卡名称
	 */
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	/**
	 * 获取卡类型：CC 贷记卡；DC 借记卡；SC 准贷记卡
	 *
	 * @return card_type - 卡类型：CC 贷记卡；DC 借记卡；SC 准贷记卡
	 */
	public String getCardType() {
		return cardType;
	}

	/**
	 * 设置卡类型：CC 贷记卡；DC 借记卡；SC 准贷记卡
	 *
	 * @param cardType 卡类型：CC 贷记卡；DC 借记卡；SC 准贷记卡
	 */
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	/**
	 * 获取卡bin位数
	 *
	 * @return bin_digits - 卡bin位数
	 */
	public Integer getBinDigits() {
		return binDigits;
	}

	/**
	 * 设置卡bin位数
	 *
	 * @param binDigits 卡bin位数
	 */
	public void setBinDigits(Integer binDigits) {
		this.binDigits = binDigits;
	}

	/**
	 * 获取银行卡号位数
	 *
	 * @return card_digits - 银行卡号位数
	 */
	public Integer getCardDigits() {
		return cardDigits;
	}

	/**
	 * 设置银行卡号位数
	 *
	 * @param cardDigits 银行卡号位数
	 */
	public void setCardDigits(Integer cardDigits) {
		this.cardDigits = cardDigits;
	}

	/**
	 * 获取卡bin标志：0表示不启用，1表示启用
	 *
	 * @return flag - 卡bin标志：0表示不启用，1表示启用
	 */
	public Integer getFlag() {
		return flag;
	}

	/**
	 * 设置卡bin标志：0表示不启用，1表示启用
	 *
	 * @param flag 卡bin标志：0表示不启用，1表示启用
	 */
	public void setFlag(Integer flag) {
		this.flag = flag;
	}
}