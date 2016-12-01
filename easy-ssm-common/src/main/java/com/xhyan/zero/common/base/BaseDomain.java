package com.xhyan.zero.common.base;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * domain 基类
 */
@Data
public abstract class BaseDomain extends ZeroPage {
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
}
