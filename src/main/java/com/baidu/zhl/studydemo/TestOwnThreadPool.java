package com.baidu.zhl.studydemo;

/**
 * Created by Administrator on 2017/2/25.
 */
public class TestOwnThreadPool {
    public static void main(String[] args) {
        OwnThreadPool pool = new OwnThreadPool();

        for (int i = 0; i < 5; i++) {
            Runnable task = new Runnable() {

                public void run() {
                    System.out.println("执行任务");
                    //任务可能是打印一句话
                    //可能是访问文件
                    //可能是做排序
                }
            };

            pool.add(task);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }

}
