package com.data.observemodel;

public interface Subject {
    /**
     * @Name: Subject
     * @Author 白纪良(bjl150)
     * @Description
     * @Date 13:28 2019-06-25
     **/
    public void addObserver(Observer o);
    
    public void deleteObserver(Observer o);
    
    public void notifyObserver(String notice);
}
