package com.company;

public class Main {

    public static void main(String[] args) {
            int n=7;
        for (int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
              //  if (i == j || i == 0 || j == 0 || i == n - 1 || j == n - 1 || i == n - j - 1) {
                if(i==j||i==n-j-1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();


        }
    }
}
