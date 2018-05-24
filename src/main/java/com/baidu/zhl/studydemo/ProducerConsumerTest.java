package com.baidu.zhl.studydemo;

/**
 * Created by Administrator on 2017/2/26.
 */
public class ProducerConsumerTest {
    public static void  main(String[] args) {
        QueueBuffer q = new QueueBuffer();
        new Producer(q);
        new Consumer(q);
        System.out.println("Press Control-C to stop.");
    }
}
