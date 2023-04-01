package com.company;


import java.util.Scanner;
import static com.company.Scanne.scan;


public class Main {


    public static void main(String[] args) {
        System.out.println("enter number of burgers you want to buy");
        int f = scan.nextInt();
        for (int i = 1; i <= f; i++) {
            System.out.println("press 1 for basic burger\n" +
                    "press 2 for healthy burger\n" +
                    "press 3 for delux burger");
            f = scan.nextInt();

            switch (f) {
                case 1:

                    System.out.println("enter the bread type");
                    String p = scan.next();
                    System.out.println("enter the meat type");

                    String q = scan.next();

                    Base_hamburger base_hamburger = new Base_hamburger(p, q);
                    base_hamburger.extra_item();
                    continue;

                case 2:

                    System.out.println("enter the meat type");
                    q = scan.next();

                    healthy_hamburger healthy_hamburger = new healthy_hamburger(q);
                    healthy_hamburger.extra_item();
                    continue;
                case 3:
                    System.out.println("enter the bread type");
                    p = scan.next();
                    System.out.println("enter the meat type");
                    q = scan.next();

                    Deluxe_hamburger deluxe_hamburger = new Deluxe_hamburger(p, q);
                    deluxe_hamburger.extra_item();
            }

        }
    }
}
class Scanne{
    public static Scanner scan =new Scanner(System.in);

}
