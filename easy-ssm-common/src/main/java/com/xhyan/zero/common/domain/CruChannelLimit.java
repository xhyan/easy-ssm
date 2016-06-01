package com.xhyan.zero.common.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cru_channel_limit")
public class CruChannelLimit {
    /**
     * 限额id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 渠道id
     */
    @Column(name = "channel_id")
    private Long channelId;

    /**
     * 限额JSON串
     */
    @Column(name = "limit_content")
    private String limitContent;

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
     * 获取限额id
     *
     * @return id - 限额id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置限额id
     *
     * @param id 限额id
     */
    public void setId(Long id) {
        this.id = id;
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
     * 获取限额JSON串
     *
     * @return limit_content - 限额JSON串
     */
    public String getLimitContent() {
        return limitContent;
    }

    /**
     * 设置限额JSON串
     *
     * @param limitContent 限额JSON串
     */
    public void setLimitContent(String limitContent) {
        this.limitContent = limitContent;
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