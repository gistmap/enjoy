package com.gistmap.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class Entity implements Serializable {

    private static final long serialVersionUID = -4024607286803464057L;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
