package com.xhyan.zero.common.domain;

import com.xhyan.zero.common.base.BaseDomain;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "account_bank_card")
public class AccountBankCard extends BaseDomain {
	/**
	 * 账户id
	 */
	@Column(name = "account_id")
	private Long accountId;

	/**
	 * 持卡人姓名
	 */
	private String name;

	/**
	 * 证件类型(1:身份证,2护照)
	 */
	@Column(name = "credential_type")
	private Byte credentialType;

	/**
	 * 证件号
	 */
	@Column(name = "credential_no")
	private String credentialNo;

	/**
	 * 片卡类型:1储蓄卡,2信用卡
	 */
	private Byte type;

	/**
	 * 银行卡号
	 */
	private String number;

	/**
	 * 手机号
	 */
	private String mobile;

	/**
	 * 分支行清算行号(bank_branch.clean_bank_no)
	 */
	@Column(name = "clean_bank_no")
	private String cleanBankNo;

	/**
	 * 开户行所在城市
	 */
	private String city;

	/**
	 * 否是默认银行卡
	 */
	@Column(name = "is_default")
	private Byte isDefault;

	/**
	 * 是否已开通快捷支付,0否，1是
	 */
	@Column(name = "is_quick_payment")
	private Byte isQuickPayment;

	/**
	 * 绑定时间
	 */
	@Column(name = "bind_time")
	private Date bindTime;

	/**
	 * 状态(0，不启用；1，已启用)
	 */
	private Byte status;

	/**
	 * 快捷支付配置信息json串(各通道自行定义结构；如绑定的通道ID,银行用户协议号,银行卡支付协议号)
	 */
	@Column(name = "quick_payment_config_content")
	private String quickPaymentConfigContent;

}