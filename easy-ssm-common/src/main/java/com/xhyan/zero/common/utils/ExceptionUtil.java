package com.xhyan.zero.common.utils;

import com.xhyan.zero.common.config.ExceptionMsgConfig;
import com.xhyan.zero.common.enums.ExceptionCode;
import com.xhyan.zero.common.exception.CommonException;
import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigCache;

import java.text.MessageFormat;

/**
 * 系统异常的工具类
 *
 * @author yanliwei
 * @create 2016/6/3
 */
public class ExceptionUtil {
    //异常信息配置文件映射
    private static ExceptionMsgConfig msgConfig = ConfigCache.getOrCreate(ExceptionMsgConfig.class);

    public static void throwCommonException(ExceptionCode code) {
        throw new CommonException(code.getCode(), msgConfig.getProperty(code
                .getCode()));
    }

    public static void throwCommonException(boolean condition, ExceptionCode code) {
        if (condition) {
            throw new CommonException(code.getCode(), msgConfig.getProperty(code
                    .getCode()));
        }
    }

    public static void throwCommonException(boolean condition, ExceptionCode code, Object... objects) {
        if (condition) {
            String errorMsg = MessageFormat.format(code.getCode(), objects);
            throw new CommonException(code.getCode(), errorMsg);
        }

    }
}
