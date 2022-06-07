package com.company.Observer;

public class Subscriber implements ISubscriber {
    private String subscriberName;

    public Subscriber(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Override
    public String getName() {
        return subscriberName;
    }
}
