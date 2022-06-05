package com.company.TemplateMethod;

public class Main {
    public static void main(String[] args) {
        OnlineTicketBooking onlineTicketBooking = new TrainTicketBooking();
        onlineTicketBooking.processBooking();
        onlineTicketBooking = new FlightTicketBooking();
        onlineTicketBooking.processBooking();
    }
}
