package com.company;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        int max=0;
        System.out.println("Enter numbers");
        while (true){
            boolean isInt= scanner.hasNextInt();
            if (isInt) {
                int number = scanner.nextInt();
                boolean isPrime = true;
                for (int i = 2; i <= (number / 2); i++) {
                    if (!((number % i) == 0)) {
                        isPrime = true;


                    } else {
                        System.out.println("not prime");
                        isPrime = false;
                        break;
                    }

                }

                if ((isPrime) && (number >= max)) {
                    max = number;
                }
            }else{
                System.out.println("invalid value");
                break;
            }

        }
        System.out.println("The largest prime no.is = "+max);
        scanner.close();
    }


}
