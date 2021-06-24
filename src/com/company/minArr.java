package com.company;

public class minArr {
    public static void main(String[] args){
        int [] arr = {1,6,3,2};
            int min = arr[0];
            int max = arr[0];
        int n;
        for (int i = 0; i < arr.length; i++){
                if (min >= arr[i])
                    min = arr[i];

        }
        for (int i = 0; i < arr.length; i++){
            if (max <= arr[i])
                max = arr[i];

        }
        System.out.println(min);
        System.out.println(max);
    }


}
