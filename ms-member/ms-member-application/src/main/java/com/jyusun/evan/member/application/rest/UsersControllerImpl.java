package com.jyusun.evan.member.application.rest;

import com.jyusun.evan.core.common.message.Message;
import com.jyusun.evan.member.facade.dto.UsersDTO;
import com.jyusun.evan.member.rest.UsersController;
import org.springframework.web.bind.annotation.RestController;

/**
 * 作用描述：
 *
 * @author JyuSun at 2019/4/9 19:45
 * @version 1.0.0
 */
@RestController
public class UsersControllerImpl implements UsersController {
    
    @Override
    public Message register(UsersDTO usersDTO) {
        return null;
    }
}
