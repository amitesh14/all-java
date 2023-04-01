package com.company;

import java.util.Scanner;

public class print_1_to_n {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        n=scanner.nextInt();
        print(n);
    }
    public static void print(int n){
        //  System.out.println(n);
        if(n<1){
            return;
        }

        else{

            print(n-1);
            System.out.println(n);
        }
    }
}
