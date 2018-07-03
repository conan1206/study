package com.conan.service.TestAQS;

public class TestFor {

    public static void main(String[] args) {
        int a = 1;
        for (;;){
            if(a == 10){
                return;
            }
            a++;
            System.out.println(a);
        }
    }

}
