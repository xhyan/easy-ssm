package com.xhyan.zero.common.utils;

import com.xhyan.zero.common.enums.ExceptionCode;
import com.xhyan.zero.common.exception.CommonException;
import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/*
 * bean工具类，扩展spring的BeanUtil
 * 
 * @author yanliwei
 * @create 2016/6/30
 */
public class ZeroBeanUtil extends BeanUtils{

    /**
     * 复制一个list 包括集合中对象的属性
     * @param src 复制数组的来源
     * @param clazz 要将源集合中的对象转成的新对象类型
     * @param <T>
     * @return
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public static <T> List<T> copyListProperties(List<?> src, Class<T> clazz) {
        List<T> desc = new ArrayList<>();
        try {
            if(!CollectionUtils.isEmpty(src)) {
                for (Object obj : src) {
                    T target = clazz.newInstance();
                    copyProperties(obj, target);
                    desc.add(target);
                }
            }
        } catch (Exception e){
            ExceptionUtil.throwCommonException(ExceptionCode.LIST_ATTR_COPY_ERROR);
        }

        return desc;
    }
}
