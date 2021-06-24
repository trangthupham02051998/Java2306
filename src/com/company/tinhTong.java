package com.company;

import java.util.Scanner;

public class tinhTong {
    public static void main (String[] args){
        int n;
        int sum =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên:");

        n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
