package com.java.DSA.Array;

import java.util.ArrayList;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={21,43,76,17,12,34,56,79,24};
        ArrayList<Integer> arr1=new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--){
            arr1.add(arr[i]);
        }
        System.out.println(arr1);
    }
}
