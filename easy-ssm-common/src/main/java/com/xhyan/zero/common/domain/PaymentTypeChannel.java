package com.xhyan.zero.common.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "payment_type_channel")
public class PaymentTypeChannel {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 支付方式
     */
    @Column(name = "payment_type_id")
    private Long paymentTypeId;

    /**
     * 支持的渠道id(channel.id)
     */
    @Column(name = "channel_id")
    private Long channelId;

    /**
     * 排序号
     */
    @Column(name = "sort_no")
    private Integer sortNo;

    /**
     * 状态,1开启,2暂停
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
     * 获取支付方式
     *
     * @return payment_type_id - 支付方式
     */
    public Long getPaymentTypeId() {
        return paymentTypeId;
    }

    /**
     * 设置支付方式
     *
     * @param paymentTypeId 支付方式
     */
    public void setPaymentTypeId(Long paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
    }

    /**
     * 获取支持的渠道id(channel.id)
     *
     * @return channel_id - 支持的渠道id(channel.id)
     */
    public Long getChannelId() {
        return channelId;
    }

    /**
     * 设置支持的渠道id(channel.id)
     *
     * @param channelId 支持的渠道id(channel.id)
     */
    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    /**
     * 获取排序号
     *
     * @return sort_no - 排序号
     */
    public Integer getSortNo() {
        return sortNo;
    }

    /**
     * 设置排序号
     *
     * @param sortNo 排序号
     */
    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }

    /**
     * 获取状态,1开启,2暂停
     *
     * @return status - 状态,1开启,2暂停
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态,1开启,2暂停
     *
     * @param status 状态,1开启,2暂停
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