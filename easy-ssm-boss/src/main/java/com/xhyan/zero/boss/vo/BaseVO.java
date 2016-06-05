package com.xhyan.zero.boss.vo;

import java.util.Date;

/**
 * 视图对象的基类对象
 */
public class BaseVO {

	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModify() {
		return gmtModify;
	}

	public void setGmtModify(Date gmtModify) {
		this.gmtModify = gmtModify;
	}

	/**
	 * 创建时间
	 */
	private Date gmtCreate;

	/**
	 * 最后修改时间
	 */
	private Date gmtModify;
}
