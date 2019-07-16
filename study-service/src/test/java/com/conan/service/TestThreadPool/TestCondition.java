package com.conan.service.TestThreadPool;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class TestCondition {

    public static ReentrantLock lock = new ReentrantLock();

    public static Condition condition = lock.newCondition();

    public static volatile int state = 0;

    public static void consume() {
        lock.lock();
        try {
            for(;;) {
                if (state > 0) {
                    System.out.println("start consume");
                    state--;
                    System.out.println("end consume");
                    break;
                } else {
                    System.out.println("producting...");
                    condition.await();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public static void product() {
        lock.lock();
        try {
            System.out.println("start product");
            Thread.sleep(1000 * 10);
            state++;
            condition.signal();
            System.out.println("end product");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        (new Thread(new Runnable() {
            @Override
            public void run() {
                product();
            }
        },"product-thread")).start();

        (new Thread(new Runnable() {
            @Override
            public void run() {
                consume();
            }
        },"consume-thread")).start();
    }

}
