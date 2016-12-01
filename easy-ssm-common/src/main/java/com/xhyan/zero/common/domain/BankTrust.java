package com.xhyan.zero.common.domain;

import com.xhyan.zero.common.base.BaseDomain;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "bank_trust")
public class BankTrust extends BaseDomain {


	/**
	 * 银行账号
	 */
	@Column(name = "bank_num")
	private String bankNum;

	/**
	 * 银行资金账号名称
	 */
	@Column(name = "customer_name")
	private String customerName;

	/**
	 * 开户行地址
	 */
	private String address;

}