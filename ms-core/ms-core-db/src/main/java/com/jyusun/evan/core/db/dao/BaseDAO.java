package com.jyusun.evan.core.db.dao;

import java.util.List;
import java.util.Map;

/**
 * 作用描述：数据访问层操作对象
 *
 * @author JyuSun at 2019/3/29 11:14
 * @version 1.0.0
 */
public interface BaseDAO<T> {

    /**
     * 描述：新增
     *
     * @param t 新增
     * @return Result<Boolean> 成功：1-true 失败：0-false
     * @author jyusun at 2019/03/18  19:33
     */
    Boolean insert(T t) ;

    /**
     * 描述：修改
     *
     * @param t 对象
     * @return Result<Boolean> 成功：1-true 失败：0-false
     * @author jyusun at 2019/03/18  19:33
     */
    Boolean updateByPrimaryKey(T t) ;

    /**
     * 描述：根据id删除
     *
     * @param id 删除id
     * @return Result<Boolean> 成功：1-true 失败：0-false
     * @author jyusun at 2019/03/18  19:33
     */
    Boolean deleteByPrimaryKey(Long id) ;

    /**
     * 描述：根据id查询
     *
     * @param id 查询id
     * @return Result<T> 实体对象
     * @author jyusun at 2019/03/18  19:33
     */
     T selectOne(Long id) ;

    /**
     * 描述：分页查询
     *
     * @param offset   页码
     * @param pageSize 页大小
     * @return Result<T> 一组结果集
     * @author jyusun at 2019/03/18  19:33
     */
     List<T> queryForPage(Integer offset, Integer pageSize) ;

    /**
     * 描述：分页查询总记录数
     *
     * @param offset   页码
     * @param pageSize 页大小
     * @return 总记录数
     * @author jyusun at 2019/03/18  19:33
     */
    Integer queryCount(Integer offset, Integer pageSize) ;


    /**
     * 描述：根据多条件查询
     *
     * @param map 查询条件
     * @return Result<List<T>> 一组结果集
     * @author jyusun at 2019/03/18  19:33
     */
    List<T> selectByCondition(Map<String, String> map) ;


}
