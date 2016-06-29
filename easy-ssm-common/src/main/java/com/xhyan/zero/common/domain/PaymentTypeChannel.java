package com.xhyan.zero.common.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "payment_type_channel")
public class PaymentTypeChannel extends BaseDomain {
	/**
	 * 支付方式
	 */
	@Column(name = "payment_type_id")
	private Long paymentTypeId;

	/**
	 * 支持的渠道id(channel.id)
	 */
	@Column(name = "channel_id")
	private Long channelId;

	/**
	 * 排序号
	 */
	@Column(name = "sort_no")
	private Integer sortNo;

	/**
	 * 状态,1开启,2暂停
	 */
	private Integer status;
}