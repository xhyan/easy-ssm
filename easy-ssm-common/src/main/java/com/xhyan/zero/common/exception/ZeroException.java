package com.xhyan.zero.common.exception;

/**
 * 工程的基础业务异常
 *
 * @author yanliwei
 * @create 2016/6/2
 */
public class ZeroException extends RuntimeException {

    private String code;    //错误码
    private String msg;     //错误信息

    public ZeroException(Throwable cause){
        super(cause);
    }

    public ZeroException(String errorMsg){
        super(errorMsg);
        this.msg = errorMsg;
    }

    public ZeroException(String errorCode, String errorMsg){
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
