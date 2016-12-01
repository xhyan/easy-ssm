package com.xhyan.zero.common.exception;

/**
 * 统一异常,业务异常中除了特殊定义异常
 *
 * @author yanliwei
 * @create 2016/6/4
 */
public class BusinessException extends BaseZeroException {

    public BusinessException(Throwable cause) {
        super(cause);
    }

    public BusinessException(String errorMsg) {
        super(errorMsg);
    }

    public BusinessException(String errorCode, String errorMsg) {
        super(errorCode, errorMsg);
    }
}
