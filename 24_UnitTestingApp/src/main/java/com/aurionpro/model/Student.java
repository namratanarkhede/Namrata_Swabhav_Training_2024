package com.aurionpro.model;


public class Student {
    
    private IStudentService studentService;
    
    public Student(IStudentService studentService) {
        this.studentService = studentService;
    }

    public double calculatePercentge() {
        return (studentService.getMarks() / studentService.getTotalSubject());
    }

}