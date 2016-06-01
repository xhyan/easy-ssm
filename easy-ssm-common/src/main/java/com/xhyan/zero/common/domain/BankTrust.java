package com.xhyan.zero.common.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "bank_trust")
public class BankTrust {
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 银行账号
     */
    @Column(name = "bank_num")
    private String bankNum;

    /**
     * 银行资金账号名称
     */
    @Column(name = "customer_name")
    private String customerName;

    /**
     * 开户行地址
     */
    private String address;

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
     * 获取id
     *
     * @return id - id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取银行账号
     *
     * @return bank_num - 银行账号
     */
    public String getBankNum() {
        return bankNum;
    }

    /**
     * 设置银行账号
     *
     * @param bankNum 银行账号
     */
    public void setBankNum(String bankNum) {
        this.bankNum = bankNum;
    }

    /**
     * 获取银行资金账号名称
     *
     * @return customer_name - 银行资金账号名称
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * 设置银行资金账号名称
     *
     * @param customerName 银行资金账号名称
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * 获取开户行地址
     *
     * @return address - 开户行地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置开户行地址
     *
     * @param address 开户行地址
     */
    public void setAddress(String address) {
        this.address = address;
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