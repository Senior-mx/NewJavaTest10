package com.observer.java;

import java.util.Observable;

public class NewTeacherSubject extends Observable {
    /**
     * @Name: NewTeacherSubject
     * @Author 白纪良(bjl150)
     * @Description
     * @Date 14:17 2019-06-25
     **/
    public void setHomework(String notice) {
        setChanged();
        notifyObservers("老师布置作业" + notice);
    }
}
