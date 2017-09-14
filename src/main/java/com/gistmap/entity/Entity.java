package com.gistmap.entity;

import com.gistmap.annotation.TableName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * @Desc : 其他实体类需继承此类
 * @User : gistmap
 * @Date : 2017/9/6  22:15
 */


public class Entity implements Serializable {

    private static final long serialVersionUID = -4024607286803464057L;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
