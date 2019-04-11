package com.jyusun.evan.core.common.message;

import com.jyusun.evan.core.common.constant.HttpConstants;
import lombok.*;

import java.util.List;

/**
 * 描述：接口返回消息
 *
 * @author jyusun at 2018/12/29 15:30
 */
@Data
public class Message {
    /**
     * 返回代码
     */
    private String code;

    /**
     * 返回消息
     */
    private String msg;

    /**
     * 单个对象数据
     */
    private Object data;

    /**
     * 集合数据
     */
    public List<?> list;

    /**
     * json数据
     */
    public String json;

    private Integer offset;

    private Integer limit;

    private Integer total;

    private Boolean status;

    public Message() {
    }


    /**
     * 功能描述：
     * - 处理成功
     */
    public  Message success() {
        this.success(HttpConstants.HTTP_200.getCode(),HttpConstants.HTTP_200.getMsg(),null);
        this.setStatus(true);
        return this;
    }


    /**
     * 功能描述：
     * - 处理成功
     *
     * @param data 返回对象
     * @return this
     */
    public Message success(Object data) {
        this.success(HttpConstants.HTTP_200.getCode(), HttpConstants.HTTP_200.getMsg(), data);
        return this;
    }

    /**
     * 功能描述：
     * - 处理成功
     *
     * @param code 返回代码
     * @param msg 返回消息
     * @param data 返回数据
     * @return this
     */
    public Message success(String code, String msg, Object data) {
        this.setCode(code);
        this.setMsg(msg);
        if (null != data) {
            if (data instanceof List<?>) {
                this.setList((List<?>) data);
            } else {
                this.setData(data);
            }
        }
        this.setStatus(true);
        return this;
    }


    /**
     * 描述：处理失败
     *
     * @return this
     */
    public Message error() {
        this.error(HttpConstants.HTTP_500.getCode(),HttpConstants.HTTP_500.getMsg());
        this.setStatus(false);
        return this;
    }


    /**
     * 功能描述：
     *  - 处理失败
     *
     * @param msg 返回消息
     * @return this
     */
    public Message error(String msg) {
        this.error(HttpConstants.HTTP_500.getCode(),msg);
        this.setStatus(false);
        return this;
    }

    /**
     * 功能描述：
     *  - 处理失败
     *
     * @param code 返回代码
     * @param msg 返回消息
     * @return this
     */
    public Message error(String code, String msg) {
        this.setCode(code);
        this.setMsg(msg);
        this.setStatus(false);
        return this;
    }

}
