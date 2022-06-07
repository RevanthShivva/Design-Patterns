package com.company.Observer;

import java.util.ArrayList;
import java.util.List;

public class EntertainmentApp implements Subject {

    private String name;
    private List<ISubscriber>  subscribers;
    private List<Event> movies;
    private List<Event> entertainmentShows;

    public EntertainmentApp(String name) {
        this.name = name;
        this.subscribers = new ArrayList<>();
        this.movies =new ArrayList<>();
        this.entertainmentShows = new ArrayList<>();
    }


    @Override
    public void addSubscriber(ISubscriber subscriber) {
           subscribers.add(subscriber);
    }

    @Override
    public void deleteSubscriber(ISubscriber subscriber) {
           subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscriber(Event event)
    {
          if(event instanceof Movies){
              for(ISubscriber subscriber : subscribers){
                  System.out.println("Hey, " + subscriber.getName()  +"  new movie is added. Click to book tickets for "+ event.getName().toUpperCase());
              }
          }
          else{
              for(ISubscriber subscriber : subscribers){
                  System.out.println("Hey, " + subscriber.getName()  +" new show is added. Click to book tickets for "+ event.getName().toUpperCase());
              }
          }
    }

    public void addShow(Event event){
        if(event instanceof  Movies){
            movies.add(event);
            notifySubscriber(event);
        }else{
            entertainmentShows.add(event);
            notifySubscriber(event);
        }
    }
}
