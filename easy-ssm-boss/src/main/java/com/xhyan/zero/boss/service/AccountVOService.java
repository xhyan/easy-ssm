package com.xhyan.zero.boss.service;

import com.github.pagehelper.Page;
import com.xhyan.zero.boss.vo.AccountVO;

/*
 * 账户相关视图服务
 *
 * @author yanliwei
 * @create 2016/6/28
 */
public interface AccountVOService {
    /**
     * 根据id获取账户视图信息
     *
     * @param accountId     账户id
     **/
    AccountVO getAccountVOById(long accountId);

    /**
     * 获取账户视图信息分页列表
     *
     * @param accountVO     账户vo对象
     **/
    Page<AccountVO> getAccountVOPage(AccountVO accountVO);
}
