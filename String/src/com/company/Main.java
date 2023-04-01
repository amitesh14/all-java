package com.company;

public class Main {

    public static void main(String[] args) {

        String mystring= "this is my string";
        System.out.println(mystring);
        //we can change the string as many times as is want
        mystring= mystring+",this si more";
        System.out.println(mystring);
         mystring= mystring+ "\u0006";
        System.out.println(mystring);

        String h= "88";
        String p="99";
        System.out.println(h+p);
        //if we write the numbers in string like this it treat it as  a plain text

        int a=99;
        System.out.println(h+a);

    }
}
