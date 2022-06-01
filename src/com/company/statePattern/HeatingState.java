package com.company.statePattern;

public class HeatingState implements Dispenser{
    @Override
    public void state() {
        System.out.println("Dispenser is in Heating state.");
    }
}
