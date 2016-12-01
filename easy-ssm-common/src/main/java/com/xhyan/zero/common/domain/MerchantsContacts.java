package com.xhyan.zero.common.domain;

import com.xhyan.zero.common.base.BaseDomain;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "merchants_contacts")
public class MerchantsContacts extends BaseDomain {
	/**
	 * 商户id
	 */
	@Column(name = "partner_id")
	private Long partnerId;

	/**
	 * 联系人姓名
	 */
	private String name;

	/**
	 * 联系人职务
	 */
	private String position;

	/**
	 * 联系人地址
	 */
	private String address;

	/**
	 * 手机号
	 */
	private String mobile;

	/**
	 * 电话号
	 */
	private String tel;

	/**
	 * 邮件
	 */
	private String email;
}