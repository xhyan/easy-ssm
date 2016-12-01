package com.xhyan.zero.core.service.impl;

import com.xhyan.zero.common.base.BaseServiceImpl;
import com.xhyan.zero.common.domain.Account;
import com.xhyan.zero.common.enums.ExceptionCode;
import com.xhyan.zero.common.mapper.AccountMapper;
import com.xhyan.zero.common.utils.ExceptionUtil;
import com.xhyan.zero.core.dto.AccountDTO;
import com.xhyan.zero.core.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 账户相关服务实现
 *
 * @author yanliwei
 * @create 2016/6/2
 */
@Service("accountService")
public class AccountServiceImpl extends BaseServiceImpl<Account> implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public Account getAccountById(Long accountId) {
        Account account = super.selectByPrimaryKey(accountId);
        ExceptionUtil.throwCommonException(account == null, ExceptionCode.ACCOUNT_NOT_FOUND, accountId);
        return account;
    }
}
