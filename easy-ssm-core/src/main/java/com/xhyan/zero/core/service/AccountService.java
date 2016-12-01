package com.xhyan.zero.core.service;

import com.xhyan.zero.common.base.BaseService;
import com.xhyan.zero.common.domain.Account;
import com.xhyan.zero.core.dto.AccountDTO;

/**
 * 账户相关服务
 *
 * @author yanliwei
 * @create 2016/6/2
 */
public interface AccountService extends BaseService<Account>{

    /**
     * 获取账户信息
     * @param accountId
     * @return
     */
    Account getAccountById(Long accountId);
}
