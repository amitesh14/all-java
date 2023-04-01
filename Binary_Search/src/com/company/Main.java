package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the size of array");
        int p= scan.nextInt();
        int[] arr=new int[p];
        for(int i=0;i<arr.length;i++){
            arr[i]= scan.nextInt();
        }
        System.out.println("enter the number to find");
        int x=scan.nextInt();
        int t=binary_search(arr,x);
        if(t==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("element found at "+(t+1));
        }
    }
    public static int binary_search(int[] arr,int x){
        int s=0;
        int f=arr.length-1;

        while(f>=s){
            int mid=(s+f)/2;
            if(arr[mid]==x){
                return mid;
            }
            else if (arr[mid]>x){
                f=mid-1;
            }
            else if(arr[mid]<x){
                s=mid+1;
            }
        }
        return -1;
    }
}
