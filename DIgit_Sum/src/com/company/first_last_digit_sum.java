package com.company;

import java.util.Scanner;

public class first_last_digit_sum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");
        int p= scan.nextInt();
        System.out.println("the sum of first and last digit is "+sum(p));
    }
    public static int sum(int i){
        if(i>=10){
            int ln=i%10,sum1=0;
            do {
                i/=10;
             if(i<10&&i>0)
                 sum1=i+ln;
            }while(i>0);
            return sum1;
        }
        else
            return i;


    }
}
