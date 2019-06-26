package com.singleTonlazy;

public class SingleTonlazy {
    private volatile static SingleTonlazy instance = null;
    
    private SingleTonlazy() {
    }
    
    public static SingleTonlazy getSingleTon() {
        if (instance == null) {
            synchronized (SingleTonlazy.class) {
                if (instance == null) {
                    instance = new SingleTonlazy();
                }
            }
        }
        return instance;
    }
    
    public static void main(String[] args) {
        SingleTonlazy singleTon = SingleTonlazy.getSingleTon();
        SingleTonlazy singleTon1 = SingleTonlazy.getSingleTon();
        System.out.println(singleTon == singleTon1);
    }
}
