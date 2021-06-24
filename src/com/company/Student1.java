package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Student1 {
    public static void main(String args[]) {
            ArrayList<Student> students = new ArrayList<Student>();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập vào số học sinh: ");
            int m = scanner.nextInt();
            for (int j = 0; j < m; j++) {
                if (scanner.hasNextLine()) scanner.nextLine();
                System.out.println("Nhap ten:");
                String name = scanner.nextLine();
                int marks[] = new int[6];
                int i, n;
                float total = 0, avg;
                System.out.println("Nhập vào số môn học cần tính: ");
                n = scanner.nextInt();
                for (i = 0; i < n; i++) {
                    System.out.print("Nhập vào điểm của môn thứ " + (i + 1) + ": ");
                    marks[i] = scanner.nextInt();
                    total = total + marks[i];
                }
                avg = total / n;
                System.out.println("Điểm trung bình của " + n + " môn học trên là: " + avg);
                students.add(new Student((int) avg, name));

            }
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




