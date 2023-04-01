package com.company;

public class Main {

    public static void main(String[] args) {

       //---------------------------------------------------------------------------------------------------------
       //INTEGER

       int INtegerMinnumber= Integer.MIN_VALUE;
       int INtegerMaxnumber= Integer.MAX_VALUE;
        System.out.println("min integer value= "+INtegerMinnumber);
        System.out.println("max integer value= "+INtegerMaxnumber);
        // OVERFLOW= if we make a number bigger than the maximum value of any data type .
        System.out.println("Busted integer"+(INtegerMaxnumber+1));
        // UNDERFLOW= if we make a number smaller than the maximum value of any data type .
        System.out.println("Busted integer"+(INtegerMinnumber-1));

       //-------------------------------------------------------------------------------------------------------------------
        //BYTE
        byte ByteMinValue= Byte.MIN_VALUE;
        byte ByteMaxValue= Byte.MAX_VALUE;
        System.out.println("Byte min value= "+ByteMinValue);
        System.out.println("Byte max value= "+ByteMaxValue);

        //--------------------------------------------------------------------------------------------------------------
        //SHORT
        short ShortMinValue= Short.MIN_VALUE;
        short ShortMaxValue= Short.MAX_VALUE;
        System.out.println("THhe minimum value of short "+ShortMinValue);
        System.out.println("THhe maximum value of short "+ShortMaxValue);

        //--------------------------------------------------------------------------------------------------------------
        //LONG
        long LongMinValue= Long.MIN_VALUE;
        long LongMaxValue= Long.MAX_VALUE;
        System.out.println("Long minimum value="+LongMinValue);
        System.out.println("Long maximum value="+LongMaxValue);
        long number=8899855222355621L;

        //--------------------------------------------------------------------------------------------------------------
        //CASTING-  it means to treat or convert  a number from one type to another .we put the type we want the number
        //to be in parenthesis

        byte hello= (byte) (ByteMinValue/2);//HERE we have to cast byte else we get an error


    }
}
