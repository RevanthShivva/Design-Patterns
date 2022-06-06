package com.company.Singleton.DoubleChecked;

public class Student {

    private static Student student;
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private Student(){
        System.out.println("student created");
    }
    public static Student getInstance(){
        if(student == null){
            synchronized (Student.class){
                if(student == null){
                    student = new Student();
                }
            }
        }
        return student;
    }

}
