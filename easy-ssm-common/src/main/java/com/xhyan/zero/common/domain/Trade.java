package com.xhyan.zero.common.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "trade")
public class Trade extends BaseDomain{

    /**
     * 交易名称
     */
    private String name;

    /**
     * 交易商户的id
     */
    @Column(name = "partner_id")
    private Long partnerId;

    /**
     * 商户的外部交易号(如订单号)
     */
    @Column(name = "out_trade_no")
    private String outTradeNo;

    /**
     * 支付账户(account .id)
     */
    @Column(name = "buyer_account_id")
    private Long buyerAccountId;

    /**
     * 收款账户(account .id)
     */
    @Column(name = "seller_account_id")
    private Long sellerAccountId;

    /**
     * 交易类型(关联trade_type.id)
     */
    @Column(name = "trade_type")
    private Byte tradeType;

    /**
     * 交易金额,单位:分
     */
    private Long amount;

    /**
     * 交易实际成交金额
     */
    @Column(name = "occur_amount")
    private Long occurAmount;

    /**
     * 交易的商品展示url
     */
    @Column(name = "show_url")
    private String showUrl;

    /**
     * 支付完成后返回到商户系统的url
     */
    @Column(name = "return_url")
    private String returnUrl;

    /**
     * 商户的交易同步的url
     */
    @Column(name = "notify_url")
    private String notifyUrl;

    /**
     * 交易商品图片url
     */
    @Column(name = "goods_picture_url")
    private String goodsPictureUrl;

    /**
     * 付款时间
     */
    @Column(name = "pay_time")
    private Date payTime;

    /**
     * 卖家发货时间
     */
    @Column(name = "send_goods_time")
    private Date sendGoodsTime;

    /**
     * 交易结束时间
     */
    @Column(name = "finish_time")
    private Date finishTime;

    /**
     * 交易状态
     */
    private Byte status;

    /**
     * 支付其它费用集合(格式:付款方1^收款方1^金额1^费用明目1|付款方2^收款方2^金额2^费用明目2)
     */
    @Column(name = "pay_cost_items")
    private String payCostItems;

    /**
     * 备注
     */
    private String comment;


    /**
     * 扩展字段 json格式
     */
    private String reserved;
    /**
     * 获取交易名称
     *
     * @return name - 交易名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置交易名称
     *
     * @param name 交易名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取交易商户的id
     *
     * @return partner_id - 交易商户的id
     */
    public Long getPartnerId() {
        return partnerId;
    }

    /**
     * 设置交易商户的id
     *
     * @param partnerId 交易商户的id
     */
    public void setPartnerId(Long partnerId) {
        this.partnerId = partnerId;
    }

    /**
     * 获取商户的外部交易号(如订单号)
     *
     * @return out_trade_no - 商户的外部交易号(如订单号)
     */
    public String getOutTradeNo() {
        return outTradeNo;
    }

    /**
     * 设置商户的外部交易号(如订单号)
     *
     * @param outTradeNo 商户的外部交易号(如订单号)
     */
    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    /**
     * 获取支付账户(account .id)
     *
     * @return buyer_account_id - 支付账户(account .id)
     */
    public Long getBuyerAccountId() {
        return buyerAccountId;
    }

    /**
     * 设置支付账户(account .id)
     *
     * @param buyerAccountId 支付账户(account .id)
     */
    public void setBuyerAccountId(Long buyerAccountId) {
        this.buyerAccountId = buyerAccountId;
    }

    /**
     * 获取收款账户(account .id)
     *
     * @return seller_account_id - 收款账户(account .id)
     */
    public Long getSellerAccountId() {
        return sellerAccountId;
    }

    /**
     * 设置收款账户(account .id)
     *
     * @param sellerAccountId 收款账户(account .id)
     */
    public void setSellerAccountId(Long sellerAccountId) {
        this.sellerAccountId = sellerAccountId;
    }

    /**
     * 获取交易类型(关联trade_type.id)
     *
     * @return trade_type - 交易类型(关联trade_type.id)
     */
    public Byte getTradeType() {
        return tradeType;
    }

    /**
     * 设置交易类型(关联trade_type.id)
     *
     * @param tradeType 交易类型(关联trade_type.id)
     */
    public void setTradeType(Byte tradeType) {
        this.tradeType = tradeType;
    }

