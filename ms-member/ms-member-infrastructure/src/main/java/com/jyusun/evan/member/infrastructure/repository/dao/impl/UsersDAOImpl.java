package com.jyusun.evan.member.infrastructure.repository.dao.impl;

import com.jyusun.evan.core.db.dao.impl.BaseDAOImpl;
import com.jyusun.evan.member.infrastructure.repository.mapper.UsersMapper;
import com.jyusun.evan.member.infrastructure.repository.po.UsersPO;
import com.jyusun.evan.member.infrastructure.repository.dao.UsersDAO;
import org.springframework.stereotype.Repository;

/**
 * 作用描述：
 * - 用户持久对象层实现
 * @author JyuSun at 2019/4/9 13:51
 * @version 1.0.0
 */
@Repository
public class UsersDAOImpl extends BaseDAOImpl<UsersMapper,UsersPO> implements UsersDAO {

}
