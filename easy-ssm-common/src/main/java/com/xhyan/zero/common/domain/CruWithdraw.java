package com.xhyan.zero.common.domain;

import javax.persistence.*;

@Table(name = "cru_withdraw")
public class CruWithdraw {
    /**
     * 提现规则id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 账户类型(1:个人账户2：企业账户3：商户账户)
     */
    @Column(name = "account_type")
    private Integer accountType;

    /**
     * 规则名(不再使用)
     */
    private String name;

    /**
     * 备注(不再使用)
     */
    private String comment;

    /**
     * 日提现额度
     */
    @Column(name = "daily_amount")
    private Long dailyAmount;

    /**
     * 最低提现金额
     */
    @Column(name = "min_amount")
    private Long minAmount;

    /**
     * 日提现次数
     */
    private Integer times;

    /**
     * 获取提现规则id
     *
     * @return id - 提现规则id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置提现规则id
     *
     * @param id 提现规则id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取账户类型(1:个人账户2：企业账户3：商户账户)
     *
     * @return account_type - 账户类型(1:个人账户2：企业账户3：商户账户)
     */
    public Integer getAccountType() {
        return accountType;
    }

    /**
     * 设置账户类型(1:个人账户2：企业账户3：商户账户)
     *
     * @param accountType 账户类型(1:个人账户2：企业账户3：商户账户)
     */
    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    /**
     * 获取规则名(不再使用)
     *
     * @return name - 规则名(不再使用)
     */
    public String getName() {
        return name;
    }

    /**
     * 设置规则名(不再使用)
     *
     * @param name 规则名(不再使用)
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取备注(不再使用)
     *
     * @return comment - 备注(不再使用)
     */
    public String getComment() {
        return comment;
    }

    /**
     * 设置备注(不再使用)
     *
     * @param comment 备注(不再使用)
     */
    public void setComment(String comment) {
        this.comment = comment;
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
     * 获取最低提现金额
     *
     * @return min_amount - 最低提现金额
     */
    public Long getMinAmount() {
        return minAmount;
    }

    /**
     * 设置最低提现金额
     *
     * @param minAmount 最低提现金额
     */
    public void setMinAmount(Long minAmount) {
        this.minAmount = minAmount;
    }

    /**
     * 获取日提现次数
     *
     * @return times - 日提现次数
     */
    public Integer getTimes() {
        return times;
    }

    /**
     * 设置日提现次数
     *
     * @param times 日提现次数
     */
    public void setTimes(Integer times) {
        this.times = times;
    }
}