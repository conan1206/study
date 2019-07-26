package com.conan.service.TestThreadPool;

import java.util.concurrent.atomic.AtomicInteger;

public class TestAtomicInteger {

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " add: " + atomicInteger.incrementAndGet());
            System.out.println(Thread.currentThread().getName() + " get: " + atomicInteger.get());
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + " add: " + atomicInteger.decrementAndGet());
                    System.out.println(Thread.currentThread().getName() + " get: " + atomicInteger.get());
                }
            }).start();
        }

    }

}
