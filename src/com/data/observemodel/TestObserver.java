package com.data.observemodel;

public class TestObserver {
    /**
     * @Name: TestObserver
     * @Author 白纪良(bjl150)
     * @Description
     * @Date 13:48 2019-06-25
     **/
    public static void main(String[] args) {
        TeacherSubject teacherSubject = new TeacherSubject();
        StudentObserver studentObserver = new StudentObserver(teacherSubject, "张三");
        StudentObserver studentObserver2 = new StudentObserver(teacherSubject, "李四");
        StudentObserver studentObserver3 = new StudentObserver(teacherSubject, "王五");
        teacherSubject.publishHomework("第三页的题都做了");
        teacherSubject.publishHomework("寒假作业不用做了");
        
    }
    
}
