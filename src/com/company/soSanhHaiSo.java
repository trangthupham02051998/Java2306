package com.company;


public class soSanhHaiSo {
    public static void main(String[] args) {
        soSanhHaiSo test = new soSanhHaiSo();
        int soLon = test.soLon(1,2);
        System.out.println(soLon);
    }
    public int soLon(int a,int b){
        a = 3;
        b = 6;
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}