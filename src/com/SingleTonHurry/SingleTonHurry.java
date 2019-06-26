package com.SingleTonHurry;

public class SingleTonHurry {
    private volatile static SingleTonHurry singleTonHurry = new SingleTonHurry();
    
    public SingleTonHurry() {
    }
    
    public static SingleTonHurry getSingleTonHurry() {
        synchronized (SingleTonHurry.class) {
            return singleTonHurry;
        }
    }
    
    public static void main(String[] args) {
        SingleTonHurry singleTonHurry = SingleTonHurry.getSingleTonHurry();
        SingleTonHurry singleTonHurry1 = SingleTonHurry.getSingleTonHurry();
        System.out.println(singleTonHurry == singleTonHurry1);
    }
}
