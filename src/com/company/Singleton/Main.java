package com.company.Singleton;

public class Main {
    public static void main(String[] args) {
        //Lazy instatiation
        College college1 = College.createCollege();
        college1.setName("Vasavi College");
        System.out.println("College name is :" + college1.getName());
        College college2 = College.createCollege();
        college2.setName("Chaitanya College");
        System.out.println("College name is : " + college2.getName());

        //Early instatiation
        Hospital hospital1 = Hospital.createHospital();
        hospital1.setName("Apollo");
        System.out.println("Hospital name is " + hospital1.getName()  );
        Hospital hospital2= Hospital.createHospital();
        hospital2.setName("Sunshine");
        System.out.println("Hospital name is: " + hospital2.getName());
    }
}
