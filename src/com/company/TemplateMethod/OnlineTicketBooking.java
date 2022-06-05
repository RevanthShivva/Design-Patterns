package com.company.TemplateMethod;

public abstract class OnlineTicketBooking {
    public final void processBooking(){
        register();
        login();
        selectStartingPoint();
        selectDestination();
        selectDateTime();
        printTickets();

    }
    public abstract void register();

    public  abstract void login();
    public abstract  void selectStartingPoint();
    public abstract  void selectDateTime();
    public abstract void selectDestination();
    public final void printTickets(){
        System.out.println("Tickets are printed");
    }
}
