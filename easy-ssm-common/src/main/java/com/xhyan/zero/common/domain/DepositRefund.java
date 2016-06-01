package com.xhyan.zero.common.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "deposit_refund")
public class DepositRefund {
    /**
     * 充值退回id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 渠道充值记录id
     */
    @Column(name = "deposit_id")
    private Long depositId;

    /**
     * 账户id
     */
    @Column(name = "account_id")
    private Long accountId;

    /**
     * 渠道id
     */
    @Column(name = "channel_id")
    private Long channelId;

    /**
     *  通道ID
     */
    @Column(name = "pipeline_id")
    private Long pipelineId;

    /**
     * 充值金额
     */
    private Long amount;

    /**
     * 交易日
     */
    @Column(name = "trade_date")
    private Date tradeDate;

    /**
     * 充值退回状态：1成功2失败3处理中
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
     * 获取充值退回id
     *
     * @return id - 充值退回id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置充值退回id
     *
     * @param id 充值退回id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取渠道充值记录id
     *
     * @return deposit_id - 渠道充值记录id
     */
    public Long getDepositId() {
        return depositId;
    }

    /**
     * 设置渠道充值记录id
     *
     * @param depositId 渠道充值记录id
     */
    public void setDepositId(Long depositId) {
        this.depositId = depositId;
    }

    /**
     * 获取账户id
     *
     * @return account_id - 账户id
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * 设置账户id
     *
     * @param accountId 账户id
     */
    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    /**
     * 获取渠道id
     *
     * @return channel_id - 渠道id
     */
    public Long getChannelId() {
        return channelId;
    }

    /**
     * 设置渠道id
     *
     * @param channelId 渠道id
     */
    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    /**
     * 获取 通道ID
     *
     * @return pipeline_id -  通道ID
     */
    public Long getPipelineId() {
        return pipelineId;
    }

    /**
     * 设置 通道ID
     *
     * @param pipelineId  通道ID
     */
    public void setPipelineId(Long pipelineId) {
        this.pipelineId = pipelineId;
    }

    /**
     * 获取充值金额
     *
     * @return amount - 充值金额
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * 设置充值金额
     *
     * @param amount 充值金额
     */
    public void setAmount(Long amount) {
        this.amount = amount;
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
     * 获取充值退回状态：1成功2失败3处理中
     *
     * @return status - 充值退回状态：1成功2失败3处理中
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置充值退回状态：1成功2失败3处理中
     *
     * @param status 充值退回状态：1成功2失败3处理中
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