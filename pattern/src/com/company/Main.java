package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the row");
        int n= scan.nextInt();
        for (int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(i==j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();

        }
    }
}
