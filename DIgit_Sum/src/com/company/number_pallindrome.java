package com.company;

import java.util.Scanner;

public class number_pallindrome {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");
        int n= scan.nextInt();
        boolean p=pallindrome(n);
        if(p==true)
            System.out.println(n+" is pallindrome");
        else
            System.out.println(n+"is not pallindrome");

    }
    public static boolean pallindrome(int i){
        int rem=0,r;
        int q=i;
        do{
            r=i%10;
            rem=rem*10+r;
            i/=10;
        }
        while(i>0);
        if(q==rem)
            return true;
        else
            return false;
    }

}
