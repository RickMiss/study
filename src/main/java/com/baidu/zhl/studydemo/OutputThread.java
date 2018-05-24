package com.baidu.zhl.studydemo;

/**
 * Created by Administrator on 2017/2/27.
 */
public class OutputThread implements Runnable{
    private int num;
    private Object lock;

    public OutputThread(int num, Object lock) {
        super();
        this.num = num;
        this.lock = lock;
    }

    public void run() {
        try {
            while(true) {
                synchronized(lock) {
                    lock.notifyAll();
                    System.out.println("唤醒其他线程");
                    lock.wait();
                    System.out.println("该线程释放lock，此时num=" + this.num);
                    System.out.println("打印num： " + num);
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }

    }

    public  static  void main(String[] args) {
        final Object lock = new Object();

        Thread thread1 = new Thread(new OutputThread(1,lock));
        Thread thread2 = new Thread(new OutputThread(2,lock));

        thread1.start();
        thread2.start();
    }
}
