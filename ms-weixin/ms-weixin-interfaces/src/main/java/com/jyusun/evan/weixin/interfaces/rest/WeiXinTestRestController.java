package com.jyusun.evan.weixin.interfaces.rest;

import com.jyusun.evan.core.common.message.Message;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 作用描述：
 * - 微信服务测试Rest接口
 * @author JyuSun at 2019/4/10 17:04
 * @version 1.0.0
 */
@Api(tags = "微信服务-测试接口")
@RequestMapping("/weixinr")
public interface WeiXinTestRestController {

    /**
     * 作用描述：
     * - 微信服务RestTest接口
     * @return
     */
    @ApiOperation(value = "微信服务rest测试")
    @GetMapping("/test")
    Message weiXinTestRest();


    /**
     * 作用描述：
     * - 微信服务RestTest接口
     * @return
     */
    @ApiOperation(value = "微信服务rest测试")
    @GetMapping("/print")
    Message configEnvTestRest();

}
