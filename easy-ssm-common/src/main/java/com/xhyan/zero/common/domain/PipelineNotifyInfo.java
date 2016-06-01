package com.xhyan.zero.common.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "pipeline_notify_info")
public class PipelineNotifyInfo {
    /**
     * 渠道支付通知记录
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 渠道收支记录id(pipeline.id)
     */
    @Column(name = "pipeline_bill_id")
    private Long pipelineBillId;

    /**
     * 回调类型：1转入(充值)，2转出(提现)
     */
    @Column(name = "notify_type")
    private Byte notifyType;

    /**
     * 通知时间
     */
    @Column(name = "notify_time")
    private Date notifyTime;

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
     * 通道通知参数列表(记录通道回调回转给我们的信息)
     */
    @Column(name = "notify_content")
    private String notifyContent;

    /**
     * 获取渠道支付通知记录
     *
     * @return id - 渠道支付通知记录
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置渠道支付通知记录
     *
     * @param id 渠道支付通知记录
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取渠道收支记录id(pipeline.id)
     *
     * @return pipeline_bill_id - 渠道收支记录id(pipeline.id)
     */
    public Long getPipelineBillId() {
        return pipelineBillId;
    }

    /**
     * 设置渠道收支记录id(pipeline.id)
     *
     * @param pipelineBillId 渠道收支记录id(pipeline.id)
     */
    public void setPipelineBillId(Long pipelineBillId) {
        this.pipelineBillId = pipelineBillId;
    }

    /**
     * 获取回调类型：1转入(充值)，2转出(提现)
     *
     * @return notify_type - 回调类型：1转入(充值)，2转出(提现)
     */
    public Byte getNotifyType() {
        return notifyType;
    }

    /**
     * 设置回调类型：1转入(充值)，2转出(提现)
     *
     * @param notifyType 回调类型：1转入(充值)，2转出(提现)
     */
    public void setNotifyType(Byte notifyType) {
        this.notifyType = notifyType;
    }

    /**
     * 获取通知时间
     *
     * @return notify_time - 通知时间
     */
    public Date getNotifyTime() {
        return notifyTime;
    }

    /**
     * 设置通知时间
     *
     * @param notifyTime 通知时间
     */
    public void setNotifyTime(Date notifyTime) {
        this.notifyTime = notifyTime;
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

    /**
     * 获取通道通知参数列表(记录通道回调回转给我们的信息)
     *
     * @return notify_content - 通道通知参数列表(记录通道回调回转给我们的信息)
     */
    public String getNotifyContent() {
        return notifyContent;
    }

    /**
     * 设置通道通知参数列表(记录通道回调回转给我们的信息)
     *
     * @param notifyContent 通道通知参数列表(记录通道回调回转给我们的信息)
     */
    public void setNotifyContent(String notifyContent) {
        this.notifyContent = notifyContent;
    }
}