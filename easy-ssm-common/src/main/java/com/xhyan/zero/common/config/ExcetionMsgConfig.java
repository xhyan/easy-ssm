package com.xhyan.zero.common.config;

import org.aeonbits.owner.Accessible;
import org.aeonbits.owner.Config;

/**
 * ${DESCRIPTION}
 *
 * @author yanliwei
 * @create 2016/6/3
 */
@Config.Sources("classpath:config/exception-msg.properties")
public interface ExcetionMsgConfig extends Config, Accessible{
}
