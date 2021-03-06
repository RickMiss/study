package com.baidu.zhl.studydemo.aopdemo;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by Administrator on 2017/3/6.
 */
@Aspect
public class AopTest {

    /*Pointcut for sayHello*/
    @Pointcut("execution(* *.sayHello())")
    public void hellopoint() {
    }

    @Before("hellopoint()")
    public void beforehello() {
        System.out.println("接下去调用sayHello()......");
    }

    @AfterReturning("hellopoint()")
    public void afterhello() {
        System.out.println("函数sayHello()执行结束......");
    }


    /*Pointcut for sayChinaHello*/
    @Pointcut("execution(* *.sayChinaHello())")
    public void helloChinapoint() {
    }

    @Before("helloChinapoint()")
    public void beforehelloChina() {
        System.out.println("接下去调用sayChinaHello()......");
    }

    @AfterReturning("helloChinapoint()")
    public void afterhelloChina() {
        System.out.println("函数sayChinaHello()执行结束......");
    }
}
