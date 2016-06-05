package com.xhyan.zero.common.domain;

import javax.persistence.Column;
import javax.persistence.Table;

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

	/**
	 * 获取支付方式
	 *
	 * @return payment_type_id - 支付方式
	 */
	public Long getPaymentTypeId() {
		return paymentTypeId;
	}

	/**
	 * 设置支付方式
	 *
	 * @param paymentTypeId 支付方式
	 */
	public void setPaymentTypeId(Long paymentTypeId) {
		this.paymentTypeId = paymentTypeId;
	}

	/**
	 * 获取支持的渠道id(channel.id)
	 *
	 * @return channel_id - 支持的渠道id(channel.id)
	 */
	public Long getChannelId() {
		return channelId;
	}

	/**
	 * 设置支持的渠道id(channel.id)
	 *
	 * @param channelId 支持的渠道id(channel.id)
	 */
	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}

	/**
	 * 获取排序号
	 *
	 * @return sort_no - 排序号
	 */
	public Integer getSortNo() {
		return sortNo;
	}

	/**
	 * 设置排序号
	 *
	 * @param sortNo 排序号
	 */
	public void setSortNo(Integer sortNo) {
		this.sortNo = sortNo;
	}

	/**
	 * 获取状态,1开启,2暂停
	 *
	 * @return status - 状态,1开启,2暂停
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * 设置状态,1开启,2暂停
	 *
	 * @param status 状态,1开启,2暂停
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

}