package com.conan.service.TestThreadPool;

public class TestThread {

    public static void main(String[] args) {
        try {
//            Thread.sleep(1000 * 60);
            Object object = new Object();
            synchronized (object) {
                object.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(123);


//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(123);
//                try {
//                    Thread.sleep(1000 * 200);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(234);
//            }
//        });
//        thread.start();
//
//        thread.interrupt();
    }

}
