package com.company;

import java.util.Scanner;

public class InputArr {
    public static void main (String[] args){
        Scanner InputFloat = new Scanner(System.in);
        int n = 0;
        do {
            System.out.println("Nhap mot so n <= 5:");
            try{
            n = InputFloat.nextInt();}
            catch (Exception e){

                    System.out.println("Not an integer. Try again: ");
                    if (InputFloat.hasNextLine()) InputFloat.nextLine();
                    continue;
            }
        } while (n > 5);
        float[] arr = new float[n];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = InputFloat.nextFloat();
        }
    }
}
