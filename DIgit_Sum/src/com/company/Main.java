package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");
        int p=scan.nextInt();
        System.out.println("the sum of digits is "+sum(p));

    }
    public static int sum(int i){
        int sum=0,r;
        do{
           r=i%10;
           sum+=r;
           i/=10;
        }
        while(i>0);
        return sum;
    }

}
