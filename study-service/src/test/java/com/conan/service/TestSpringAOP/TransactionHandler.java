package com.conan.service.TestSpringAOP;

public class TransactionHandler {

    public void beginTransaction() {
        System.out.println("beginTransaction.............");
    }

    public void closeTransaction() {
        System.out.println("closeTransaction.............");
    }

}
