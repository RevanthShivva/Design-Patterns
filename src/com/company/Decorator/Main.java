package com.company.Decorator;

public class Main {
    public static void main(String[] args) {
          Employee employee1 = new SoftwareEnginner(new BeginnerEmployee());
          System.out.println("Employee1 " + employee1.work());

          Employee employee2 = new TeamLead(new SoftwareEnginner(new BeginnerEmployee()));
          System.out.println( "Employee2 "+employee2.work());
    }
}
