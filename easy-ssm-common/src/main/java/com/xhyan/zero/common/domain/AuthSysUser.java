package com.xhyan.zero.common.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "auth_sys_user")
public class AuthSysUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 登录名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 用户状态
     */
    private Boolean status;

    /**
     * 密码
     */
    private String password;

    @Column(name = "real_name")
    private String realName;

    private Boolean sex;

    private String phone;

    private String mobile;

    private String email;

    @Column(name = "last_login")
    private Date lastLogin;

    @Column(name = "valid_begin_time")
    private Date validBeginTime;

    @Column(name = "valid_end_time")
    private Date validEndTime;

    private String remark;

    /**
     * 是否是超级管理员
     */
    @Column(name = "is_super")
    private Byte isSuper;

    @Column(name = "gmt_create")
    private Date gmtCreate;

    @Column(name = "gmt_modify")
    private Date gmtModify;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取登录名
     *
     * @return user_name - 登录名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置登录名
     *
     * @param userName 登录名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取用户状态
     *
     * @return status - 用户状态
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 设置用户状态
     *
     * @param status 用户状态
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return real_name
     */
    public String getRealName() {
        return realName;
    }

    /**
     * @param realName
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * @return sex
     */
    public Boolean getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return last_login
     */
    public Date getLastLogin() {
        return lastLogin;
    }

    /**
     * @param lastLogin
     */
    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    /**
     * @return valid_begin_time
     */
    public Date getValidBeginTime() {
        return validBeginTime;
    }

    /**
     * @param validBeginTime
     */
    public void setValidBeginTime(Date validBeginTime) {
        this.validBeginTime = validBeginTime;
    }

    /**
     * @return valid_end_time
     */
    public Date getValidEndTime() {
        return validEndTime;
    }

    /**
     * @param validEndTime
     */
    public void setValidEndTime(Date validEndTime) {
        this.validEndTime = validEndTime;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取是否是超级管理员
     *
     * @return is_super - 是否是超级管理员
     */
    public Byte getIsSuper() {
        return isSuper;
    }

    /**
     * 设置是否是超级管理员
     *
     * @param isSuper 是否是超级管理员
     */
    public void setIsSuper(Byte isSuper) {
        this.isSuper = isSuper;
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