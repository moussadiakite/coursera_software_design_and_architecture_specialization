package com.observerPattern;

import java.util.ArrayList;

public class Channel implements Subject{
    private ArrayList<Observer> observers;
    private String channelName;
    private String status;

    public Channel(String channelName, String status) {
        this.observers = new ArrayList<Observer>();
        this.channelName = channelName;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer obs) {
        observers.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
        observers.remove(obs);
    }

    @Override
    public void notifyObservers() {
        for(Observer obs: observers)
        {
            obs.update(this.status);
        }
    }
}
