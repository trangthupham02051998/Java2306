package com.company;

import java.util.Scanner;

public class tinhTuoi {
    public static void main(String[] args){
        int age;
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập năm sinh:");

        year = sc.nextInt();

        age = 2021 - year;
        System.out.println("Bạn:" + age);
    }
}
