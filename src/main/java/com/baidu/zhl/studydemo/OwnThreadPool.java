package com.baidu.zhl.studydemo;

import java.util.LinkedList;

/**
 * 自定义线程池
 * Created by Administrator on 2017/2/24.
 *
 */
public class OwnThreadPool {
    int threadPoolSize;
    LinkedList<Runnable> tasks = new LinkedList<Runnable>();

    public OwnThreadPool() {
        threadPoolSize = 10;

        synchronized(tasks) {
            for(int i=0; i < threadPoolSize; i++) {
                new TaskConsumeThread("任务消费者线程 " + i).start();
            }
        }
    }
    public void add(Runnable r) {
        synchronized(tasks) {
            tasks.add(r);
            tasks.notifyAll();
        }
    }

    class TaskConsumeThread extends Thread {
        public  TaskConsumeThread(String name) {
            super(name);
        }

        Runnable task;
        public void run() {
            System.out.println("启动： " + this.getName());
            while (true) {
                synchronized (tasks) {
                    while (tasks.isEmpty()) {
                        try {
                            tasks.wait();
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    }
                    task = tasks.removeLast();
                    // 允许添加任务的线程可以继续添加任务
                    tasks.notifyAll();

                }
                System.out.println(this.getName() + " 获取到任务，并执行");
                task.run();
            }
        }
    }
}
