package com.xhyan.zero.common.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "trade_refund")
public class TradeRefund {
    /**
     * 退款编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 交易号
     */
    @Column(name = "trade_id")
    private Long tradeId;

    /**
     * 发生的商户Id
     */
    @Column(name = "occurred_partner_id")
    private Long occurredPartnerId;

    /**
     * 退款方(account_id)
     */
    @Column(name = "refund_account_id")
    private Long refundAccountId;

    /**
     * 收款方(account_id)
     */
    @Column(name = "payee_account_id")
    private Long payeeAccountId;

    /**
     * 退款名称
     */
    @Column(name = "refund_name")
    private String refundName;

    /**
     * 退款金额
     */
    @Column(name = "refund_amount")
    private Long refundAmount;

    /**
     * 退款状态(1:已受理,2:处理中,3:失败,0:已退款)
     */
    @Column(name = "refund_status")
    private Byte refundStatus;

    /**
     * 创建时间(退款申请时间)
     */
    @Column(name = "gmt_create")
    private Date gmtCreate;

    /**
     * 最后修改时间
     */
    @Column(name = "gmt_modify")
    private Date gmtModify;

    /**
     * 获取退款编号
     *
     * @return id - 退款编号
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置退款编号
     *
     * @param id 退款编号
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取交易号
     *
     * @return trade_id - 交易号
     */
    public Long getTradeId() {
        return tradeId;
    }

    /**
     * 设置交易号
     *
     * @param tradeId 交易号
     */
    public void setTradeId(Long tradeId) {
        this.tradeId = tradeId;
    }

    /**
     * 获取发生的商户Id
     *
     * @return occurred_partner_id - 发生的商户Id
     */
    public Long getOccurredPartnerId() {
        return occurredPartnerId;
    }

    /**
     * 设置发生的商户Id
     *
     * @param occurredPartnerId 发生的商户Id
     */
    public void setOccurredPartnerId(Long occurredPartnerId) {
        this.occurredPartnerId = occurredPartnerId;
    }

    /**
     * 获取退款方(account_id)
     *
     * @return refund_account_id - 退款方(account_id)
     */
    public Long getRefundAccountId() {
        return refundAccountId;
    }

    /**
     * 设置退款方(account_id)
     *
     * @param refundAccountId 退款方(account_id)
     */
    public void setRefundAccountId(Long refundAccountId) {
        this.refundAccountId = refundAccountId;
    }

    /**
     * 获取收款方(account_id)
     *
     * @return payee_account_id - 收款方(account_id)
     */
    public Long getPayeeAccountId() {
        return payeeAccountId;
    }

    /**
     * 设置收款方(account_id)
     *
     * @param payeeAccountId 收款方(account_id)
     */
    public void setPayeeAccountId(Long payeeAccountId) {
        this.payeeAccountId = payeeAccountId;
    }

    /**
     * 获取退款名称
     *
     * @return refund_name - 退款名称
     */
    public String getRefundName() {
        return refundName;
    }

    /**
     * 设置退款名称
     *
     * @param refundName 退款名称
     */
    public void setRefundName(String refundName) {
        this.refundName = refundName;
    }

    /**
     * 获取退款金额
     *
     * @return refund_amount - 退款金额
     */
    public Long getRefundAmount() {
        return refundAmount;
    }

    /**
     * 设置退款金额
     *
     * @param refundAmount 退款金额
     */
    public void setRefundAmount(Long refundAmount) {
        this.refundAmount = refundAmount;
    }

    /**
     * 获取退款状态(1:已受理,2:处理中,3:失败,0:已退款)
     *
     * @return refund_status - 退款状态(1:已受理,2:处理中,3:失败,0:已退款)
     */
    public Byte getRefundStatus() {
        return refundStatus;
    }

    /**
     * 设置退款状态(1:已受理,2:处理中,3:失败,0:已退款)
     *
     * @param refundStatus 退款状态(1:已受理,2:处理中,3:失败,0:已退款)
     */
    public void setRefundStatus(Byte refundStatus) {
        this.refundStatus = refundStatus;
    }

    /**
     * 获取创建时间(退款申请时间)
     *
     * @return gmt_create - 创建时间(退款申请时间)
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * 设置创建时间(退款申请时间)
     *
     * @param gmtCreate 创建时间(退款申请时间)
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