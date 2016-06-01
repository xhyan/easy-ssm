package com.xhyan.zero.common.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cru_transfer_bank")
public class CruTransferBank {
    /**
     * 转账银行设置id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 银行渠道id
     */
    @Column(name = "channel_id")
    private Long channelId;

    /**
     * 手续费率
     */
    @Column(name = "fee_percent")
    private String feePercent;

    /**
     * 到账时间,0立即到账,其他单位为小时
     */
    @Column(name = "receive_time")
    private Integer receiveTime;

    /**
     * 状态,1正常2暂停
     */
    private Integer status;

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
     * 获取转账银行设置id
     *
     * @return id - 转账银行设置id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置转账银行设置id
     *
     * @param id 转账银行设置id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取银行渠道id
     *
     * @return channel_id - 银行渠道id
     */
    public Long getChannelId() {
        return channelId;
    }

    /**
     * 设置银行渠道id
     *
     * @param channelId 银行渠道id
     */
    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    /**
     * 获取手续费率
     *
     * @return fee_percent - 手续费率
     */
    public String getFeePercent() {
        return feePercent;
    }

    /**
     * 设置手续费率
     *
     * @param feePercent 手续费率
     */
    public void setFeePercent(String feePercent) {
        this.feePercent = feePercent;
    }

    /**
     * 获取到账时间,0立即到账,其他单位为小时
     *
     * @return receive_time - 到账时间,0立即到账,其他单位为小时
     */
    public Integer getReceiveTime() {
        return receiveTime;
    }

    /**
     * 设置到账时间,0立即到账,其他单位为小时
     *
     * @param receiveTime 到账时间,0立即到账,其他单位为小时
     */
    public void setReceiveTime(Integer receiveTime) {
        this.receiveTime = receiveTime;
    }

    /**
     * 获取状态,1正常2暂停
     *
     * @return status - 状态,1正常2暂停
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态,1正常2暂停
     *
     * @param status 状态,1正常2暂停
     */
    public void setStatus(Integer status) {
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