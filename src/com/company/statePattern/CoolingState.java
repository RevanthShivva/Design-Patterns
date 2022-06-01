package com.company.statePattern;

 public class CoolingState implements Dispenser{

     @Override
     public void state() {
         System.out.println("Dispenser is in cooling state");
     }
 }
