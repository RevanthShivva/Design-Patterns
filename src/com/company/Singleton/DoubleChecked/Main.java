package com.company.Singleton.DoubleChecked;

public class Main {
    public static void main(String[] args) {
        Thread t4= new Thread(new Runnable() {
            @Override
            public void run() {
                Student student1 = Student.getInstance();
                student1.setName("Goutham");
                System.out.println();
                System.out.println( student1.getName() );
            }
        });
        Thread t5= new Thread(new Runnable() {
            @Override
            public void run() {
                Student student2 = Student.getInstance();
                student2.setName("Revathi");

                System.out.println( student2.getName() );
            }
        });
        Thread t6= new Thread(new Runnable() {
            @Override
            public void run() {
                Student student3 = Student.getInstance();
                student3.setName("Rohith");

                System.out.println( student3.getName() );
            }
        });
        t4.start();
        t5.start();
        t6.start();
    }
}
