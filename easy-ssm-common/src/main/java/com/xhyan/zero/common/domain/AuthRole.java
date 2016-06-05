package com.xhyan.zero.common.domain;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "auth_role")
public class AuthRole extends BaseDomain{
	/**
	 * 角色名称
	 */
	@Column(name = "role_name")
	private String roleName;

	/**
	 * 备注
	 */
	private String remark;

	/**
	 * 创建人
	 */
	@Column(name = "create_by")
	private Long createBy;

	/**
	 * 获取角色名称
	 *
	 * @return role_name - 角色名称
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * 设置角色名称
	 *
	 * @param roleName 角色名称
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	/**
	 * 获取备注
	 *
	 * @return remark - 备注
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * 设置备注
	 *
	 * @param remark 备注
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * 获取创建人
	 *
	 * @return create_by - 创建人
	 */
	public Long getCreateBy() {
		return createBy;
	}

	/**
	 * 设置创建人
	 *
	 * @param createBy 创建人
	 */
	public void setCreateBy(Long createBy) {
		this.createBy = createBy;
	}
}