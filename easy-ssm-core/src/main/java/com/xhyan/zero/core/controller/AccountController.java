package com.xhyan.zero.core.controller;

import com.xhyan.zero.core.dto.AccountDTO;
import com.xhyan.zero.core.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xhyan on 16-11-20.
 */
@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @Autowired
    private DiscoveryClient client;

    @RequestMapping(path = "/{accountId}", method = RequestMethod.GET)
    public AccountDTO getOne(@PathVariable Long accountId){
        accountService.getAccountById(accountId);
        return new AccountDTO();
    }
}
