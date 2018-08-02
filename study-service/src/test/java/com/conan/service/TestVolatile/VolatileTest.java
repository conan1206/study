package com.conan.service.TestVolatile;

public class VolatileTest {

    public static void main(String[] args) throws InterruptedException {
        final Task task = new Task();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                task.start();

            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                task.stop();
            }
        });
        thread1.start();
        Thread.sleep(10);
        thread2.start();
    }

}

class Task{

    boolean flag = true;

    public void start(){
        System.out.println("start.........");
        while(flag){
//            System.out.println("start: " + flag);
//            System.out.println("start: ");
            synchronized (this) {
                System.out.println("123");
            }
        }
//        for(;;){
//            if(!flag){
//               break;
//            }
//        }
        System.out.println("start over");
        System.out.println("start over: " + flag);
        flag = true;
    }

    public void stop(){
        System.out.println("stop.........");
        flag = false;
        while(!flag){
//            System.out.println("stop: " + flag);
//            System.out.println("stop: ");

        }
//        for(;;){
//            if(flag){
//                break;
//            }
//        }
        System.out.println("stop over");
        System.out.println("stop over: " + flag);

    }

}
