package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ennter the size of array");
        int p = scanner.nextInt();
        int[] array=new int[p];
        for(int i=0;i<p;i++){
            array[i]= scanner.nextInt();
        }
        int x=array[p-1];
        for(int i=p-2;i>=0;i--){
            array[i+1]=array[i];
        }
        array[0]=x;
        for(int i=0;i<p;i++){
            System.out.print(array[i]+",");
        }

    }

}
