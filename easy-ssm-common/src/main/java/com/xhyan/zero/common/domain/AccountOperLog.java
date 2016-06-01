package com.xhyan.zero.common.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "account_oper_log")
public class AccountOperLog {
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
     * 操作类型(1:冻结2:解冻3:受限4:解限5:注销)
     */
    private Byte type;

    /**
     * 操作员id
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 操作员姓名(冗余字段)
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 备注
     */
    private String remark;

    /**
     * 操作时间
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
     * 获取操作类型(1:冻结2:解冻3:受限4:解限5:注销)
     *
     * @return type - 操作类型(1:冻结2:解冻3:受限4:解限5:注销)
     */
    public Byte getType() {
        return type;
    }

    /**
     * 设置操作类型(1:冻结2:解冻3:受限4:解限5:注销)
     *
     * @param type 操作类型(1:冻结2:解冻3:受限4:解限5:注销)
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * 获取操作员id
     *
     * @return user_id - 操作员id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置操作员id
     *
     * @param userId 操作员id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取操作员姓名(冗余字段)
     *
     * @return user_name - 操作员姓名(冗余字段)
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置操作员姓名(冗余字段)
     *
     * @param userName 操作员姓名(冗余字段)
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取操作时间
     *
     * @return gmt_create - 操作时间
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * 设置操作时间
     *
     * @param gmtCreate 操作时间
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