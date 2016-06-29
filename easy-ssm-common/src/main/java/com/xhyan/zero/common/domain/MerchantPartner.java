package com.xhyan.zero.common.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "merchant_partner")
public class MerchantPartner extends BaseDomain {
	/**
	 * 关联账户id
	 */
	@Column(name = "account_id")
	private Long accountId;

	/**
	 * 关联服务角色ID
	 */
	@Column(name = "service_role_id")
	private Long serviceRoleId;

	/**
	 * 接入方名称
	 */
	private String name;

	/**
	 * 接入方简称
	 */
	@Column(name = "short_name")
	private String shortName;

	/**
	 * 接入方站点地址
	 */
	private String site;

	/**
	 * 接入方logo图片地址
	 */
	@Column(name = "logo_image")
	private String logoImage;

	/**
	 * 接入方地址
	 */
	private String address;

	/**
	 * 接入方状态???
	 */
	private Byte status;

	/**
	 * 协议号
	 */
	@Column(name = "protocol_no")
	private String protocolNo;

	/**
	 * 支持交易类型???
	 */
	@Column(name = "trade_type")
	private String tradeType;

	/**
	 * 合作开始时间
	 */
	@Column(name = "gmt_cooprate_start")
	private Date gmtCooprateStart;

	/**
	 * 合作结束时间
	 */
	@Column(name = "gmt_cooprate_end")
	private Date gmtCooprateEnd;

	/**
	 * 接入方联系电话
	 */
	private String mobile;

	/**
	 * 接入方email
	 */
	private String email;
}