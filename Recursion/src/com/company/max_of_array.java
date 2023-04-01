package com.company;

public class max_of_array {
    static int max1=Integer.MIN_VALUE;
    public static void main(String[] args) {
     int[] arr={1,3,5,3,21,5,7,8,4,9};
        System.out.println(max(arr, arr.length));
    }
    static int max(int[] arr,int len){
        if(len==1){
            return max1;
        }
        if(arr[len-1]>max1)
            max1=arr[len-1];
            return max(arr,len-1);



    }
}
