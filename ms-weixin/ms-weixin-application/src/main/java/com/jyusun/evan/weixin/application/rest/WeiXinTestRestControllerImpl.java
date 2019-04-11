package com.jyusun.evan.weixin.application.rest;

import com.jyusun.evan.core.common.message.Message;
import com.jyusun.evan.core.common.rest.BaseController;
import com.jyusun.evan.weixin.interfaces.facade.vo.TestVO;
import com.jyusun.evan.weixin.interfaces.rest.WeiXinTestRestController;
import org.springframework.web.bind.annotation.RestController;

/**
 * 作用描述：
 * - Rest接口测试
 * @author JyuSun at 2019/4/10 17:39
 * @version 1.0.0
 */
@RestController
public class WeiXinTestRestControllerImpl extends BaseController<TestVO> implements WeiXinTestRestController {

    @Override
    public Message weiXinTestRest() {
        return success("TestRest请求成功");
    }

}
