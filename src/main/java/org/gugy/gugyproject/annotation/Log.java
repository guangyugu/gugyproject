package org.gugy.gugyproject.annotation;

import java.lang.annotation.*;

/**
 * @author 辜光宇
 * 2021/1/19 11:27
 */
@Target({ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Log {
    /**
     * 要执行的操作类型比如：add操作
     **/
    public String operationType() default "";

    /**
     * 要执行的具体操作比如：添加用户
     **/
    public String operationName() default "";
}
