package com.xhyan.zero.common.domain;

import com.xhyan.zero.common.base.BaseDomain;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
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
}