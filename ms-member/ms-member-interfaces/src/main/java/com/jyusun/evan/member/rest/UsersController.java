package com.jyusun.evan.member.rest;

import com.alibaba.fastjson.JSONObject;
import com.jyusun.evan.core.common.message.Message;
import com.jyusun.evan.member.facade.dto.UsersDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 作用描述：
 *
 * @author JyuSun at 2019/4/9 17:09
 * @version 1.0.0
 */
@RequestMapping("/users")
public interface UsersController {
    /**
     * 描述：
     * - 会员注册接口
     *
     * @param usersDTO 用户注册信息
     * @return 处理信息
     */
    @PostMapping
    Message register(UsersDTO usersDTO);
}
