package com.mb.tool.model.annotation;

import com.mb.tool.model.constant.LogConstants;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Inherited
@Target({ElementType.PARAMETER, ElementType.FIELD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Confidential {
    int level() default LogConstants.CONFIDENTIAL_HIDE;
}
