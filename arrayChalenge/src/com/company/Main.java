package com.company;

import java.util.Scanner;

public class Main {

   private static Scanner scanner= new Scanner(System.in);


    public static void main(String[] args) {

        int[] myintValue= getInteger(5);


    }
    public static int[] getInteger(int value) {
        int[] arry= new int[value];
        System.out.println("enter "+value+" numbers ");
        for (int i=0;i< arry.length;i++){
            arry[i] =scanner.nextInt();

        }
        return arry;
    }

    public static void PrintArray(int[] arry){
        System.out.println("the selected numbers are" + );






    }
}
