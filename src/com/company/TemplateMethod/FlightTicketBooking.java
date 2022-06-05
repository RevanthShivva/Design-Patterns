package com.company.TemplateMethod;

public class FlightTicketBooking extends OnlineTicketBooking{
    @Override
    public void register() {
        System.out.println("Register to book Flight tickets");
    }

    @Override
    public void login() {
        System.out.println("You have logged in succesfully");
    }

    @Override
    public void selectStartingPoint() {
        System.out.println("Please select your starting point...");
    }

    @Override
    public void selectDateTime() {
        System.out.println("Please select the date and time of travel...");
    }

    @Override
    public void selectDestination() {
        System.out.println("Please select your destination...");
    }
}
