package com.company.Singleton;

public class Main {
    public static void main(String[] args) {
        //Lazy instatiation

       College college1 = College.createCollege();
        college1.setName("Vasavi College");
        System.out.println("College name is :" + college1);
        College college2 = College.createCollege();
        college2.setName("Chaitanya College");

        System.out.println("College name is : " + college2);
        System.out.println();

        //Early instatiation
        Hospital hospital1 = Hospital.createHospital();
        hospital1.setName("Apollo");
        System.out.println("Hospital name is " + hospital1 );
        Hospital hospital2= Hospital.createHospital();
        hospital2.setName("Sunshine");
        System.out.println();
        System.out.println("Hospital name is: " + hospital2);

        //Threaded environment
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Employee employee1 = Employee.getInstance();
                employee1.setName("Revanth");
                System.out.println();
                System.out.println( employee1.getName() );
            }
        });
       Thread t2= new Thread(new Runnable() {
           @Override
           public void run() {
               Employee employee2 = Employee.getInstance();
               employee2.setName("Ashwanth");

              System.out.println( employee2.getName() );
           }
       });
        Thread t3= new Thread(new Runnable() {
            @Override
            public void run() {
                Employee employee3 = Employee.getInstance();
                employee3.setName("Akshitha");

                System.out.println( employee3.getName() );
            }
        });
       t1.start();
       t2.start();
       t3.start();


    }

}
