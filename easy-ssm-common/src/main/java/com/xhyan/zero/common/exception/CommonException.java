package com.xhyan.zero.common.exception;

/**
 * ${DESCRIPTION}
 *
 * @author yanliwei
 * @create 2016/6/4
 */
public class CommonException extends BaseZeroException {

    public CommonException(Throwable cause) {
        super(cause);
    }

    public CommonException(String errorMsg) {
        super(errorMsg);
    }

    public CommonException(String errorCode, String errorMsg) {
        super(errorCode, errorMsg);
    }
}
