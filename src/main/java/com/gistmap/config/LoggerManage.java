package com.gistmap.config;

import java.lang.annotation.*;

/**
 * @Desc : 日志管理
 * @User : gistmap
 * @Date : 2017/9/13  22:16
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LoggerManage {

    public String description();
}
