package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int count=0;
        int sum=0;
        System.out.println("enter the minimum");
        int min=scan.nextInt();
        System.out.println("enter the maximum");
        int max=scan.nextInt();
        for(int i=min;i<=max;i++){
            //if(i%15==0){
            if(i%2!=0){
                count++;

               // System.out.println(i+" is divisible by 3 and 5 both");
                System.out.println(i+"is odd");
                sum+=i;
                if(count==5)
                    break;
            }

        }
        System.out.println("the sum is "+sum);
    }
}
