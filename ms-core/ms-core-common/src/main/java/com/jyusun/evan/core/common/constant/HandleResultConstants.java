package com.jyusun.evan.core.common.constant;

import lombok.Getter;

/**
 * 描述：枚举常量类-业务处理结果状态码
 *
 * @author JyuSun at 2019/1/2 16:51
 * @version 1.0.0
 */
public enum HandleResultConstants {

    /**
     * 处理成功
     */
    RESULT_0000("0000", "success"),

    /**
     * 其他错误，处理失败
     */
    RESULT_9999("9999", "fail"),

    /* 1.成功类型 */

    /* 2.警告类型 */

    /* 3.失败类型 */


    RESULT_0001("300", "success"),

    RESULT_0002("400", "success"),

    RESULT_0003("500", "error"),


    RESULT_00000("000000", "000000");

    HandleResultConstants(String code, String name) {
        this.code = code;
        this.name = name;
    }

    /**
     * 枚举key
     */
    @Getter
    public String code;

    /**
     * 枚举value
     */
    @Getter
    public String name;

}

