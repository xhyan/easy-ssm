package com.xhyan.zero.common.base;

import lombok.Data;

import javax.persistence.Transient;

/**
 * 基础分页信息*
 */
@Data
public abstract class ZeroPage {
    /*每页数量*/
    @Transient
    private Integer pageSize;
    /*页码*/
    @Transient
    private Integer pageNo;
}
