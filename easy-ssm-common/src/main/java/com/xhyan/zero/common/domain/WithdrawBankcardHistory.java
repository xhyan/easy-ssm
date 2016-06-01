package com.xhyan.zero.common.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "withdraw_bankcard_history")
public class WithdrawBankcardHistory {
    /**
     * （转账银行卡历史Id）主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 转出地利宝账户id
     */
    @Column(name = "account_id")
    private Long accountId;

    /**
     * 银行卡对应的银行渠道Id
     */
    @Column(name = "channel_id")
    private Long channelId;

    /**
     * 银行卡号
     */
    @Column(name = "bank_card_number")
    private String bankCardNumber;

    /**
     * 银行卡账户名
     */
    @Column(name = "bank_account_name")
    private String bankAccountName;

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
     * 获取（转账银行卡历史Id）主键
     *
     * @return id - （转账银行卡历史Id）主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置（转账银行卡历史Id）主键
     *
     * @param id （转账银行卡历史Id）主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取转出地利宝账户id
     *
     * @return account_id - 转出地利宝账户id
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * 设置转出地利宝账户id
     *
     * @param accountId 转出地利宝账户id
     */
    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    /**
     * 获取银行卡对应的银行渠道Id
     *
     * @return channel_id - 银行卡对应的银行渠道Id
     */
    public Long getChannelId() {
        return channelId;
    }

    /**
     * 设置银行卡对应的银行渠道Id
     *
     * @param channelId 银行卡对应的银行渠道Id
     */
    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    /**
     * 获取银行卡号
     *
     * @return bank_card_number - 银行卡号
     */
    public String getBankCardNumber() {
        return bankCardNumber;
    }

    /**
     * 设置银行卡号
     *
     * @param bankCardNumber 银行卡号
     */
    public void setBankCardNumber(String bankCardNumber) {
        this.bankCardNumber = bankCardNumber;
    }

    /**
     * 获取银行卡账户名
     *
     * @return bank_account_name - 银行卡账户名
     */
    public String getBankAccountName() {
        return bankAccountName;
    }

    /**
     * 设置银行卡账户名
     *
     * @param bankAccountName 银行卡账户名
     */
    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName;
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