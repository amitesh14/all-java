package com.company;

import java.util.Scanner;

public class shared_digit {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter first number");
        int p= scan.nextInt();
        System.out.println("enter second number");
        int q= scan.nextInt();
        shared(p,q);

    }
    public static void shared(int i,int j){
        int r,s,p;
        while(i>0) {
            r=i%10;
            p=j;
            while (p>0){
                s=p%10;
                if(r==s){
                    System.out.println(r+" is a shared digit");
                    break;
                }

                p=p/10;

            }
            i=i/10;
        }


    }
}
