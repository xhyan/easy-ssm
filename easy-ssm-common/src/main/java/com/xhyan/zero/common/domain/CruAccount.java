package com.xhyan.zero.common.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cru_account")
public class CruAccount {
    /**
     * 账户设置id
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
     * 限制前余额
     */
    private Long amount;

    /**
     * 受限功能
     */
    @Column(name = "limit_feature")
    private Integer limitFeature;

    /**
     * 限制时间
     */
    @Column(name = "limit_time")
    private Integer limitTime;

    /**
     * 限制时间单位,1小时,2天
     */
    @Column(name = "limit_unit")
    private Integer limitUnit;

    /**
     * 限制原因,1异常交易,2违反相关市场规范,3交易风险控制,4其他
     */
    @Column(name = "limit_reason")
    private Integer limitReason;

    /**
     * 说明
     */
    private String descr;

    /**
     * 通知用户方式,1站内信,2手机短信,3邮箱(多种方式用,分隔)
     */
    @Column(name = "notify_type")
    private String notifyType;

    /**
     * 添加限制操作员id
     */
    @Column(name = "op_user_id")
    private Long opUserId;

    /**
     * 创建时间
     */
    @Column(name = "gmt_create")
    private Date gmtCreate;

    /**
     * 记录状态(1:生效;2:失效)
     */
    private Integer status;

    /**
     * 解除限制操作员(0:自动解除限制)
     */
    @Column(name = "relieve_user_id")
    private Long relieveUserId;

    /**
     * 解除时间
     */
    @Column(name = "relieve_time")
    private Date relieveTime;

    /**
     * 获取账户设置id
     *
     * @return id - 账户设置id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置账户设置id
     *
     * @param id 账户设置id
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
     * 获取限制前余额
     *
     * @return amount - 限制前余额
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * 设置限制前余额
     *
     * @param amount 限制前余额
     */
    public void setAmount(Long amount) {
        this.amount = amount;
    }

    /**
     * 获取受限功能
     *
     * @return limit_feature - 受限功能
     */
    public Integer getLimitFeature() {
        return limitFeature;
    }

    /**
     * 设置受限功能
     *
     * @param limitFeature 受限功能
     */
    public void setLimitFeature(Integer limitFeature) {
        this.limitFeature = limitFeature;
    }

    /**
     * 获取限制时间
     *
     * @return limit_time - 限制时间
     */
    public Integer getLimitTime() {
        return limitTime;
    }

    /**
     * 设置限制时间
     *
     * @param limitTime 限制时间
     */
    public void setLimitTime(Integer limitTime) {
        this.limitTime = limitTime;
    }

    /**
     * 获取限制时间单位,1小时,2天
     *
     * @return limit_unit - 限制时间单位,1小时,2天
     */
    public Integer getLimitUnit() {
        return limitUnit;
    }

    /**
     * 设置限制时间单位,1小时,2天
     *
     * @param limitUnit 限制时间单位,1小时,2天
     */
    public void setLimitUnit(Integer limitUnit) {
        this.limitUnit = limitUnit;
    }

    /**
     * 获取限制原因,1异常交易,2违反相关市场规范,3交易风险控制,4其他
     *
     * @return limit_reason - 限制原因,1异常交易,2违反相关市场规范,3交易风险控制,4其他
     */
    public Integer getLimitReason() {
        return limitReason;
    }

    /**
     * 设置限制原因,1异常交易,2违反相关市场规范,3交易风险控制,4其他
     *
     * @param limitReason 限制原因,1异常交易,2违反相关市场规范,3交易风险控制,4其他
     */
    public void setLimitReason(Integer limitReason) {
        this.limitReason = limitReason;
    }

    /**
     * 获取说明
     *
     * @return descr - 说明
     */
    public String getDescr() {
        return descr;
    }

    /**
     * 设置说明
     *
     * @param descr 说明
     */
    public void setDescr(String descr) {
        this.descr = descr;
    }

    /**
     * 获取通知用户方式,1站内信,2手机短信,3邮箱(多种方式用,分隔)
     *
     * @return notify_type - 通知用户方式,1站内信,2手机短信,3邮箱(多种方式用,分隔)
     */
    public String getNotifyType() {
        return notifyType;
    }

    /**
     * 设置通知用户方式,1站内信,2手机短信,3邮箱(多种方式用,分隔)
     *
     * @param notifyType 通知用户方式,1站内信,2手机短信,3邮箱(多种方式用,分隔)
     */
    public void setNotifyType(String notifyType) {
        this.notifyType = notifyType;
    }

    /**
     * 获取添加限制操作员id
     *
     * @return op_user_id - 添加限制操作员id
     */
    public Long getOpUserId() {
        return opUserId;
    }

    /**
     * 设置添加限制操作员id
     *
     * @param opUserId 添加限制操作员id
     */
    public void setOpUserId(Long opUserId) {
        this.opUserId = opUserId;
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
     * 获取记录状态(1:生效;2:失效)
     *
     * @return status - 记录状态(1:生效;2:失效)
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置记录状态(1:生效;2:失效)
     *
     * @param status 记录状态(1:生效;2:失效)
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取解除限制操作员(0:自动解除限制)
     *
     * @return relieve_user_id - 解除限制操作员(0:自动解除限制)
     */
    public Long getRelieveUserId() {
        return relieveUserId;
    }

    /**
     * 设置解除限制操作员(0:自动解除限制)
     *
     * @param relieveUserId 解除限制操作员(0:自动解除限制)
     */
    public void setRelieveUserId(Long relieveUserId) {
        this.relieveUserId = relieveUserId;
    }

    /**
     * 获取解除时间
     *
     * @return relieve_time - 解除时间
     */
    public Date getRelieveTime() {
        return relieveTime;
    }

    /**
     * 设置解除时间
     *
     * @param relieveTime 解除时间
     */
    public void setRelieveTime(Date relieveTime) {
        this.relieveTime = relieveTime;
    }
}