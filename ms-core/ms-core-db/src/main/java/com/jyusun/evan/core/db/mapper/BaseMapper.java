package com.jyusun.evan.core.db.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 作用描述：基础mapper，实现基础方法
 *
 * @author JyuSun at 2019/3/28 19:41
 * @version 1.0.0
 */
public interface BaseMapper<T> {

    /**
     * 描述：新增
     *
     * @param po 新增
     * @author jyusun at 2019/03/18  19:33
     * @return Result<Integer>
     */
    Boolean insert(T po);

    /**
     * 描述：修改
     *
     * @param po 修改PO
     * @author jyusun at 2019/03/18  19:33
     * @return Result<Integer>
     */
    Boolean updateByPrimaryKey(T po);

    /**
     * 描述：根据id删除
     *
     * @param id 删除id
     * @author jyusun at 2019/03/18  19:33
     * @return Result<Integer>
     */
     Boolean deleteByPrimaryKey(Long id);

    /**
     * 描述：根据主键ID查询单条数据
     *
     * @param id 查询id
     * @author jyusun at 2019/03/18  19:33
     * @return Result<Integer>
     */
     T selectOne(Long id);

    /**
     * 描述：分页查询
     *
     * @param offset   页码
     * @param pageSize 页大小
     * @return 一组结果集
     * @author jyusun at 2019/03/18  19:33
     */
     List<T> queryForPage(@Param("offset") Integer offset, @Param("pageSize") Integer pageSize);

    /**
     * 描述：分页查询总记录数
     *
     * @param offset   页码
     * @param pageSize 页大小
     * @author jyusun at 2019/03/18  19:33
     * @return Result<Integer> 总记录数
     */
    Integer queryCount(@Param("offset") Integer offset, @Param("pageSize") Integer pageSize);

    /**
     * 描述：根据多个查询条件返回集合
     *
     * @param map 查询条件
     * @author jyusun at 2019/03/18  19:33
     * @return Result<List> 返回集合
     */
     List<T> selectByCondition(Map<String, String> map);
}
