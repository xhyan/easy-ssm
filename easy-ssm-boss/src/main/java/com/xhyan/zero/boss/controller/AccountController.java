package com.xhyan.zero.boss.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xhyan on 16-10-24.
 */
@RestController
@RequestMapping(path = "/account")
@EnableAutoConfiguration
public class AccountController {
    @GetMapping(path = "/{id}")
    public String get(@PathVariable long id){
        return "hello";
    }
}
