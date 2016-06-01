package com.xhyan.zero.common.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "account_fund")
public class AccountFund {
    /**
     * 账户id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 账号id
     */
    @Column(name = "account_id")
    private Long accountId;

    /**
     * 资金类型，默认为0账户交易资金
     */
    private Byte type;

    /**
     * 可用余额
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
     * 日切可交易额度
     */
    @Column(name = "daily_balance")
    private Long dailyBalance;

    /**
     * 日切可交易信用额度
     */
    @Column(name = "daily_credit_amount")
    private Long dailyCreditAmount;

    /**
     * 日切已冻结额度
     */
    @Column(name = "daily_frozen_amount")
    private Long dailyFrozenAmount;

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
     * 获取账户id
     *
     * @return id - 账户id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置账户id
     *
     * @param id 账户id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取账号id
     *
     * @return account_id - 账号id
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * 设置账号id
     *
     * @param accountId 账号id
     */
    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    /**
     * 获取资金类型，默认为0账户交易资金
     *
     * @return type - 资金类型，默认为0账户交易资金
     */
    public Byte getType() {
        return type;
    }

    /**
     * 设置资金类型，默认为0账户交易资金
     *
     * @param type 资金类型，默认为0账户交易资金
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * 获取可用余额
     *
     * @return balance - 可用余额
     */
    public Long getBalance() {
        return balance;
    }

    /**
     * 设置可用余额
     *
     * @param balance 可用余额
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
     * 获取日切可交易额度
     *
     * @return daily_balance - 日切可交易额度
     */
    public Long getDailyBalance() {
        return dailyBalance;
    }

    /**
     * 设置日切可交易额度
     *
     * @param dailyBalance 日切可交易额度
     */
    public void setDailyBalance(Long dailyBalance) {
        this.dailyBalance = dailyBalance;
    }

    /**
     * 获取日切可交易信用额度
     *
     * @return daily_credit_amount - 日切可交易信用额度
     */
    public Long getDailyCreditAmount() {
        return dailyCreditAmount;
    }

    /**
     * 设置日切可交易信用额度
     *
     * @param dailyCreditAmount 日切可交易信用额度
     */
    public void setDailyCreditAmount(Long dailyCreditAmount) {
        this.dailyCreditAmount = dailyCreditAmount;
    }

    /**
     * 获取日切已冻结额度
     *
     * @return daily_frozen_amount - 日切已冻结额度
     */
    public Long getDailyFrozenAmount() {
        return dailyFrozenAmount;
    }

    /**
     * 设置日切已冻结额度
     *
     * @param dailyFrozenAmount 日切已冻结额度
     */
    public void setDailyFrozenAmount(Long dailyFrozenAmount) {
        this.dailyFrozenAmount = dailyFrozenAmount;
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