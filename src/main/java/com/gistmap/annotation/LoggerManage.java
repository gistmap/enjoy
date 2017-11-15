package com.gistmap.annotation;

import java.lang.annotation.*;

/**
 * @desc : 日志管理
 * @author : gistmap
 * @date : 2017/9/13  22:16
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LoggerManage {

    String description();
}
