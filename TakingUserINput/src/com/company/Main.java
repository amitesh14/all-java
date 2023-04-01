package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner newScanner= new Scanner(System.in);
        System.out.println("enter your year of birth");
        boolean hasNextInt= newScanner.hasNextInt();
        if (hasNextInt) {
            int Yearofbirth = newScanner.nextInt();
            newScanner.nextLine();//This handels the next line character othewise it will not ask to input name

            System.out.println("enter yoiur name");
            String name = newScanner.nextLine();
            int age = 2021 - Yearofbirth;
            if (age>0 && age<120) {
                System.out.println("Your name is " + name + " and you are " + age + " years old");
            }else {
                System.out.println("Invalid age value");
            }
        }else{
            System.out.println("value of year of birth is incorrect  ");
        }
        newScanner.close();

    }
}
