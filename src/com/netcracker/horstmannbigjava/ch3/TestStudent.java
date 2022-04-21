package com.netcracker.horstmannbigjava.ch3;

import com.netcracker.horstmannbigjava.ch3.p3_8.Student;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student("Robin");
        student.addQuiz(40);
        student.addQuiz(50);
        student.addQuiz(80);
        System.out.println(student);
    }
}
