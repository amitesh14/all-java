package com.company;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
       int[] newint=new int[10];

        System.out.println("enter the numbers  required ");
        double sum=0;
        for (int i =0; i< newint.length;i++){
            newint[i]= scanner.nextInt();
            System.out.println("the entered number "+(i+1)+" = " +newint[i]);
            sum+=newint[i];

        }
        System.out.println(sum);



        double average = sum/newint.length;
        System.out.println("its average value is = "+average);



    }
}
