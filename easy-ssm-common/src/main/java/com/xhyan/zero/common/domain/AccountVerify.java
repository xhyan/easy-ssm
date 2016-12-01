package com.xhyan.zero.common.domain;

import com.xhyan.zero.common.base.BaseDomain;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "account_verify")
public class AccountVerify extends BaseDomain {
	/**
	 * 账户id
	 */
	@Column(name = "account_id")
	private Long accountId;

	/**
	 * 手机号
	 */
	private String mobile;

	/**
	 * 业务编码，每种业务有唯一的编码？？？
	 */
	@Column(name = "business_code")
	private Integer businessCode;

	/**
	 * 随机码
	 */
	@Column(name = "random_code")
	private String randomCode;

	/**
	 * 最后有效时间
	 */
	private Date priod;

	/**
	 * 验证码状态：1表示未使用 2表示已使用
	 */
	private Integer status;
}