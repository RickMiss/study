package com.baidu.zhl.studydemo.aopdemo;

/**
 * Created by Administrator on 2017/3/7.
 */
public class PersonAop {
    public void before_info() {
        System.out.println("接下去,调用info()显示人名......");
    }
    public void after_info() {
        System.out.println("调用info()结束......");
    }
    public void after_get() {
        System.out.println("调用getName()结束......");
    }
}
