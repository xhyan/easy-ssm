package com.xhyan.zero.common.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "trade_type")
public class TradeType extends BaseDomain {


	/**
	 * 类型编码
	 */
	private String code;

	/**
	 * 类型名称
	 */
	private String name;

	/**
	 * 类型图标存放全路径
	 */
	@Column(name = "icon_address")
	private String iconAddress;

	/**
	 * 支持的支付方式(多种支付方式以逗号","隔开)
	 */
	@Column(name = "payment_type_ids")
	private String paymentTypeIds;

}