package com.xhyan.zero.common.domain;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "merchant_partner")
public class MerchantPartner extends BaseDomain {


	/**
	 * 关联账户id
	 */
	@Column(name = "account_id")
	private Long accountId;

	/**
	 * 关联服务角色ID
	 */
	@Column(name = "service_role_id")
	private Long serviceRoleId;

	/**
	 * 接入方名称
	 */
	private String name;

	/**
	 * 接入方简称
	 */
	@Column(name = "short_name")
	private String shortName;

	/**
	 * 接入方站点地址
	 */
	private String site;

	/**
	 * 接入方logo图片地址
	 */
	@Column(name = "logo_image")
	private String logoImage;

	/**
	 * 接入方地址
	 */
	private String address;

	/**
	 * 接入方状态???
	 */
	private Byte status;

	/**
	 * 协议号
	 */
	@Column(name = "protocol_no")
	private String protocolNo;

	/**
	 * 支持交易类型???
	 */
	@Column(name = "trade_type")
	private String tradeType;

	/**
	 * 合作开始时间
	 */
	@Column(name = "gmt_cooprate_start")
	private Date gmtCooprateStart;

	/**
	 * 合作结束时间
	 */
	@Column(name = "gmt_cooprate_end")
	private Date gmtCooprateEnd;

	/**
	 * 接入方联系电话
	 */
	private String mobile;

	/**
	 * 接入方email
	 */
	private String email;

	/**
	 * 获取关联账户id
	 *
	 * @return account_id - 关联账户id
	 */
	public Long getAccountId() {
		return accountId;
	}

	/**
	 * 设置关联账户id
	 *
	 * @param accountId 关联账户id
	 */
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	/**
	 * 获取关联服务角色ID
	 *
	 * @return service_role_id - 关联服务角色ID
	 */
	public Long getServiceRoleId() {
		return serviceRoleId;
	}

	/**
	 * 设置关联服务角色ID
	 *
	 * @param serviceRoleId 关联服务角色ID
	 */
	public void setServiceRoleId(Long serviceRoleId) {
		this.serviceRoleId = serviceRoleId;
	}

	/**
	 * 获取接入方名称
	 *
	 * @return name - 接入方名称
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置接入方名称
	 *
	 * @param name 接入方名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取接入方简称
	 *
	 * @return short_name - 接入方简称
	 */
	public String getShortName() {
		return shortName;
	}

	/**
	 * 设置接入方简称
	 *
	 * @param shortName 接入方简称
	 */
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	/**
	 * 获取接入方站点地址
	 *
	 * @return site - 接入方站点地址
	 */
	public String getSite() {
		return site;
	}

	/**
	 * 设置接入方站点地址
	 *
	 * @param site 接入方站点地址
	 */
	public void setSite(String site) {
		this.site = site;
	}

	/**
	 * 获取接入方logo图片地址
	 *
	 * @return logo_image - 接入方logo图片地址
	 */
	public String getLogoImage() {
		return logoImage;
	}

	/**
	 * 设置接入方logo图片地址
	 *
	 * @param logoImage 接入方logo图片地址
	 */
	public void setLogoImage(String logoImage) {
		this.logoImage = logoImage;
	}

	/**
	 * 获取接入方地址
	 *
	 * @return address - 接入方地址
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * 设置接入方地址
	 *
	 * @param address 接入方地址
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * 获取接入方状态???
	 *
	 * @return status - 接入方状态???
	 */
	public Byte getStatus() {
		return status;
	}

	/**
	 * 设置接入方状态???
	 *
	 * @param status 接入方状态???
	 */
	public void setStatus(Byte status) {
		this.status = status;
	}

	/**
	 * 获取协议号
	 *
	 * @return protocol_no - 协议号
	 */
	public String getProtocolNo() {
		return protocolNo;
	}

	/**
	 * 设置协议号
	 *
	 * @param protocolNo 协议号
	 */
	public void setProtocolNo(String protocolNo) {
		this.protocolNo = protocolNo;
	}

	/**
	 * 获取支持交易类型???
	 *
	 * @return trade_type - 支持交易类型???
	 */
	public String getTradeType() {
		return tradeType;
	}

	/**
	 * 设置支持交易类型???
	 *
	 * @param tradeType 支持交易类型???
	 */
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	/**
	 * 获取合作开始时间
	 *
	 * @return gmt_cooprate_start - 合作开始时间
	 */
	public Date getGmtCooprateStart() {
		return gmtCooprateStart;
	}

	/**
	 * 设置合作开始时间
	 *
	 * @param gmtCooprateStart 合作开始时间
	 */
	public void setGmtCooprateStart(Date gmtCooprateStart) {
		this.gmtCooprateStart = gmtCooprateStart;
	}

	/**
	 * 获取合作结束时间
	 *
	 * @return gmt_cooprate_end - 合作结束时间
	 */
	public Date getGmtCooprateEnd() {
		return gmtCooprateEnd;
	}

	/**
	 * 设置合作结束时间
	 *
	 * @param gmtCooprateEnd 合作结束时间
	 */
	public void setGmtCooprateEnd(Date gmtCooprateEnd) {
		this.gmtCooprateEnd = gmtCooprateEnd;
	}


	/**
	 * 获取接入方联系电话
	 *
	 * @return mobile - 接入方联系电话
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * 设置接入方联系电话
	 *
	 * @param mobile 接入方联系电话
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * 获取接入方email
	 *
	 * @return email - 接入方email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * 设置接入方email
	 *
	 * @param email 接入方email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
}