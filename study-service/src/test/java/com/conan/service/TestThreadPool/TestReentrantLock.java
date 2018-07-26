package com.conan.service.TestThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class TestReentrantLock {

    volatile static int a = 0;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        ReentrantLock reentrantLock = new ReentrantLock();

        for(int i = 0; i < 100; i++){
            executorService.execute(new Runnable() {
                @Override
                public void run() {
//                    reentrantLock.lock();
                    try {
                        System.out.println(Thread.currentThread().getName() + " a: " + ++a);
                    }finally {
//                        reentrantLock.unlock();
                    }
                }
            });
        }

        final int COUNT_BITS = Integer.SIZE - 3;
        System.out.println(-1 << COUNT_BITS);
        System.out.println(0 << COUNT_BITS);
        System.out.println(1 << COUNT_BITS);
        System.out.println(2 << COUNT_BITS);
        System.out.println(3 << COUNT_BITS);

        System.out.println((1 << COUNT_BITS) - 1);
    }

}
