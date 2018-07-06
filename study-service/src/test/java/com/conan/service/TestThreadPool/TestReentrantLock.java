package com.conan.service.TestThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class TestReentrantLock {

    volatile static int a = 0;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        ReentrantLock reentrantLock = new ReentrantLock();

        for(int i = 0; i < 100; i++){
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    reentrantLock.lock();
                    try {
                        System.out.println("a: " + ++a);
                    }finally {
                        reentrantLock.unlock();
                    }
                }
            });
        }

    }

}
