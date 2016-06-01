package com.xhyan.zero.common.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "transfer_account_history")
public class TransferAccountHistory {
    /**
     * 转账历史账户表Id(主键)
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 转出账户id
     */
    @Column(name = "fromAccountId")
    private Long fromaccountid;

    /**
     * 转入账户id
     */
    @Column(name = "toAccountId")
    private Long toaccountid;

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
     * 获取转账历史账户表Id(主键)
     *
     * @return id - 转账历史账户表Id(主键)
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置转账历史账户表Id(主键)
     *
     * @param id 转账历史账户表Id(主键)
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取转出账户id
     *
     * @return fromAccountId - 转出账户id
     */
    public Long getFromaccountid() {
        return fromaccountid;
    }

    /**
     * 设置转出账户id
     *
     * @param fromaccountid 转出账户id
     */
    public void setFromaccountid(Long fromaccountid) {
        this.fromaccountid = fromaccountid;
    }

    /**
     * 获取转入账户id
     *
     * @return toAccountId - 转入账户id
     */
    public Long getToaccountid() {
        return toaccountid;
    }

    /**
     * 设置转入账户id
     *
     * @param toaccountid 转入账户id
     */
    public void setToaccountid(Long toaccountid) {
        this.toaccountid = toaccountid;
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