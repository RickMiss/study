package com.baidu.zhl.studydemo.aopdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/3/6.
 */
public class TestHelloService {
    private static ApplicationContext ctx;

    public static void main(String[] args) {
        // TODO 自动生成的方法存根
        ctx = new ClassPathXmlApplicationContext("hello-beans.xml");
        IHelloService helloWorld = (IHelloService) ctx.getBean("helloService");

        //用接口
        helloWorld.sayHello();
        helloWorld.sayChinaHello();

        System.out.println("------------------------------------------------------------------------------------");

        //用类
        SimpleHelloBean simpleHello = (SimpleHelloBean) ctx.getBean("SimpleHelloBean");
        simpleHello.sayHello();

    }
}
