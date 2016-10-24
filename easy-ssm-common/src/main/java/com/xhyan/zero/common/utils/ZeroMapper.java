package com.xhyan.zero.common.utils;

import tk.mybatis.mapper.common.*;

/**
 * Created by xhyan on 16-10-24.
 */
public interface ZeroMapper<T> extends BaseMapper<T>, ConditionMapper<T>, MySqlMapper<T>{
}
