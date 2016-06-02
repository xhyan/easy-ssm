package com.xhyan.zero.core.service;

import com.xhyan.zero.common.domain.Account;

/**
 * 账户相关服务
 *
 * @author yanliwei
 * @create 2016/6/2
 */
public interface AccountService {

    /**
     * 获取账户信息
     * @param accountId
     * @return
     */
    Account getAccountById(Long accountId);
}
