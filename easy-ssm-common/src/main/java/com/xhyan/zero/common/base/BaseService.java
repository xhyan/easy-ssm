package com.xhyan.zero.common.base;

import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * 基本的服务接口
 */
public interface BaseService<T extends BaseDomain>  {

    /**
     * 保存
     * @param t
     * @return
     */
    int save(T t);

    /**
     * 批量保存信息
     * @param list
     * @return
     */
    int saveList(List<T> list);

    /**
     * 更新
     * @param t
     * @return
     */
    int update(T t);

    /**
     * 选择单条
     * @param t
     * @return
     */
    T selectOne(T t);

    /**
     * 根据主键选择一条
     * @param id
     * @return
     */
    T selectByPrimaryKey(Long id);

    /**
     * 查询信息列表
     * @param t
     * @return
     */
    List<T> list(T t);

    /**
     * 分页列表
     * @param t         查询条件
     * @return
     */
    PageInfo<T> pageList(T t);
}
