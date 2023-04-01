package com.company;


import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int count=0;
        System.out.println("enter the minimum");
        int min=scan.nextInt();
        System.out.println("enter the maximum");
        int max=scan.nextInt();
        for(int i=min;i<=max;i++){
            boolean p=isprinme(i);
            if(p==true){
                count++;
                System.out.println(i+ " is a prime number");
            }
            if(count==1000){
                break;
            }
        }
    }
    public static boolean isprinme(int n){
        if(n==1||n<=0){
            return false;

        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return true;

    }
}
