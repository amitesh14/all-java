package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter number" );

        Scanner scanner=new Scanner(System.in);
        int max= Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        while (true){
            boolean isInt= scanner.hasNextInt();
            if (isInt) {
                int number = scanner.nextInt();
              if (number>max){
                  max=number;
              }
                if (number < min) {
                    min=number;
                }

            }

        else{
                //System.out.println("your numbers are " +newNumber);
                break;
            }
            scanner.nextLine();

        }
        System.out.println("your max value is : " +max);
        System.out.println("your min value is : " +min);

         scanner.close();
    }
}
