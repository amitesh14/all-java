package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scan=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter number of elements in array");
        int count=scan.nextInt();
        System.out.println("eneter array elements");
        int[] t=readInput(count);
        for (int i=0;i<t.length;i++){
        System.out.print(t[i]+" ");}
        System.out.println("\nminimum element is ");
        System.out.println(findmin(t));
    }
    public static int[] readInput(int count){
        int[] array=new int[count];
        for(int i=0;i<count;i++){
            array[i]= scan.nextInt();


        }
        return array;
    }
    public static int findmin(int[] array) {
        int min=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        return min;
    }
}
