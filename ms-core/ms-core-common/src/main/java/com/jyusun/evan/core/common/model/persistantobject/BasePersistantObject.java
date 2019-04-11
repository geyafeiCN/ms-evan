package com.jyusun.evan.core.common.model.persistantobject;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

/**
 * 作用描述：
 * - 基础映射对象封装相同的字段和属性
 * @author JyuSun at 2019/4/2 16:21
 * @version 1.0.0
 */
@Getter
@Setter
public class BasePersistantObject {
    /**
     *  主键ID
     */
    protected Long id;
    /**
     *  创建人ID
     */
    protected Long createrId;
    /**
     *  创建时间
     */
    protected Timestamp createTime;
    /**
     *  最后更新人ID
     */
    protected String lastEditorId;
    /**
     *  最后更新时间
     */
    protected Timestamp lastEditTime;
    /**
     *  删除人ID
     */
    protected String deleterId;
    /**
     *  删除时间
     */
    protected Timestamp deleteTime;
    /**
     *  删除标识
     *  0-false-未删除,1-true-已删除
     */
    protected Boolean deleted;
    /**
     *  审核人ID
     */
    protected Long checkerId;
    /**
     *  审核时间
     */
    protected Timestamp checkTime;
    /**
     *  审核标识
     *  0-false-未审核,1-true-已审核
     */
    protected Boolean checked;
    /**
     *  开始时间
     */
    protected Timestamp startTime;
    /**
     *  结束时间
     */
    protected Timestamp endTime;

}
