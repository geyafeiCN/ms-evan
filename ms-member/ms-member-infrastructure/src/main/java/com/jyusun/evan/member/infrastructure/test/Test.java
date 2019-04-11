package com.jyusun.evan.member.infrastructure.test;

import com.jyusun.evan.core.common.message.Message;
import com.jyusun.evan.core.common.rest.BaseController;
import com.jyusun.evan.core.db.dao.BaseDAO;
import com.jyusun.evan.member.infrastructure.repository.mapper.UsersMapper;
import com.jyusun.evan.member.infrastructure.repository.po.UsersPO;
import com.jyusun.evan.member.infrastructure.repository.dao.UsersDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 作用描述：
 *
 * @author JyuSun at 2019/4/4 17:51
 * @version 1.0.0
 */
@RequestMapping("/index")
@RestController
public class Test extends BaseController<UsersPO> {

    @Autowired
    UsersDAO mapper;

    @GetMapping("/demo")
    public Message demo(){
        UsersPO users = new UsersPO();
        users.setId(1L);
        Boolean a = mapper.insert(users);
        System.out.println(a);
//       UsersPO user = mapper.selectOne(1L);
//        System.out.println(user.getId());
//        System.out.println(user.getUserAcct());
//        System.out.println(user.getUserPass());
//        System.out.println(user.getCheckTime());
//        System.out.println(user.getNickName());
//        System.out.println(user.getDeleted());
//        System.out.println(user.getChecked());
        return success();
    }
}
