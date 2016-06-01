package com.xhyan.zero.common.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cru_acctount_withdraw")
public class CruAcctountWithdraw {
    /**
     * 账户提现规则id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 账户Id
     */
    @Column(name = "account_id")
    private Long accountId;

    /**
     * 账户类型(冗余字段),与account.type相同
     */
    @Column(name = "cru_account_type")
    private Byte cruAccountType;

    /**
     * 日提现额度
     */
    @Column(name = "daily_amount")
    private Long dailyAmount;

    /**
     * 每笔最低提现金额
     */
    @Column(name = "each_min_amount")
    private Long eachMinAmount;

    /**
     * 日提现次数
     */
    @Column(name = "daily_times")
    private Integer dailyTimes;

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
     * 状态(1:生效2:失效)
     */
    private Integer status;

    /**
     * 获取账户提现规则id
     *
     * @return id - 账户提现规则id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置账户提现规则id
     *
     * @param id 账户提现规则id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取账户Id
     *
     * @return account_id - 账户Id
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * 设置账户Id
     *
     * @param accountId 账户Id
     */
    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    /**
     * 获取账户类型(冗余字段),与account.type相同
     *
     * @return cru_account_type - 账户类型(冗余字段),与account.type相同
     */
    public Byte getCruAccountType() {
        return cruAccountType;
    }

    /**
     * 设置账户类型(冗余字段),与account.type相同
     *
     * @param cruAccountType 账户类型(冗余字段),与account.type相同
     */
    public void setCruAccountType(Byte cruAccountType) {
        this.cruAccountType = cruAccountType;
    }

    /**
     * 获取日提现额度
     *
     * @return daily_amount - 日提现额度
     */
    public Long getDailyAmount() {
        return dailyAmount;
    }

    /**
     * 设置日提现额度
     *
     * @param dailyAmount 日提现额度
     */
    public void setDailyAmount(Long dailyAmount) {
        this.dailyAmount = dailyAmount;
    }

    /**
     * 获取每笔最低提现金额
     *
     * @return each_min_amount - 每笔最低提现金额
     */
    public Long getEachMinAmount() {
        return eachMinAmount;
    }

    /**
     * 设置每笔最低提现金额
     *
     * @param eachMinAmount 每笔最低提现金额
     */
    public void setEachMinAmount(Long eachMinAmount) {
        this.eachMinAmount = eachMinAmount;
    }

    /**
     * 获取日提现次数
     *
     * @return daily_times - 日提现次数
     */
    public Integer getDailyTimes() {
        return dailyTimes;
    }

    /**
     * 设置日提现次数
     *
     * @param dailyTimes 日提现次数
     */
    public void setDailyTimes(Integer dailyTimes) {
        this.dailyTimes = dailyTimes;
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
     * 获取状态(1:生效2:失效)
     *
     * @return status - 状态(1:生效2:失效)
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态(1:生效2:失效)
     *
     * @param status 状态(1:生效2:失效)
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}