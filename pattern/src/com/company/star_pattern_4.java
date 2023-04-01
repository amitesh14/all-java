package com.company;

import java.util.Scanner;

public class star_pattern_4 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the row");
        int n= scan.nextInt();

        for (int i=1;i<=n;i++){
            int k=1;
            for(int j=1;j<=((2*n)-1);j++){
                if(j>=(6-i)&&j<=(4+i)&&k==1){
                    System.out.print("*");
                    k=0;
                }
                else {
                    System.out.print(" ");
                    k = 1;
                }
            }
            System.out.println();

        }
    }

}
