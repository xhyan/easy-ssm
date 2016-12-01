package com.xhyan.zero.boss.service.impl;

import com.github.pagehelper.Page;
import com.xhyan.zero.boss.service.AccountVOService;
import com.xhyan.zero.boss.vo.AccountVO;
import com.xhyan.zero.common.domain.Account;
import com.xhyan.zero.common.enums.ExceptionCode;
import com.xhyan.zero.common.mapper.AccountMapper;
import com.xhyan.zero.common.utils.ExceptionUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/*
 * 账户相关视图服务实现
 *
 * @author yanliwei
 * @create 2016/6/29
 */

public class AccountVOServiceImpl implements AccountVOService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public AccountVO getAccountVOById(long accountId) {
        Account account = accountMapper.selectByPrimaryKey(accountId);
        ExceptionUtil.throwCommonException(null == account, ExceptionCode.ACCOUNT_NOT_FOUND, account);
        AccountVO accountVO = new AccountVO();
        BeanUtils.copyProperties(account, accountVO);
        return accountVO;
    }

    @Override
    public Page<AccountVO> getAccountVOPage(AccountVO accountVO) {

        Example example = new Example(Account.class, false, false);
        example.createCriteria()
                .andEqualTo("loginName", accountVO.getLoginName())
                .andEqualTo("mobile", accountVO.getMobile())
                .andEqualTo("email", accountVO.getEmail());
        List<Account> accounts = accountMapper.selectByExample(example);

        return null;
    }
}
