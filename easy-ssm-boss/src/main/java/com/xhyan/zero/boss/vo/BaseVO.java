package com.xhyan.zero.boss.vo;

import com.xhyan.zero.common.base.BaseDomain;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 视图对象的基类对象
 */
@Data
public class BaseVO implements Serializable{

	private Long id;
	/**
	 * 创建时间
	 */
	private Date gmtCreate;

	/**
	 * 最后修改时间
	 */
	private Date gmtModify;

}
