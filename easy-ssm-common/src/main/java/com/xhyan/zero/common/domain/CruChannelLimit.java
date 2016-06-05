package com.xhyan.zero.common.domain;

import javax.persistence.Column;
import javax.persistence.Table;

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


	/**
	 * 获取渠道id
	 *
	 * @return channel_id - 渠道id
	 */
	public Long getChannelId() {
		return channelId;
	}

	/**
	 * 设置渠道id
	 *
	 * @param channelId 渠道id
	 */
	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}

	/**
	 * 获取限额JSON串
	 *
	 * @return limit_content - 限额JSON串
	 */
	public String getLimitContent() {
		return limitContent;
	}

	/**
	 * 设置限额JSON串
	 *
	 * @param limitContent 限额JSON串
	 */
	public void setLimitContent(String limitContent) {
		this.limitContent = limitContent;
	}

}