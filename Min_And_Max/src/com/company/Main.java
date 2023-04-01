package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);


        int q=0,max=0,min=899999999;
        System.out.println(" press any character to exit");


        while (true){
            System.out.println("enter the numbers");
             boolean no = scan.hasNextInt();


if(no) {
    int p=scan.nextInt();
    if (p > max) {
        max = p;
    }
    if (p < min) {
        min = p;
    }

}
else
    break;


        }
        System.out.println("max is "+max+" min is "+min);

    }
}
