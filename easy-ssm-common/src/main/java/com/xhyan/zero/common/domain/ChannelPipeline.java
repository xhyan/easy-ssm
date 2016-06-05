package com.xhyan.zero.common.domain;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "channel_pipeline")
public class ChannelPipeline extends BaseDomain {
	@Column(name = "channel_id")
	private Long channelId;

	@Column(name = "pipeline_id")
	private Long pipelineId;

	/**
	 * 备注
	 */
	private String memo;

	/**
	 * @return channel_id
	 */
	public Long getChannelId() {
		return channelId;
	}

	/**
	 * @param channelId
	 */
	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}

	/**
	 * @return pipeline_id
	 */
	public Long getPipelineId() {
		return pipelineId;
	}

	/**
	 * @param pipelineId
	 */
	public void setPipelineId(Long pipelineId) {
		this.pipelineId = pipelineId;
	}

	/**
	 * 获取备注
	 *
	 * @return memo - 备注
	 */
	public String getMemo() {
		return memo;
	}

	/**
	 * 设置备注
	 *
	 * @param memo 备注
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}
}