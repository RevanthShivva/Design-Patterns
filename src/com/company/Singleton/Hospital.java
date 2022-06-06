package com.company.Singleton;

public class Hospital {
    private static Hospital hospital = new Hospital();
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int count;
    private Hospital(){
        count++;
        System.out.println("Instantiated Hospital " + count  + " time");
    }
    public static Hospital createHospital(){

        return hospital;
    }
    public void c(){
        System.out.println(hospital);
    }
}
