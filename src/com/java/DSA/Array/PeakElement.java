package com.java.DSA.Array;
import java.util.*;
public class PeakElement {
    public static void main(String[] args) {
        int[] arr={10,40,20,50,80,30,50};
        int size=arr.length;
        int peakEl=peakElement(arr,size);
        System.out.println(peakEl);
    }
    static int peakElement(int[] arr,int n)
    {
        //add code here.
        Arrays.sort(arr);
        int peak=arr[n-1];
        return peak;
    }
}
