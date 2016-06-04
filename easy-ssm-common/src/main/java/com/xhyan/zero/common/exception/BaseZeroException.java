package com.xhyan.zero.common.exception;

/**
 * 工程的基础业务异常
 *
 * @author yanliwei
 * @create 2016/6/2
 */
public class BaseZeroException extends RuntimeException {

    private String code;    //错误码
    private String msg;     //错误信息

    public BaseZeroException(Throwable cause){
        super(cause);
    }

    public BaseZeroException(String errorMsg){
        super(errorMsg);
        this.msg = errorMsg;
    }

    public BaseZeroException(String errorCode, String errorMsg){
        super(errorMsg);
        this.code = errorCode;
        this.msg = errorMsg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
