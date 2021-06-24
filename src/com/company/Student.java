package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    String studentName;
    int avgScore;

    public int getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(int avgScore) {
        this.avgScore = avgScore;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Student(int avgScore, String studentName) {
        this.avgScore = avgScore;
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", avgScore=" + avgScore +
                '}';
    }
}

