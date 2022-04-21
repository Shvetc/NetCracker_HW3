package com.netcracker.horstmannbigjava.ch3.p3_8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Student {
    String name;
    List<Integer> quizScore;

    public Student(String name) {
        this.name = name;
        quizScore = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addQuiz(int score) {
        quizScore.add(score);
    }

    public List<Integer> getTotalScore() {
        return quizScore;
    }

    public int getAverageScore() {
        int sumScore = 0;
        for (Integer score : quizScore) {
            sumScore += score;
        }
        return quizScore.size() != 0 ? sumScore / quizScore.size() : 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", total quiz's scores= " + quizScore +
                ", average score =" + getAverageScore() +
                '}';
    }
}
