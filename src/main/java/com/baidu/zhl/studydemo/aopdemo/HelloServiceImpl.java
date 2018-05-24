package com.baidu.zhl.studydemo.aopdemo;

/**
 * Created by Administrator on 2017/3/6.
 */
public class HelloServiceImpl implements IHelloService {

    private String Hello;
    private String ChinaHello;

    public void sayHello() {
        // TODO 自动生成的方法存根
        System.out.println(Hello);
    }

    public void sayChinaHello() {
        // TODO 自动生成的方法存根
        System.out.println(ChinaHello);
    }

    public String getHello() {
        return Hello;
    }

    public void setHello(String hello) {
        Hello = hello;
    }

    public String getChinaHello() {
        return ChinaHello;
    }

    public void setChinaHello(String chinaHello) {
        ChinaHello = chinaHello;
    }

}
