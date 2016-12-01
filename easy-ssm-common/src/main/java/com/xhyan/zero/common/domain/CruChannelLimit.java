package com.xhyan.zero.common.domain;

import com.xhyan.zero.common.base.BaseDomain;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "cru_channel_limit")
public class CruChannelLimit extends BaseDomain {
	/**
	 * 渠道id
	 */
	@Column(name = "channel_id")
	private Long channelId;

	/**
	 * 限额JSON串
	 */
	@Column(name = "limit_content")
	private String limitContent;
}