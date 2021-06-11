package com.example.practice2.pojo;

public class StudentModel {

    private String studentName;
    private long studentClass;
    private long studentAge;
    private String studentEmail;

    public StudentModel(String studentName, long studentClass, long studentAge, String studentEmail) {
        this.studentName = studentName;
        this.studentClass = studentClass;
        this.studentAge = studentAge;
        this.studentEmail = studentEmail;
    }

    public void setStudentName(String studentName){
        this.studentName = studentName;
    }

    public String getStudentName(){
        return studentName;
    }

    public long getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(long studentClass) {
        this.studentClass = studentClass;
    }

    public long getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(long studentAge) {
        this.studentAge = studentAge;
    }

    public String getEmail() {
        return studentEmail;
    }

    public void setEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }
}
