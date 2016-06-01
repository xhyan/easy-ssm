package com.xhyan.zero.common.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "pipeline_bill")
public class PipelineBill {
    /**
     * id
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
     * 通道账号 (如：银行卡号,支付宝账号,地利宝资金账号；根据channel_id确定)
     */
    @Column(name = "channel_account")
    private String channelAccount;

    /**
     * 渠道的id
     */
    @Column(name = "channel_id")
    private Long channelId;

    /**
     * 通道ID
     */
    @Column(name = "pipeline_id")
    private Long pipelineId;

    /**
     * 发生的商户ID
     */
    @Column(name = "occurred_partner_id")
    private Long occurredPartnerId;

    /**
     * 业务编号id(充值id,提现id,转账id等)
     */
    @Column(name = "biz_num")
    private Long bizNum;

    /**
     * 业务类型(关联biz_type.id)
     */
    @Column(name = "biz_type")
    private Long bizType;

    /**
     * 流水类型:1收入,2支出
     */
    private Byte type;

    /**
     * 通道流水号(通道返回)
     */
    @Column(name = "channel_sn")
    private String channelSn;

    /**
     * 金额，单位：分
     */
    private Long amount;

    /**
     * 记账日(日切相关,对账时使用)
     */
    @Column(name = "trade_date")
    private Date tradeDate;

    /**
     * 通道返回的对账日期
     */
    @Column(name = "settle_date")
    private Date settleDate;

    /**
     * 通道流水状态:1处理中,2成功,3失败,4取消
     */
    private Byte status;

    /**
     * 备注
     */
    private String memo;

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
     * 获取id
     *
     * @return id - id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
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
     * 获取通道账号 (如：银行卡号,支付宝账号,地利宝资金账号；根据channel_id确定)
     *
     * @return channel_account - 通道账号 (如：银行卡号,支付宝账号,地利宝资金账号；根据channel_id确定)
     */
    public String getChannelAccount() {
        return channelAccount;
    }

    /**
     * 设置通道账号 (如：银行卡号,支付宝账号,地利宝资金账号；根据channel_id确定)
     *
     * @param channelAccount 通道账号 (如：银行卡号,支付宝账号,地利宝资金账号；根据channel_id确定)
     */
    public void setChannelAccount(String channelAccount) {
        this.channelAccount = channelAccount;
    }

    /**
     * 获取渠道的id
     *
     * @return channel_id - 渠道的id
     */
    public Long getChannelId() {
        return channelId;
    }

    /**
     * 设置渠道的id
     *
     * @param channelId 渠道的id
     */
    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    /**
     * 获取通道ID
     *
     * @return pipeline_id - 通道ID
     */
    public Long getPipelineId() {
        return pipelineId;
    }

    /**
     * 设置通道ID
     *
     * @param pipelineId 通道ID
     */
    public void setPipelineId(Long pipelineId) {
        this.pipelineId = pipelineId;
    }

    /**
     * 获取发生的商户ID
     *
     * @return occurred_partner_id - 发生的商户ID
     */
    public Long getOccurredPartnerId() {
        return occurredPartnerId;
    }

    /**
     * 设置发生的商户ID
     *
     * @param occurredPartnerId 发生的商户ID
     */
    public void setOccurredPartnerId(Long occurredPartnerId) {
        this.occurredPartnerId = occurredPartnerId;
    }

    /**
     * 获取业务编号id(充值id,提现id,转账id等)
     *
     * @return biz_num - 业务编号id(充值id,提现id,转账id等)
     */
    public Long getBizNum() {
        return bizNum;
    }

    /**
     * 设置业务编号id(充值id,提现id,转账id等)
     *
     * @param bizNum 业务编号id(充值id,提现id,转账id等)
     */
    public void setBizNum(Long bizNum) {
        this.bizNum = bizNum;
    }

    /**
     * 获取业务类型(关联biz_type.id)
     *
     * @return biz_type - 业务类型(关联biz_type.id)
     */
    public Long getBizType() {
        return bizType;
    }

    /**
     * 设置业务类型(关联biz_type.id)
     *
     * @param bizType 业务类型(关联biz_type.id)
     */
    public void setBizType(Long bizType) {
        this.bizType = bizType;
    }

    /**
     * 获取流水类型:1收入,2支出
     *
     * @return type - 流水类型:1收入,2支出
     */
    public Byte getType() {
        return type;
    }

    /**
     * 设置流水类型:1收入,2支出
     *
     * @param type 流水类型:1收入,2支出
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * 获取通道流水号(通道返回)
     *
     * @return channel_sn - 通道流水号(通道返回)
     */
    public String getChannelSn() {
        return channelSn;
    }

    /**
     * 设置通道流水号(通道返回)
     *
     * @param channelSn 通道流水号(通道返回)
     */
    public void setChannelSn(String channelSn) {
        this.channelSn = channelSn;
    }

    /**
     * 获取金额，单位：分
     *
     * @return amount - 金额，单位：分
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * 设置金额，单位：分
     *
     * @param amount 金额，单位：分
     */
    public void setAmount(Long amount) {
        this.amount = amount;
    }

    /**
     * 获取记账日(日切相关,对账时使用)
     *
     * @return trade_date - 记账日(日切相关,对账时使用)
     */
    public Date getTradeDate() {
        return tradeDate;
    }

    /**
     * 设置记账日(日切相关,对账时使用)
     *
     * @param tradeDate 记账日(日切相关,对账时使用)
     */
    public void setTradeDate(Date tradeDate) {
        this.tradeDate = tradeDate;
    }

    /**
     * 获取通道返回的对账日期
     *
     * @return settle_date - 通道返回的对账日期
     */
    public Date getSettleDate() {
        return settleDate;
    }

    /**
     * 设置通道返回的对账日期
     *
     * @param settleDate 通道返回的对账日期
     */
    public void setSettleDate(Date settleDate) {
        this.settleDate = settleDate;
    }

    /**
     * 获取通道流水状态:1处理中,2成功,3失败,4取消
     *
     * @return status - 通道流水状态:1处理中,2成功,3失败,4取消
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置通道流水状态:1处理中,2成功,3失败,4取消
     *
     * @param status 通道流水状态:1处理中,2成功,3失败,4取消
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取备注
     *
     * @return memo - 备注
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 设置备注
     *
     * @param memo 备注
     */
    public void setMemo(String memo) {
        this.memo = memo;
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