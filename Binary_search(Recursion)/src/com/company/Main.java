package com.company;

public class Main {

    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarysearch(a,0,a.length-1,4));

    }
    public static int binarysearch(int[] arr,int l,int u,int target){
        int mid=l+(u-l)/2;

        if(l>u){
            return -1;
        }
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]>target)
           return binarysearch(arr,l,mid-1,target);
        else
           return binarysearch(arr,mid+1,u,target);


    }

}
