package com.company.Singleton;

public class Employee {
    private static Employee employee;
    private String name;
    int count =0;
    private Employee(){
        System.out.println("Employee created");
        count++;
        System.out.println(count);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static synchronized Employee getInstance(){

        if(employee == null){
            employee = new Employee();

        }

        return employee;
    }
}
