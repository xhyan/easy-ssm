package com.xhyan.zero.common.domain;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "cru_transfer_bank")
public class CruTransferBank extends BaseDomain {


	/**
	 * 银行渠道id
	 */
	@Column(name = "channel_id")
	private Long channelId;

	/**
	 * 手续费率
	 */
	@Column(name = "fee_percent")
	private String feePercent;

	/**
	 * 到账时间,0立即到账,其他单位为小时
	 */
	@Column(name = "receive_time")
	private Integer receiveTime;

	/**
	 * 状态,1正常2暂停
	 */
	private Integer status;


	/**
	 * 获取银行渠道id
	 *
	 * @return channel_id - 银行渠道id
	 */
	public Long getChannelId() {
		return channelId;
	}

	/**
	 * 设置银行渠道id
	 *
	 * @param channelId 银行渠道id
	 */
	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}

	/**
	 * 获取手续费率
	 *
	 * @return fee_percent - 手续费率
	 */
	public String getFeePercent() {
		return feePercent;
	}

	/**
	 * 设置手续费率
	 *
	 * @param feePercent 手续费率
	 */
	public void setFeePercent(String feePercent) {
		this.feePercent = feePercent;
	}

	/**
	 * 获取到账时间,0立即到账,其他单位为小时
	 *
	 * @return receive_time - 到账时间,0立即到账,其他单位为小时
	 */
	public Integer getReceiveTime() {
		return receiveTime;
	}

	/**
	 * 设置到账时间,0立即到账,其他单位为小时
	 *
	 * @param receiveTime 到账时间,0立即到账,其他单位为小时
	 */
	public void setReceiveTime(Integer receiveTime) {
		this.receiveTime = receiveTime;
	}

	/**
	 * 获取状态,1正常2暂停
	 *
	 * @return status - 状态,1正常2暂停
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * 设置状态,1正常2暂停
	 *
	 * @param status 状态,1正常2暂停
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

}