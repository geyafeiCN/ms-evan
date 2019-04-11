package com.jyusun.evan.member.infrastructure.repository.po;

import com.jyusun.evan.core.common.model.persistantobject.BasePersistantObject;
import lombok.Data;

/**
 * 作用描述：
 * - 用户账户基础类
 * @author JyuSun at 2019/4/4 12:06
 * @version 1.0.0
 */
@Data
public class UsersPO extends BasePersistantObject {

    /**
     * 用户账号
     */
    private String userAcct;
    /**
     * 用户密码
     */
    private String userPass;
    /**
     * 用户昵称
     */
    private String nickName;

    /**
     * 头像
     */
    private String avatarImg;
    /**
     * 用户账号可修改一次
     * 0-false-不可修改，1-true-可修改
     * 用户修改一次后将状态触发为false
     */
    private Boolean modifyAccount;

    /**
     * 用户账号状态
     * 0-未激活
     * 1-正常
     * 2-锁定
     * 3-封号（冻结）
     * 9-销户
     */
    private Integer accountStatus;

}
