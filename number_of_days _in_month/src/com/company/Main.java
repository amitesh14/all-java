package com.company;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the month");
        String p= scan.nextLine();
        switch (p.toLowerCase()) {
            case "january", "march", "may", "july", "august", "october", "december" -> System.out.println("31 days");
            case "february" -> System.out.println("29 or 28 days");
            case "april", "june", "september", "november" -> System.out.println("30 days");
        }
    }
}
