package com.jyusun.evan.member.infrastructure.repository.mapper;

import com.jyusun.evan.core.db.mapper.BaseMapper;
import com.jyusun.evan.member.infrastructure.repository.po.UsersPO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 作用描述：
 * - 会员Mapper继承了 基础的增删改查方法
 * Mapper注解解决mapper扫描问题
 * @author JyuSun at 2019/4/4 12:08
 * @version 1.0.0
 */
@Mapper
@Repository
public interface UsersMapper extends BaseMapper<UsersPO> {

}
