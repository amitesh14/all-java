package com.company;

import java.util.Scanner;

public class sum_of_nterms {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        n=scanner.nextInt();
        System.out.println(print(n));;
    }
    public static int  print(int n){
        //  System.out.println(n);
        int sum;
        if(n<1){
            return 1;
        }

        else{

            print(n-1);
            return n+print(n-1);

        }

    }
}
