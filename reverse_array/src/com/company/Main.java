package com.company;

import java.util.Scanner;

public class Main {
 private static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter number of array inputs");
        int count = scan.nextInt();
        int[] t =inputArray(count);
        System.out.println("inputed array is ");
        for (int i=0;i<count;i++){
            System.out.print(t[i]+" ");

        }
        int[] s=reverseArray(t);
        System.out.println("reversed array is ");
        for (int i=0;i<count;i++){
            System.out.print(s[i]+" ");

        }


    }
    public static int[] inputArray(int count){
        int[] array=new int[count];
        for (int i=0;i<count;i++){
            array[i]= scan.nextInt();
        }
        return array;
    }
    public static int[] reverseArray(int[] array){
        int[] reverse =new int[array.length];
        int n= array.length;
        for(int i=0;i< array.length;i++){

            n--;
            reverse[i]=array[n];

        }
        return reverse;
    }
}
