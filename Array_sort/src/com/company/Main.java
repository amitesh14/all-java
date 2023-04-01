package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scan=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter number of elements");
        int p= scan.nextInt();
        System.out.println("enter array elements");
       int[] s= getArray(p);
        System.out.println("entered array elements are: ");
        printArray(s);
       int[] t= sortArray(s);
        System.out.println("\n sorted array : ");
        printArray(t);
    }
    public static int[] getArray(int p){
        int[] array_element=new int[p];
        for(int i=0;i<p;i++){
             array_element[i]= scan.nextInt();
        }

        return array_element;
    }
    public static void printArray(int[] array_elemrnts){
        for(int i=0;i<array_elemrnts.length;i++){
            System.out.print(array_elemrnts[i]);
            if(i<array_elemrnts.length-1){
                System.out.print(",");

            }
        }
    }
    public static int[] sortArray(int[] array_elements){

        for(int i=0;i<array_elements.length/2+1;i++){
            for (int j=0;j<array_elements.length-i-1;j++){
                if(array_elements[j]<array_elements[j+1]){
                    array_elements[j]=array_elements[j]+array_elements[j+1];
                    array_elements[j+1]=array_elements[j]-array_elements[j+1];
                    array_elements[j]=array_elements[j]-array_elements[j+1];

                }
            }
        }
        return array_elements;
    }
}
