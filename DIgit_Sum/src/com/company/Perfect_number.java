package com.company;

import java.util.Scanner;

public class Perfect_number {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");
        int p=scan.nextInt();
        if(perfect(p)==true)
            System.out.println(p+" is perfect number");
        else
            System.out.println(p+" is not a perfect number");
    }
    public static boolean perfect(int i){
        int sum=0;
        for(int p=1;p<=i/2;p++){
            if(i%p==0){
                sum=sum+p;
            }
        }
        if(i==sum)
            return true;
        else
            return false;


    }
}
