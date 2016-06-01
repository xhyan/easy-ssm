package com.xhyan.zero.common.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "account_verify")
public class AccountVerify {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 账户id
     */
    @Column(name = "account_id")
    private Long accountId;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 业务编码，每种业务有唯一的编码？？？
     */
    @Column(name = "business_code")
    private Integer businessCode;

    /**
     * 随机码
     */
    @Column(name = "random_code")
    private String randomCode;

    /**
     * 最后有效时间
     */
    private Date priod;

    /**
     * 验证码状态：1表示未使用 2表示已使用
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
     * 获取账户id
     *
     * @return account_id - 账户id
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * 设置账户id
     *
     * @param accountId 账户id
     */
    public void setAccountId(Long accountId) {
        this.accountId = accountId;
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
     * 获取业务编码，每种业务有唯一的编码？？？
     *
     * @return business_code - 业务编码，每种业务有唯一的编码？？？
     */
    public Integer getBusinessCode() {
        return businessCode;
    }

    /**
     * 设置业务编码，每种业务有唯一的编码？？？
     *
     * @param businessCode 业务编码，每种业务有唯一的编码？？？
     */
    public void setBusinessCode(Integer businessCode) {
        this.businessCode = businessCode;
    }

    /**
     * 获取随机码
     *
     * @return random_code - 随机码
     */
    public String getRandomCode() {
        return randomCode;
    }

    /**
     * 设置随机码
     *
     * @param randomCode 随机码
     */
    public void setRandomCode(String randomCode) {
        this.randomCode = randomCode;
    }

    /**
     * 获取最后有效时间
     *
     * @return priod - 最后有效时间
     */
    public Date getPriod() {
        return priod;
    }

    /**
     * 设置最后有效时间
     *
     * @param priod 最后有效时间
     */
    public void setPriod(Date priod) {
        this.priod = priod;
    }

    /**
     * 获取验证码状态：1表示未使用 2表示已使用
     *
     * @return status - 验证码状态：1表示未使用 2表示已使用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置验证码状态：1表示未使用 2表示已使用
     *
     * @param status 验证码状态：1表示未使用 2表示已使用
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