package com.conan.service.TestExtend;

public class Sun extends Parent {

    public Sun(){
        super();
        System.out.println("Sun");
    }

    public static void main(String[] args) {
        System.err.println(Sun.array);
        Sun.array = null;
        System.err.println(Parent.array);
        System.err.println(Son.array);
    }

}
