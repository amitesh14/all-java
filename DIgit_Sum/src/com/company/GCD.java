package com.company;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter first number");
        int p= scan.nextInt();
        System.out.println("enter second number");
        int q= scan.nextInt();
        System.out.println("the gcd of "+p+" & "+q+" is "+Gcd(p,q));
    }
    public static int Gcd(int i,int j){
        int c;
        while(i>0){
            c=j%i;
            j=i;
            i=c;
        }
        return j;


    }
}
