package com.company.Decorator;

public class TeamLead extends Decorator {
    public TeamLead(Employee employee) {
        super(employee);
    }

    @Override
    public String work() {

      return  employee.work() +
              ", Team Lead";
    }
}
