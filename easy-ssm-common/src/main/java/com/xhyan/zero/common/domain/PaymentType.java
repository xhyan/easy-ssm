package com.xhyan.zero.common.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "payment_type")
public class PaymentType {
    /**
     * 支付方式id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 支付方式代码
     */
    private String code;

    /**
     * 支付方式的名称
     */
    private String name;

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
     * 获取支付方式id
     *
     * @return id - 支付方式id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置支付方式id
     *
     * @param id 支付方式id
     */
    public void setId(Long id) {
        this.id = id;
    }

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
}