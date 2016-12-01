package com.xhyan.zero.common.base;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xhyan.zero.common.utils.ZeroMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 通用的基础service
 */
public abstract class BaseServiceImpl<T extends BaseDomain>{
    @Autowired
    private ZeroMapper<T> mapper;

    public int save(T t) {
        return mapper.insert(t);
    }

    public int saveList(List<T> list){
        return mapper.insertList(list);
    }

    public T selectOne(T t) {
        return mapper.selectOne(t);
    }

    public int update(T t) {
        return mapper.updateByPrimaryKeySelective(t);
    }

    public T selectByPrimaryKey(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    public List<T> list(T t){
        return mapper.select(t);
    }

    public PageInfo<T> pageList(T t){
        PageHelper.startPage(t.getPageNo(), t.getPageSize());
        List<T> select = mapper.select(t);
        return new PageInfo(select);
    }
}
