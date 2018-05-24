package com.baidu.zhl.studydemo.aopdemo;

/**
 * Created by Administrator on 2017/3/7.
 */
public class PersonService {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void info(){
        System.out.println("此人姓名为："+name);
    }

    public String getName(){
        return name;
    }
}
