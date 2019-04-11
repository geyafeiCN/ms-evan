package com.jyusun.evan.member.infrastructure.common.constant;

/**
 * 作用描述：
 * <p> - 用户信息
 *
 * @author JyuSun at 2019/1/4 13:39
 * @version 1.0.0
 */
public class UsersConstants {


    /**
     * 账户锁定状态：0-未锁定
     */
    public final static Integer LOCK_STATE_0 = 0;
    /**
     * 账户锁定状态：1-已锁定
     *  - 当用户密码泄露等因素，主动发起账户锁定
     */
    public final static Integer LOCK_STATE_1 = 1;

    /**
     * 账户状态：0-未激活
     */
    public final static Integer ACCOUNT_STATE_0 = 0;
    /**
     * 账户状态：1-正常
     */
    public final static Integer ACCOUNT_STATE_1 = 1;
    /**
     * 账户状态：2-冻结
     */
    public final static Integer ACCOUNT_STATE_2 = 2;
    /**
     * 账户状态：2-永久封号
     */
    public final static Integer ACCOUNT_STATE_9 = 9;
}
