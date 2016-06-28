package com.xhyan.zero.common.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "channel_pipeline_fee_percent")
public class ChannelPipelineFeePercent extends BaseDomain {

	/**
	 * 渠道id
	 */
	@Column(name = "channel_id")
	private Long channelId;

	/**
	 * 通道ID
	 */
	@Column(name = "pipeline_id")
	private Long pipelineId;

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
	private Byte status;
}