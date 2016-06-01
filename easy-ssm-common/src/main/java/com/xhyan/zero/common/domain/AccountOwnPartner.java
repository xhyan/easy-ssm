package com.xhyan.zero.common.domain;

import javax.persistence.*;

@Table(name = "account_own_partner")
public class AccountOwnPartner {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 资金账号ID
     */
    @Column(name = "account_id")
    private Long accountId;

    /**
     * 接入方ID
     */
    @Column(name = "partner_id")
    private Long partnerId;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取资金账号ID
     *
     * @return account_id - 资金账号ID
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * 设置资金账号ID
     *
     * @param accountId 资金账号ID
     */
    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    /**
     * 获取接入方ID
     *
     * @return partner_id - 接入方ID
     */
    public Long getPartnerId() {
        return partnerId;
    }

    /**
     * 设置接入方ID
     *
     * @param partnerId 接入方ID
     */
    public void setPartnerId(Long partnerId) {
        this.partnerId = partnerId;
    }
}