package com.company.Observer;

public class Main{
    public static void main(String[] args) {
        ISubscriber s1 = new Subscriber("Revanth");
        ISubscriber s2 = new Subscriber("Ashwanth");
        ISubscriber s3 = new Subscriber("Sravanthi");
        ISubscriber s4 = new Subscriber("Shekar");

        Subject subject = new EntertainmentApp("BookMyShow");

        subject.addSubscriber(s1);
        subject.addSubscriber(s2);
        subject.addSubscriber(s3);
        subject.addSubscriber(s4);

        Event e1 = new Movies("Major");

        subject.addShow(e1);
        System.out.println();
        Event e2 = new EntertainmentShows("Stand up solo");

        subject.addShow(e2);


    }
}