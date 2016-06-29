package com.xhyan.zero.common.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Data
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
}