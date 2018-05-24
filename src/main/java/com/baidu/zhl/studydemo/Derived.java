package com.baidu.zhl.studydemo;

/**
 * Created by Administrator on 2017/3/1.
 */
public class Derived extends Base {
    public String whenAmISet = "set when declared";

    @Override
    void preProcess() {
        whenAmISet = "set in preProcess()";
    }

    public static  void  main(String args[]) {
        Derived d = new Derived();
        System.out.println(d.whenAmISet);
    }
}
