package com.conan.service.TestExtend;

public class Parent {

    public static int [] array = new int[1024 * 1024];

    public Parent(){
        System.out.println("parent........");
    }

    public static void main(String[] args) {
        Parent parent = new Parent();
        
        synchronized (parent){
            System.out.println(parent.toString());
        }
    }

}
