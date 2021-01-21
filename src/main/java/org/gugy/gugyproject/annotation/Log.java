package org.gugy.gugyproject.annotation;

import java.lang.annotation.*;

/**
 * @author ������
 * 2021/1/19 11:27
 */
@Target({ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Log {
    /**
     * Ҫִ�еĲ������ͱ��磺add����
     **/
    public String operationType() default "";

    /**
     * Ҫִ�еľ���������磺����û�
     **/
    public String operationName() default "";
}
