package com.xhyan.zero.common.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "pipeline_notify_info")
public class PipelineNotifyInfo extends BaseDomain {
	/**
	 * 渠道收支记录id(pipeline.id)
	 */
	@Column(name = "pipeline_bill_id")
	private Long pipelineBillId;

	/**
	 * 回调类型：1转入(充值)，2转出(提现)
	 */
	@Column(name = "notify_type")
	private Byte notifyType;

	/**
	 * 通知时间
	 */
	@Column(name = "notify_time")
	private Date notifyTime;

	/**
	 * 通道通知参数列表(记录通道回调回转给我们的信息)
	 */
	@Column(name = "notify_content")
	private String notifyContent;
}