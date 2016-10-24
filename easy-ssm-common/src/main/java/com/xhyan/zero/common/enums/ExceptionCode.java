package com.xhyan.zero.common.enums;

/**
 * 系统统一异常错我码定义
 *
 * @author yanliwei
 * @create 2016/6/2
 */
public enum ExceptionCode {

    SYSTEM_ERROR("system.error"),
    ACCOUNT_NOT_FOUND("account.not.found"),
    LIST_ATTR_COPY_ERROR("list.attr.copy.error")
    ;


    private String code;

    ExceptionCode(String code){
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
