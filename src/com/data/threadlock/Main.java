package com.data.threadlock;

public class Main {
    private int age;
    
    private static Object lock1 = new Object();
    
    private static Object lock2 = new Object();
    
    public static void main(String[] args) {
        new Thread()
        {
            @Override
            public void run() {
                synchronized (lock1) {
                    System.out.println("线程1获取锁1第一步");
                    try {
                        Thread.sleep(100);
                    }
                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (lock2) {
                        System.out.println("线程2获取锁2第二步");
                    }
                }
                System.out.println("线程1获取锁结束");
            }
        }.start();
        
        new Thread()
        {
            @Override
            public void run() {
                synchronized (lock2) {
                    System.out.println("线程2获取锁2第一步");
                    try {
                        Thread.sleep(500);
                    }
                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (lock1) {
                        System.out.println("线程2获取锁1第二步");
                    }
                }
                System.out.println("线程2获取锁结束");
            }
        }.start();
    }
}
