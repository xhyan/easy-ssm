package com.xhyan.zero.common.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "merchants_contacts")
public class MerchantsContacts {
    /**
     * id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 商户id
     */
    @Column(name = "partner_id")
    private Long partnerId;

    /**
     * 联系人姓名
     */
    private String name;

    /**
     * 联系人职务
     */
    private String position;

    /**
     * 联系人地址
     */
    private String address;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 电话号
     */
    private String tel;

    /**
     * 邮件
     */
    private String email;

    /**
     * 创建时间
     */
    @Column(name = "gmt_create")
    private Date gmtCreate;

    /**
     * 修改时间
     */
    @Column(name = "gmt_modify")
    private Date gmtModify;

    /**
     * 获取id.
     *
     * @return id - id.
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置id.
     *
     * @param id id.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取商户id
     *
     * @return partner_id - 商户id
     */
    public Long getPartnerId() {
        return partnerId;
    }

    /**
     * 设置商户id
     *
     * @param partnerId 商户id
     */
    public void setPartnerId(Long partnerId) {
        this.partnerId = partnerId;
    }

    /**
     * 获取联系人姓名
     *
     * @return name - 联系人姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置联系人姓名
     *
     * @param name 联系人姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取联系人职务
     *
     * @return position - 联系人职务
     */
    public String getPosition() {
        return position;
    }

    /**
     * 设置联系人职务
     *
     * @param position 联系人职务
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * 获取联系人地址
     *
     * @return address - 联系人地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置联系人地址
     *
     * @param address 联系人地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取手机号
     *
     * @return mobile - 手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置手机号
     *
     * @param mobile 手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取电话号
     *
     * @return tel - 电话号
     */
    public String getTel() {
        return tel;
    }

    /**
     * 设置电话号
     *
     * @param tel 电话号
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * 获取邮件
     *
     * @return email - 邮件
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮件
     *
     * @param email 邮件
     */
    public void setEmail(String email) {
        this.email = email;
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
     * 获取修改时间
     *
     * @return gmt_modify - 修改时间
     */
    public Date getGmtModify() {
        return gmtModify;
    }

    /**
     * 设置修改时间
     *
     * @param gmtModify 修改时间
     */
    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }
}