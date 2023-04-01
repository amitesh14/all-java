package com.company;

public class Main {

    public static void main(String[] arg){

        float a= 5555.333f;
        float MinFloatValue= Float.MIN_VALUE;
        float MaxFloatValue= Float.MAX_VALUE;
        System.out.println("The minimum float value= "+MinFloatValue);
        System.out.println("The maximum float value= "+MaxFloatValue);

        double MinDoubleValue= Double.MIN_VALUE;
        double MaxDoubleValue= Double.MAX_VALUE;
        System.out.println("The minimum double value= "+MinDoubleValue);
        System.out.println("The maximum double value= "+MaxDoubleValue);

        float p=(float) 55.334;// casting

        float e=888.88f;
        double f=888.88;
        System.out.println(e/3);
        System.out.println(f/3);

        //For precise calculation float or double is not used instead big decimal is used

    }
}
