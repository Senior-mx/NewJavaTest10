package com.observer.java;

import java.util.Observable;
import java.util.Observer;

public class NewObserver implements Observer {
    private NewTeacherSubject newTeacherSubject;
    
    private String studentName;
    
    public NewObserver(NewTeacherSubject newTeacherSubject, String studentName) {
        // 这条必须要写，否则无法成为观察者
        newTeacherSubject.addObserver(this);
        this.newTeacherSubject = newTeacherSubject;
        this.studentName = studentName;
    }
    
    public NewObserver() {
    }
    
    @Override
    public void update(Observable o, Object arg) {
        int i = o.countObservers();
        System.out.println("观察者人数" + i);
        System.out.println(studentName + "收到作业" + arg);
    }
    /**
     * @Name: NewSubject
     * @Author 白纪良(bjl150)
     * @Description
     * @Date 14:05 2019-06-25
     **/
}
