package com.xhyan.zero.common.domain;

import com.xhyan.zero.common.base.BaseDomain;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "bank_branch")
public class BankBranch extends BaseDomain {
	/**
	 * 银行的分支行号
	 */
	@Column(name = "bank_no")
	private String bankNo;

	/**
	 * 银行编号
	 */
	@Column(name = "bank_code")
	private Integer bankCode;

	/**
	 * 地区编号
	 */
	@Column(name = "city_code")
	private Integer cityCode;

	/**
	 * 分支行清算行号
	 */
	@Column(name = "clear_bank_no")
	private String clearBankNo;

	/**
	 * 分支行名称
	 */
	@Column(name = "bank_name")
	private String bankName;

	private Boolean status;
}