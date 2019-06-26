package com.data.observemodel;

import java.util.ArrayList;

public class TeacherSubject implements Subject {
    private ArrayList<Observer> observers = new ArrayList<>();
    
    private String notice;
    
    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }
    
    @Override
    public void deleteObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i > 0) {
            observers.remove(i);
        }
    }
    
    @Override
    public void notifyObserver(String notice) {
        for (Observer observer : observers) {
            observer.notice(notice);
        }
    }
    
    public void publishHomework(String info) {
        System.out.println("老师布置作业" + info);
        notifyObserver(info);
    }
}
