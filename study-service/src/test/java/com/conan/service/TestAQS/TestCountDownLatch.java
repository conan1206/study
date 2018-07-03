package com.conan.service.TestAQS;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestCountDownLatch {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        CountDownLatch countDownLatch = new CountDownLatch(10);

        for(int i = 0; i < 10; i++){
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.currentThread().sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("处理了一个任务");
                    countDownLatch.countDown();
                }
            });
        }

        System.out.println("多线程任务准备处理");
        countDownLatch.await();
        System.out.println("多线程任务处理完成");
    }

}
