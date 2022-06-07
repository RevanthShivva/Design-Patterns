package com.company.Observer;

public interface Subject {
    public void addSubscriber(ISubscriber subscriber);
    public void deleteSubscriber(ISubscriber subscriber);
    public void notifySubscriber(Event event);
    public void addShow(Event event);




}
