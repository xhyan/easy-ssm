package com.xhyan.zero.common.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "account_daily_snapshot")
public class AccountDailySnapshot {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 账户ID
     */
    @Column(name = "account_id")
    private Long accountId;

    /**
     * 账户可交易额度
     */
    private Long balance;

    /**
     * 可交易的信用额度
     */
    @Column(name = "credit_amount")
    private Long creditAmount;

    /**
     * 已冻结的额度
     */
    @Column(name = "frozen_amount")
    private Long frozenAmount;

    /**
     * 交易日
     */
    @Column(name = "trade_date")
    private Date tradeDate;

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
     * 获取账户ID
     *
     * @return account_id - 账户ID
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * 设置账户ID
     *
     * @param accountId 账户ID
     */
    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    /**
     * 获取账户可交易额度
     *
     * @return balance - 账户可交易额度
     */
    public Long getBalance() {
        return balance;
    }

    /**
     * 设置账户可交易额度
     *
     * @param balance 账户可交易额度
     */
    public void setBalance(Long balance) {
        this.balance = balance;
    }

    /**
     * 获取可交易的信用额度
     *
     * @return credit_amount - 可交易的信用额度
     */
    public Long getCreditAmount() {
        return creditAmount;
    }

    /**
     * 设置可交易的信用额度
     *
     * @param creditAmount 可交易的信用额度
     */
    public void setCreditAmount(Long creditAmount) {
        this.creditAmount = creditAmount;
    }

    /**
     * 获取已冻结的额度
     *
     * @return frozen_amount - 已冻结的额度
     */
    public Long getFrozenAmount() {
        return frozenAmount;
    }

    /**
     * 设置已冻结的额度
     *
     * @param frozenAmount 已冻结的额度
     */
    public void setFrozenAmount(Long frozenAmount) {
        this.frozenAmount = frozenAmount;
    }

    /**
     * 获取交易日
     *
     * @return trade_date - 交易日
     */
    public Date getTradeDate() {
        return tradeDate;
    }

    /**
     * 设置交易日
     *
     * @param tradeDate 交易日
     */
    public void setTradeDate(Date tradeDate) {
        this.tradeDate = tradeDate;
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