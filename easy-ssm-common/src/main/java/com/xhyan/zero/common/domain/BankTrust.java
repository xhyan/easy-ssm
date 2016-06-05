package com.xhyan.zero.common.domain;

import javax.persistence.Column;
import javax.persistence.Table;

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


	/**
	 * 获取银行账号
	 *
	 * @return bank_num - 银行账号
	 */
	public String getBankNum() {
		return bankNum;
	}

	/**
	 * 设置银行账号
	 *
	 * @param bankNum 银行账号
	 */
	public void setBankNum(String bankNum) {
		this.bankNum = bankNum;
	}

	/**
	 * 获取银行资金账号名称
	 *
	 * @return customer_name - 银行资金账号名称
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * 设置银行资金账号名称
	 *
	 * @param customerName 银行资金账号名称
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * 获取开户行地址
	 *
	 * @return address - 开户行地址
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * 设置开户行地址
	 *
	 * @param address 开户行地址
	 */
	public void setAddress(String address) {
		this.address = address;
	}

}