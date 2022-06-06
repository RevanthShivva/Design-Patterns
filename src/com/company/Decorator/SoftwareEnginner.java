package com.company.Decorator;

public class SoftwareEnginner extends Decorator{
    public SoftwareEnginner(Employee employee) {
        super(employee);
    }

    @Override
    public String  work() {
       return employee.work() + "Software Engineer";
    }
}
