package com.conan.service.TestAQS;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestCountDownLatch {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        CountDownLatch countDownLatch = new CountDownLatch(7);

        for(int i = 0; i < 10; i++){
            final int j = i;
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.currentThread().sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if(j == 5 || j == 7 || j == 9){
                        try {
                            System.out.println("任务park");
                            countDownLatch.await();
                            System.out.println("任务unpark");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }else{
                        System.out.println("处理了一个任务");
                        countDownLatch.countDown();
                    }

                }
            });
        }

        System.out.println("主线程任务park");
        countDownLatch.await();
        System.out.println("多线程任务unpark");
    }

}
