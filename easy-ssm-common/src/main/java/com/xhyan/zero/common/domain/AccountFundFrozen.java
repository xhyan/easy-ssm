package com.xhyan.zero.common.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "account_fund_frozen")
public class AccountFundFrozen {
    /**
     * 资金冻结记录id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 帐户的id
     */
    @Column(name = "account_id")
    private Long accountId;

    /**
     * 业务编号id(old-out_biz_no)
     */
    @Column(name = "biz_num")
    private Long bizNum;

    /**
     * 业务类型(biz_type.id)
     */
    @Column(name = "biz_type")
    private Byte bizType;

    /**
     * 冻结解冻的金额
     */
    private Long amount;

    /**
     * 使用信用额度
     */
    @Column(name = "credit_amount")
    private Long creditAmount;

    /**
     * 冻结状态:1冻结 2解冻
     */
    @Column(name = "freeze_status")
    private Byte freezeStatus;

    /**
     * 冻结时间
     */
    @Column(name = "freeze_date")
    private Date freezeDate;

    /**
     * 解冻时间
     */
    @Column(name = "unfreeze_date")
    private Date unfreezeDate;

    /**
     * 冻结交易日
     */
    @Column(name = "freeze_trade_date")
    private Date freezeTradeDate;

    /**
     * 解冻交易日
     */
    @Column(name = "unfreeze_trade_date")
    private Date unfreezeTradeDate;

    /**
     * 备注
     */
    private String remark;

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
     * 获取资金冻结记录id
     *
     * @return id - 资金冻结记录id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置资金冻结记录id
     *
     * @param id 资金冻结记录id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取帐户的id
     *
     * @return account_id - 帐户的id
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * 设置帐户的id
     *
     * @param accountId 帐户的id
     */
    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    /**
     * 获取业务编号id(old-out_biz_no)
     *
     * @return biz_num - 业务编号id(old-out_biz_no)
     */
    public Long getBizNum() {
        return bizNum;
    }

    /**
     * 设置业务编号id(old-out_biz_no)
     *
     * @param bizNum 业务编号id(old-out_biz_no)
     */
    public void setBizNum(Long bizNum) {
        this.bizNum = bizNum;
    }

    /**
     * 获取业务类型(biz_type.id)
     *
     * @return biz_type - 业务类型(biz_type.id)
     */
    public Byte getBizType() {
        return bizType;
    }

    /**
     * 设置业务类型(biz_type.id)
     *
     * @param bizType 业务类型(biz_type.id)
     */
    public void setBizType(Byte bizType) {
        this.bizType = bizType;
    }

    /**
     * 获取冻结解冻的金额
     *
     * @return amount - 冻结解冻的金额
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * 设置冻结解冻的金额
     *
     * @param amount 冻结解冻的金额
     */
    public void setAmount(Long amount) {
        this.amount = amount;
    }

    /**
     * 获取使用信用额度
     *
     * @return credit_amount - 使用信用额度
     */
    public Long getCreditAmount() {
        return creditAmount;
    }

    /**
     * 设置使用信用额度
     *
     * @param creditAmount 使用信用额度
     */
    public void setCreditAmount(Long creditAmount) {
        this.creditAmount = creditAmount;
    }

    /**
     * 获取冻结状态:1冻结 2解冻
     *
     * @return freeze_status - 冻结状态:1冻结 2解冻
     */
    public Byte getFreezeStatus() {
        return freezeStatus;
    }

    /**
     * 设置冻结状态:1冻结 2解冻
     *
     * @param freezeStatus 冻结状态:1冻结 2解冻
     */
    public void setFreezeStatus(Byte freezeStatus) {
        this.freezeStatus = freezeStatus;
    }

    /**
     * 获取冻结时间
     *
     * @return freeze_date - 冻结时间
     */
    public Date getFreezeDate() {
        return freezeDate;
    }

    /**
     * 设置冻结时间
     *
     * @param freezeDate 冻结时间
     */
    public void setFreezeDate(Date freezeDate) {
        this.freezeDate = freezeDate;
    }

    /**
     * 获取解冻时间
     *
     * @return unfreeze_date - 解冻时间
     */
    public Date getUnfreezeDate() {
        return unfreezeDate;
    }

    /**
     * 设置解冻时间
     *
     * @param unfreezeDate 解冻时间
     */
    public void setUnfreezeDate(Date unfreezeDate) {
        this.unfreezeDate = unfreezeDate;
    }

    /**
     * 获取冻结交易日
     *
     * @return freeze_trade_date - 冻结交易日
     */
    public Date getFreezeTradeDate() {
        return freezeTradeDate;
    }

    /**
     * 设置冻结交易日
     *
     * @param freezeTradeDate 冻结交易日
     */
    public void setFreezeTradeDate(Date freezeTradeDate) {
        this.freezeTradeDate = freezeTradeDate;
    }

    /**
     * 获取解冻交易日
     *
     * @return unfreeze_trade_date - 解冻交易日
     */
    public Date getUnfreezeTradeDate() {
        return unfreezeTradeDate;
    }

    /**
     * 设置解冻交易日
     *
     * @param unfreezeTradeDate 解冻交易日
     */
    public void setUnfreezeTradeDate(Date unfreezeTradeDate) {
        this.unfreezeTradeDate = unfreezeTradeDate;
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