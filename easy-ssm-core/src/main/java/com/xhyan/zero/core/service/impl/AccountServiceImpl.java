package com.xhyan.zero.core.service.impl;

import com.xhyan.zero.common.domain.Account;
import com.xhyan.zero.common.mapper.AccountMapper;
import com.xhyan.zero.core.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 账户相关服务实现
 *
 * @author yanliwei
 * @create 2016/6/2
 */
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;
    @Override
    public Account getAccountById(Long accountId) {
        Account account = accountMapper.selectByPrimaryKey(accountId);

        return account;
    }
}
