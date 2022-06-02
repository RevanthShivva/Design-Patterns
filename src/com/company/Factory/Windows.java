package com.company.Factory;

public class Windows implements Laptop{
    @Override
    public void osType() {
        System.out.println("This is of type Windows");
    }
}