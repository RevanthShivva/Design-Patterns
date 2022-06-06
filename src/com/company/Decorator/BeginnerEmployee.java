package com.company.Decorator;

public class BeginnerEmployee implements Employee{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String  work() {
        return "Positions : ";
    }
}
