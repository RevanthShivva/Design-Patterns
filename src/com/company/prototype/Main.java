package com.company.prototype;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        StudentData studentData = new StudentData();
        studentData.setName("Revanth");
        studentData.setCollegeName("Vasavi");
        System.out.println(studentData.toString());
        System.out.println("studentData hashcode : " + System.identityHashCode(System.identityHashCode(studentData)));
        StudentData newStudent = (StudentData) studentData.createInstance();
        System.out.println( newStudent.toString());
        System.out.println("newStudent hashcode : " + System.identityHashCode(System.identityHashCode(newStudent)));
        newStudent.setName("Ashwanth");
        out.println(newStudent.toString());
    }
}