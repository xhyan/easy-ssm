package com.xhyan.zero.common.domain;

import lombok.Data;

import java.util.Date;
import javax.persistence.*;

@Data
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
}