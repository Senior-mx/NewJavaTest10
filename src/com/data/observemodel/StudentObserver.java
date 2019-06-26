package com.data.observemodel;

public class StudentObserver implements Observer {
    private TeacherSubject teacherSubject;
    
    private String studentName;
    
    public StudentObserver() {
    }
    
    public StudentObserver(TeacherSubject teacherSubject, String studentName) {
        this.teacherSubject = teacherSubject;
        this.studentName = studentName;
        teacherSubject.addObserver(this);
    }
    
    @Override
    public void notice(String notice) {
        System.out.println(studentName + "学生写作业" + notice);
    }
    /**
     * @Name: StudentObserver
     * @Author 白纪良(bjl150)
     * @Description
     * @Date 13:37 2019-06-25
     **/
}
