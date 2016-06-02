package com.xhyan.zero.common.enums;

/**
 * ${DESCRIPTION}
 *
 * @author yanliwei
 * @create 2016/6/2
 */
public enum ExceptionCode {

    SYSTEM_ERROR("system.error");


    private String code;

    ExceptionCode(String code){
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
