package com.company.Decorator;

public class Decorator implements Employee{
    protected Employee employee ;

    public Decorator(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String  work() {
      return   employee.work();
    }
}