    /**
     * 获取交易金额,单位:分
     *
     * @return amount - 交易金额,单位:分
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * 设置交易金额,单位:分
     *
     * @param amount 交易金额,单位:分
     */
    public void setAmount(Long amount) {
        this.amount = amount;
    }

    /**
     * 获取交易实际成交金额
     *
     * @return occur_amount - 交易实际成交金额
     */
    public Long getOccurAmount() {
        return occurAmount;
    }

    /**
     * 设置交易实际成交金额
     *
     * @param occurAmount 交易实际成交金额
     */
    public void setOccurAmount(Long occurAmount) {
        this.occurAmount = occurAmount;
    }

    /**
     * 获取交易的商品展示url
     *
     * @return show_url - 交易的商品展示url
     */
    public String getShowUrl() {
        return showUrl;
    }

    /**
     * 设置交易的商品展示url
     *
     * @param showUrl 交易的商品展示url
     */
    public void setShowUrl(String showUrl) {
        this.showUrl = showUrl;
    }

    /**
     * 获取支付完成后返回到商户系统的url
     *
     * @return return_url - 支付完成后返回到商户系统的url
     */
    public String getReturnUrl() {
        return returnUrl;
    }

    /**
     * 设置支付完成后返回到商户系统的url
     *
     * @param returnUrl 支付完成后返回到商户系统的url
     */
    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    /**
     * 获取商户的交易同步的url
     *
     * @return notify_url - 商户的交易同步的url
     */
    public String getNotifyUrl() {
        return notifyUrl;
    }

    /**
     * 设置商户的交易同步的url
     *
     * @param notifyUrl 商户的交易同步的url
     */
    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    /**
     * 获取交易商品图片url
     *
     * @return goods_picture_url - 交易商品图片url
     */
    public String getGoodsPictureUrl() {
        return goodsPictureUrl;
    }

    /**
     * 设置交易商品图片url
     *
     * @param goodsPictureUrl 交易商品图片url
     */
    public void setGoodsPictureUrl(String goodsPictureUrl) {
        this.goodsPictureUrl = goodsPictureUrl;
    }

    /**
     * 获取付款时间
     *
     * @return pay_time - 付款时间
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * 设置付款时间
     *
     * @param payTime 付款时间
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * 获取卖家发货时间
     *
     * @return send_goods_time - 卖家发货时间
     */
    public Date getSendGoodsTime() {
        return sendGoodsTime;
    }

    /**
     * 设置卖家发货时间
     *
     * @param sendGoodsTime 卖家发货时间
     */
    public void setSendGoodsTime(Date sendGoodsTime) {
        this.sendGoodsTime = sendGoodsTime;
    }

    /**
     * 获取交易结束时间
     *
     * @return finish_time - 交易结束时间
     */
    public Date getFinishTime() {
        return finishTime;
    }

    /**
     * 设置交易结束时间
     *
     * @param finishTime 交易结束时间
     */
    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    /**
     * 获取交易状态
     *
     * @return status - 交易状态
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置交易状态
     *
     * @param status 交易状态
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取支付其它费用集合(格式:付款方1^收款方1^金额1^费用明目1|付款方2^收款方2^金额2^费用明目2)
     *
     * @return pay_cost_items - 支付其它费用集合(格式:付款方1^收款方1^金额1^费用明目1|付款方2^收款方2^金额2^费用明目2)
     */
    public String getPayCostItems() {
        return payCostItems;
    }

    /**
     * 设置支付其它费用集合(格式:付款方1^收款方1^金额1^费用明目1|付款方2^收款方2^金额2^费用明目2)
     *
     * @param payCostItems 支付其它费用集合(格式:付款方1^收款方1^金额1^费用明目1|付款方2^收款方2^金额2^费用明目2)
     */
    public void setPayCostItems(String payCostItems) {
        this.payCostItems = payCostItems;
    }

    /**
     * 获取备注
     *
     * @return comment - 备注
     */
    public String getComment() {
        return comment;
    }

    /**
     * 设置备注
     *
     * @param comment 备注
     */
    public void setComment(String comment) {
        this.comment = comment;
    }


    /**
     * 获取扩展字段 json格式
     *
     * @return reserved - 扩展字段 json格式
     */
    public String getReserved() {
        return reserved;
    }

    /**
     * 设置扩展字段 json格式
     *
     * @param reserved 扩展字段 json格式
     */
    public void setReserved(String reserved) {
        this.reserved = reserved;
    }
}