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

//        final int COUNT_BITS = Integer.SIZE - 3;
//        final int CAPACITY   = (1 << COUNT_BITS) - 1;
//
//        // runState is stored in the high-order bits
//        final int RUNNING    = -1 << COUNT_BITS;
//        final int SHUTDOWN   =  0 << COUNT_BITS;
//        final int STOP       =  1 << COUNT_BITS;
//        final int TIDYING    =  2 << COUNT_BITS;
//        final int TERMINATED =  3 << COUNT_BITS;
//
//        System.out.println("CAPACITY: " + CAPACITY);
//        System.out.println("RUNNING: " + RUNNING);
//        System.out.println("SHUTDOWN: " + SHUTDOWN);
//        System.out.println("STOP: " + STOP);
//        System.out.println("TIDYING: " + TIDYING);
//        System.out.println("TERMINATED: " + TERMINATED);
    }

}
