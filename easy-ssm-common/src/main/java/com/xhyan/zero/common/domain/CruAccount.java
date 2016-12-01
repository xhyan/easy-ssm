package com.xhyan.zero.common.domain;

import com.xhyan.zero.common.base.BaseDomain;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "cru_account")
public class CruAccount extends BaseDomain {
	/**
	 * 账号id
	 */
	@Column(name = "account_id")
	private Long accountId;

	/**
	 * 限制前余额
	 */
	private Long amount;

	/**
	 * 受限功能
	 */
	@Column(name = "limit_feature")
	private Integer limitFeature;

	/**
	 * 限制时间
	 */
	@Column(name = "limit_time")
	private Integer limitTime;

	/**
	 * 限制时间单位,1小时,2天
	 */
	@Column(name = "limit_unit")
	private Integer limitUnit;

	/**
	 * 限制原因,1异常交易,2违反相关市场规范,3交易风险控制,4其他
	 */
	@Column(name = "limit_reason")
	private Integer limitReason;

	/**
	 * 说明
	 */
	private String descr;

	/**
	 * 通知用户方式,1站内信,2手机短信,3邮箱(多种方式用,分隔)
	 */
	@Column(name = "notify_type")
	private String notifyType;

	/**
	 * 添加限制操作员id
	 */
	@Column(name = "op_user_id")
	private Long opUserId;


	/**
	 * 记录状态(1:生效;2:失效)
	 */
	private Integer status;

	/**
	 * 解除限制操作员(0:自动解除限制)
	 */
	@Column(name = "relieve_user_id")
	private Long relieveUserId;

	/**
	 * 解除时间
	 */
	@Column(name = "relieve_time")
	private Date relieveTime;
}