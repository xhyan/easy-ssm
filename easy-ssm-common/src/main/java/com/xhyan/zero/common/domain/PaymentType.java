package com.xhyan.zero.common.domain;

import javax.persistence.Table;

@Table(name = "payment_type")
public class PaymentType extends BaseDomain {


	/**
	 * 支付方式代码
	 */
	private String code;

	/**
	 * 支付方式的名称
	 */
	private String name;


	/**
	 * 获取支付方式代码
	 *
	 * @return code - 支付方式代码
	 */
	public String getCode() {
		return code;
	}

	/**
	 * 设置支付方式代码
	 *
	 * @param code 支付方式代码
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * 获取支付方式的名称
	 *
	 * @return name - 支付方式的名称
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置支付方式的名称
	 *
	 * @param name 支付方式的名称
	 */
	public void setName(String name) {
		this.name = name;
	}

}