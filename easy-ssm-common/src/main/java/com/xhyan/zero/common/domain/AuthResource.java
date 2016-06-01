package com.xhyan.zero.common.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "auth_resource")
public class AuthResource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * URL路径
     */
    @Column(name = "url_path")
    private String urlPath;

    @Column(name = "parent_id")
    private String parentId;

    /**
     * 描述
     */
    private String remark;

    @Column(name = "gmt_create")
    private Date gmtCreate;

    @Column(name = "gmt_modify")
    private Date gmtModify;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取URL路径
     *
     * @return url_path - URL路径
     */
    public String getUrlPath() {
        return urlPath;
    }

    /**
     * 设置URL路径
     *
     * @param urlPath URL路径
     */
    public void setUrlPath(String urlPath) {
        this.urlPath = urlPath;
    }

    /**
     * @return parent_id
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * @param parentId
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取描述
     *
     * @return remark - 描述
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置描述
     *
     * @param remark 描述
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * @return gmt_create
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * @param gmtCreate
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * @return gmt_modify
     */
    public Date getGmtModify() {
        return gmtModify;
    }

    /**
     * @param gmtModify
     */
    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }
}