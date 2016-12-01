package com.xhyan.zero.common.domain;

import com.xhyan.zero.common.base.BaseDomain;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
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

}