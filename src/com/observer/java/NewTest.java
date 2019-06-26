package com.observer.java;

import java.util.ArrayList;
import java.util.LinkedList;

public class NewTest {
    /**
     * @Name: NewTest
     * @Author 白纪良(bjl150)
     * @Description
     * @Date 14:24 2019-06-25
     **/
    public static void main(String[] args) {
        /*
         * NewTeacherSubject newTeacherSubject = new NewTeacherSubject(); NewObserver 张三 = new
         * NewObserver(newTeacherSubject, "张三"); NewObserver 李四 = new NewObserver(newTeacherSubject, "李四"); NewObserver
         * 王五 = new NewObserver(newTeacherSubject, "王五"); newTeacherSubject.setHomeArrayL1篇作文");
         */
        ArrayList<Integer> objects = new ArrayList<>();
        objects.add(1);
        objects.add(2);
        objects.add(3);
        LinkedList<Integer> integers = new LinkedList<>(objects);
        for (Integer integer : integers) {
            System.out.println("linkedlist" + integer);
        }
    }
}
