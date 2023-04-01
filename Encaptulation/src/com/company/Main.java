package com.company;

public class Main {

    public static void main(String[] args) {
        Printer microsoft= new Printer(true,100,5);
        System.out.println("duplex printer=" + microsoft.isDuplexPrinter());
        microsoft.printpages();
        microsoft.addToner(3);



        Printer lg =new Printer(false,200,20);
        System.out.println("duplex printer=" + lg.isDuplexPrinter());
        lg.printpages();

    }
}
