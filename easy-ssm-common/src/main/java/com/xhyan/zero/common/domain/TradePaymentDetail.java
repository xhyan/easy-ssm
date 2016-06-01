package com.xhyan.zero.common.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "trade_payment_detail")
public class TradePaymentDetail {
    /**
     * 支付记录详情id
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
     * 支付记录id
     */
    @Column(name = "payment_id")
    private Long paymentId;

    /**
     * 渠道(支付)账号(地利宝账号，支付宝账号，微信账号，银行卡等)
     */
    @Column(name = "channel_account")
    private String channelAccount;

    /**
     * 渠道id(channel.id)
     */
    @Column(name = "channel_id")
    private Long channelId;

    /**
     * 通道ID
     */
    @Column(name = "pipeline_id")
    private Long pipelineId;

    /**
     * 退款渠道名称(冗余)
     */
    @Column(name = "channel_name")
    private String channelName;

    /**
     * 金额
     */
    private Long amount;

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
     * 获取支付记录详情id
     *
     * @return id - 支付记录详情id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置支付记录详情id
     *
     * @param id 支付记录详情id
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
     * 获取支付记录id
     *
     * @return payment_id - 支付记录id
     */
    public Long getPaymentId() {
        return paymentId;
    }

    /**
     * 设置支付记录id
     *
     * @param paymentId 支付记录id
     */
    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    /**
     * 获取渠道(支付)账号(地利宝账号，支付宝账号，微信账号，银行卡等)
     *
     * @return channel_account - 渠道(支付)账号(地利宝账号，支付宝账号，微信账号，银行卡等)
     */
    public String getChannelAccount() {
        return channelAccount;
    }

    /**
     * 设置渠道(支付)账号(地利宝账号，支付宝账号，微信账号，银行卡等)
     *
     * @param channelAccount 渠道(支付)账号(地利宝账号，支付宝账号，微信账号，银行卡等)
     */
    public void setChannelAccount(String channelAccount) {
        this.channelAccount = channelAccount;
    }

    /**
     * 获取渠道id(channel.id)
     *
     * @return channel_id - 渠道id(channel.id)
     */
    public Long getChannelId() {
        return channelId;
    }

    /**
     * 设置渠道id(channel.id)
     *
     * @param channelId 渠道id(channel.id)
     */
    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    /**
     * 获取通道ID
     *
     * @return pipeline_id - 通道ID
     */
    public Long getPipelineId() {
        return pipelineId;
    }

    /**
     * 设置通道ID
     *
     * @param pipelineId 通道ID
     */
    public void setPipelineId(Long pipelineId) {
        this.pipelineId = pipelineId;
    }

    /**
     * 获取退款渠道名称(冗余)
     *
     * @return channel_name - 退款渠道名称(冗余)
     */
    public String getChannelName() {
        return channelName;
    }

    /**
     * 设置退款渠道名称(冗余)
     *
     * @param channelName 退款渠道名称(冗余)
     */
    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    /**
     * 获取金额
     *
     * @return amount - 金额
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * 设置金额
     *
     * @param amount 金额
     */
    public void setAmount(Long amount) {
        this.amount = amount;
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