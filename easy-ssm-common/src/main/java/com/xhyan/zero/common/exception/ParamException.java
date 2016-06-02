package com.xhyan.zero.common.exception;

/**
 * 系统参数统一异常
 *
 * @author yanliwei
 * @create 2016/6/2
 */
public class ParamException extends ZeroException {

    public ParamException(Throwable cause) {
        super(cause);
    }

    public ParamException(String errorMsg) {
        super(errorMsg);
    }

    public ParamException(String errorCode, String errorMsg) {
        super(errorCode, errorMsg);
    }
}
