package com.company;


import java.util.Scanner;

public class SinhVien {
    public void tinhDiemTrungBinh() {
        int marks[] = new int[6];
        int i, n;
        float total = 0, avg;
        System.out.println("Nhập vào số môn học cần tính: ");
        Scanner scanner = null;
        n = scanner.nextInt();
        for (i = 0; i < n; i++) {
            System.out.print("Nhập vào điểm của môn thứ " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            total = total + marks[i];
        }
        avg = total / n;
        System.out.println("Điểm trung bình của " + n + " môn học trên là: " + avg);
        String name;


    }
    }

