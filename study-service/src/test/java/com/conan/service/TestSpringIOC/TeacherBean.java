package com.conan.service.TestSpringIOC;

public class TeacherBean {
    private String name;
    private int age;
    private StudentBean studentBean;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public StudentBean getStudentBean() {
        return studentBean;
    }

    public void setStudentBean(StudentBean studentBean) {
        this.studentBean = studentBean;
    }

    public TeacherBean(){
        System.out.println("【TeacherBean构造方法】无参构造方法");
    }

    @Override
    public String toString() {
        return "TeacherBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", studentBean='" + studentBean.toString() + '\'' +
                '}';
    }
}
