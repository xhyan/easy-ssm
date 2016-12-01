package com.xhyan.zero.common.domain;

import com.xhyan.zero.common.base.BaseDomain;
import lombok.Data;

import javax.persistence.Table;

@Data
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
}