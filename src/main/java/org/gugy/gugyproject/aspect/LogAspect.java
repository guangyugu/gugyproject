package org.gugy.gugyproject.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.gugy.gugyproject.entity.query.UserQuery;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Scanner;

/**
 * @author 辜光宇
 * 2021/1/19 11:25
 */
@Aspect
@Component

public class LogAspect {

    @Pointcut("execution (* org.gugy.gugyproject.service..*.*(..))")
    public void serviceAspect() {
    }

    @Before("serviceAspect()")
    public void before(JoinPoint joinPoint) {
        System.out.println(new Date() + "前置" + joinPoint);
//        Scanner scanner = new Scanner(System.in);
//        String next = scanner.next();
//        if ("aa".equals(next)){
//            throw new RuntimeException();
//        }
    }

    @After("serviceAspect()")
    public void after(JoinPoint joinPoint) {
        System.out.println(new Date() + "后置切点" + joinPoint);

    }
}
