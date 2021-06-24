package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class SortStudentArr {
    public static void main (String [] args){
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(3,"Nguyen van A"));
        students.add(new Student(7,"Nguyen van B"));
        students.add(new Student(6,"Nguyen van A"));
        students.add(new Student(5,"Nguyen van B"));
        students.add(new Student(4,"Nguyen van B"));
        System.out.println("Sap xep danh sach theo ten:");
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAvgScore() - o2.getAvgScore();
            }
        });
        for (Student student : students){
            System.out.println(student.toString());
        }
    }

}
