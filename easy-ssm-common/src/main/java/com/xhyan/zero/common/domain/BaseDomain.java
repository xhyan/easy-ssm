package com.xhyan.zero.common.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * domain 基类
 */
public class BaseDomain {
	/**
	 * ID
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**
	 * 创建时间
	 */
	@Column(name = "gmt_create")
	private Date gmtCreate;

	/**
	 * 最后修改时间
	 */
	@Column(name = "gmt_modify")
	private Date gmtModify;


	/**
	 * 获取ID
	 *
	 * @return id - ID
	 */
	public Long getId() {
		return id;
	}

	/**
	 * 设置ID
	 *
	 * @param id ID
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 获取最后修改时间
	 *
	 * @return gmt_modify - 最后修改时间
	 */
	public Date getGmtModify() {
		return gmtModify;
	}

	/**
	 * 设置最后修改时间
	 *
	 * @param gmtModify 最后修改时间
	 */
	public void setGmtModify(Date gmtModify) {
		this.gmtModify = gmtModify;
	}

	/**
	 * 获取创建时间
	 *
	 * @return gmt_create - 创建时间
	 */
	public Date getGmtCreate() {
		return gmtCreate;
	}

	/**
	 * 设置创建时间
	 *
	 * @param gmtCreate 创建时间
	 */
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
}
