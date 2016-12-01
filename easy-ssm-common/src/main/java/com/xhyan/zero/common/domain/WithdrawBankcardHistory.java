package com.xhyan.zero.common.domain;

import com.xhyan.zero.common.base.BaseDomain;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "withdraw_bankcard_history")
public class WithdrawBankcardHistory extends BaseDomain {

    /**
     * 转出地利宝账户id
     */
    @Column(name = "account_id")
    private Long accountId;

    /**
     * 银行卡对应的银行渠道Id
     */
    @Column(name = "channel_id")
    private Long channelId;

    /**
     * 银行卡号
     */
    @Column(name = "bank_card_number")
    private String bankCardNumber;

    /**
     * 银行卡账户名
     */
    @Column(name = "bank_account_name")
    private String bankAccountName;
}