package com.xhyan.zero.common.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "service_resource")
public class ServiceResource {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 服务key
     */
    private String key;

    /**
     * 服务名
     */
    private String name;

    /**
     * 服务描述
     */
    private String description;

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
     * 数据的版本号
     */
    private Integer version;

    /**
     * 数据的同步状态
     */
    @Column(name = "sync_status")
    private Byte syncStatus;

    /**
     * 最近一次同步数据的时间
     */
    @Column(name = "sync_time")
    private Date syncTime;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取服务key
     *
     * @return key - 服务key
     */
    public String getKey() {
        return key;
    }

    /**
     * 设置服务key
     *
     * @param key 服务key
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * 获取服务名
     *
     * @return name - 服务名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置服务名
     *
     * @param name 服务名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取服务描述
     *
     * @return description - 服务描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置服务描述
     *
     * @param description 服务描述
     */
    public void setDescription(String description) {
        this.description = description;
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
     * 获取数据的版本号
     *
     * @return version - 数据的版本号
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 设置数据的版本号
     *
     * @param version 数据的版本号
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * 获取数据的同步状态
     *
     * @return sync_status - 数据的同步状态
     */
    public Byte getSyncStatus() {
        return syncStatus;
    }

    /**
     * 设置数据的同步状态
     *
     * @param syncStatus 数据的同步状态
     */
    public void setSyncStatus(Byte syncStatus) {
        this.syncStatus = syncStatus;
    }

    /**
     * 获取最近一次同步数据的时间
     *
     * @return sync_time - 最近一次同步数据的时间
     */
    public Date getSyncTime() {
        return syncTime;
    }

    /**
     * 设置最近一次同步数据的时间
     *
     * @param syncTime 最近一次同步数据的时间
     */
    public void setSyncTime(Date syncTime) {
        this.syncTime = syncTime;
    }
}