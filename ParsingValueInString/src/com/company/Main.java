package com.company;

public class Main {

    public static void main(String[] args) {
	   String numberAsstring= "2018";//here 2018  is a piece of text rather than a number
              System.out.println("number as string = "+numberAsstring);
              // we can convert it into  another data type by using pars

          int number=Integer.parseInt(numberAsstring);
        System.out.println("numbe="+number);
        System.out.println("number as string+22= "+(numberAsstring+22));
        System.out.println("number+22= "+(number+22));
    }
}
