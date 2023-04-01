package com.company;

import java.util.Scanner;

public class sum_of_DIGITS {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n,sum=0;
        n=scanner.nextInt();
        System.out.println(print(n));;
    }
    public static int  print(int n){
        //  System.out.println(n);

        if(n<1){
            return 0;
        }

          return n%10+print(n/10);





    }
}
