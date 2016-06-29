package com.xhyan.zero.common.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "transfer_account_history")
public class TransferAccountHistory {


    /**
     * 转出账户id
     */
    @Column(name = "src_account_id")
    private Long srcAccountId;

    /**
     * 转入账户id
     */
    @Column(name = "des_account_id")
    private Long desAccountId;

}