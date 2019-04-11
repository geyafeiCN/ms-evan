package com.jyusun.evan.core.common.constant;

import lombok.Getter;

/**
 * 作用描述：业务代码（报文编号）常量类
 *
 * @author JyuSun at 2019/1/2 17:10
 * @version 1.0.0
 */
public enum BusinessCodeConstants {
    /**
     *1.业务代码 以1开头的为实时
     */
    BUSINESS_CODE_1020("1020","实时-申购申请"),
    BUSINESS_CODE_1120("1120","实时-申购申请"),

    /**
     *2.业务代码 以2开头的为批量
     */
    BUSINESS_CODE_2020("2001","批量-认购申请"),
    BUSINESS_CODE_2120("2020","批量-认购确认"),



    BUSINESS_CODE_9999("9999","000000");

    BusinessCodeConstants(String code, String name){
        this.code = code;
        this.name = name;
    }

    /**
     *枚举key
     */
    @Getter
    public String code;

    /**
     * 枚举value
     */
    @Getter
    public String name;



}
