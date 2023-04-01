package com.company;

public class Main {

    public static void main(String[] args) {
         SumCalculator calculator=new SumCalculator();


         calculator.setFirstNumber(999);
        System.out.println("First number= "+calculator.getFirstNumber());
         calculator.setSecondNumber(9999);
        System.out.println("Second number= "+ calculator.getSecondNumber());
        System.out.println("total sum = "+ calculator.getAddition());

    }
}
