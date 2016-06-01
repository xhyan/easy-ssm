package com.xhyan.zero.common.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "trade_payment")
public class TradePayment {
    /**
     * 支付记录id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 关联交易号ID(trade.id)
     */
    @Column(name = "trade_id")
    private Long tradeId;

    /**
     * 付款账户(account.id)
     */
    @Column(name = "src_account_id")
    private Long srcAccountId;

    /**
     * 收款账户(account.id)
     */
    @Column(name = "des_account_id")
    private Long desAccountId;

    /**
     * 支付总额
     */
    private Long amount;

    /**
     * 使用的余额额度
     */
    @Column(name = "used_balance")
    private Long usedBalance;

    /**
     * 使用信用余额
     */
    @Column(name = "used_credit")
    private Long usedCredit;

    /**
     * 交易日
     */
    @Column(name = "trade_date")
    private Date tradeDate;

    /**
     * 付款备注
     */
    private String comment;

    /**
     * 状态:1待付款,2付款成功,3付款失败
     */
    private Byte status;

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
     * 获取支付记录id
     *
     * @return id - 支付记录id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置支付记录id
     *
     * @param id 支付记录id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取关联交易号ID(trade.id)
     *
     * @return trade_id - 关联交易号ID(trade.id)
     */
    public Long getTradeId() {
        return tradeId;
    }

    /**
     * 设置关联交易号ID(trade.id)
     *
     * @param tradeId 关联交易号ID(trade.id)
     */
    public void setTradeId(Long tradeId) {
        this.tradeId = tradeId;
    }

    /**
     * 获取付款账户(account.id)
     *
     * @return src_account_id - 付款账户(account.id)
     */
    public Long getSrcAccountId() {
        return srcAccountId;
    }

    /**
     * 设置付款账户(account.id)
     *
     * @param srcAccountId 付款账户(account.id)
     */
    public void setSrcAccountId(Long srcAccountId) {
        this.srcAccountId = srcAccountId;
    }

    /**
     * 获取收款账户(account.id)
     *
     * @return des_account_id - 收款账户(account.id)
     */
    public Long getDesAccountId() {
        return desAccountId;
    }

    /**
     * 设置收款账户(account.id)
     *
     * @param desAccountId 收款账户(account.id)
     */
    public void setDesAccountId(Long desAccountId) {
        this.desAccountId = desAccountId;
    }

    /**
     * 获取支付总额
     *
     * @return amount - 支付总额
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * 设置支付总额
     *
     * @param amount 支付总额
     */
    public void setAmount(Long amount) {
        this.amount = amount;
    }

    /**
     * 获取使用的余额额度
     *
     * @return used_balance - 使用的余额额度
     */
    public Long getUsedBalance() {
        return usedBalance;
    }

    /**
     * 设置使用的余额额度
     *
     * @param usedBalance 使用的余额额度
     */
    public void setUsedBalance(Long usedBalance) {
        this.usedBalance = usedBalance;
    }

    /**
     * 获取使用信用余额
     *
     * @return used_credit - 使用信用余额
     */
    public Long getUsedCredit() {
        return usedCredit;
    }

    /**
     * 设置使用信用余额
     *
     * @param usedCredit 使用信用余额
     */
    public void setUsedCredit(Long usedCredit) {
        this.usedCredit = usedCredit;
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
     * 获取付款备注
     *
     * @return comment - 付款备注
     */
    public String getComment() {
        return comment;
    }

    /**
     * 设置付款备注
     *
     * @param comment 付款备注
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * 获取状态:1待付款,2付款成功,3付款失败
     *
     * @return status - 状态:1待付款,2付款成功,3付款失败
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置状态:1待付款,2付款成功,3付款失败
     *
     * @param status 状态:1待付款,2付款成功,3付款失败
     */
    public void setStatus(Byte status) {
        this.status = status;
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