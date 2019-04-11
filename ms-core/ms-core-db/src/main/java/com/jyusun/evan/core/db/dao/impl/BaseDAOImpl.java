package com.jyusun.evan.core.db.dao.impl;

import com.jyusun.evan.core.db.dao.BaseDAO;
import com.jyusun.evan.core.db.mapper.BaseMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * 作用描述：
 * - 基础的增删改查操作
 * @author JyuSun at 2019/3/29 11:15
 * @version 1.0.0
 */
public class BaseDAOImpl<M extends BaseMapper<T>, T> implements BaseDAO<T> {

    @Autowired
    protected M mapper;

    /**
     * 描述：新增
     *
     * @param t 新增
     * @author jyusun at 2019/03/18  19:33
     */
    @Override
    public Boolean insert(T t) {
        return mapper.insert(t);
    }

    /**
     * 描述：修改
     *
     * @param t 修改
     * @author jyusun at 2019/03/18  19:33
     */
    @Override
    public Boolean updateByPrimaryKey(T t) {
        return mapper.updateByPrimaryKey(t);
    }

    /**
     * 描述：根据id删除
     *
     * @param id 删除id
     * @author jyusun at 2019/03/18  19:33
     */
    @Override
    public Boolean deleteByPrimaryKey(Long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    /**
     * 描述：根据id查询
     *
     * @param id 查询id
     * @author jyusun at 2019/03/18  19:33
     */
    @Override
    public T selectOne(Long id) {
        return mapper.selectOne(id);
    }

    /**
     * 描述：分页查询
     *
     * @param offset   页码
     * @param pageSize 页大小
     * @return 一组结果集
     * @author jyusun at 2019/03/18  19:33
     */
    @Override
    public List<T> queryForPage(Integer offset, Integer pageSize) {
        return mapper.queryForPage(offset, pageSize);
    }

    /**
     * 描述：分页查询总记录数
     *
     * @param offset   页码
     * @param pageSize 页大小
     * @return 总记录数
     * @author jyusun at 2019/03/18  19:33
     */
    @Override
    public Integer queryCount(Integer offset, Integer pageSize) {
        return mapper.queryCount(offset, pageSize);
    }


    /**
     * 描述：根据多条件查询
     *
     * @param map 查询条件
     * @author jyusun at 2019/03/18  19:33
     */
    @Override
    public List<T> selectByCondition(Map<String, String> map) {
        return mapper.selectByCondition(map);
    }
}
