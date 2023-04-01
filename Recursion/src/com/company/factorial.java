package com.company;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=scanner.nextInt();
        int x=factoriall(n);
        System.out.println(x);
    }
    public static int factoriall(int n){
        int p=1;
        if(n<=1){
            return 1;
        }
        else{

           return  n*factoriall(n-1);

        }



    }
}
