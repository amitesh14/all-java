package com.company;

public class Main {

    public static void main(String[] args) {

        //plus
        int p=1+2;
        //minus
        int q= 3-2;
        //product
        int r = 3*2;
        //factor
        int s= 9/3;
        //modulus- it is used to find the remainder
        double t=31%3;
        System.out.println(p);
        System.out.println(q);
        System.out.println(r);
        System.out.println(s);
        System.out.println(t);

        int u=p;
        System.out.println(u); // here we see that even the value of u is equal to p
        p=p+3;                  //its values does not get updated when  p gets updated
        System.out.println("p+3= "+p);  // this shows  u is independent of p
        System.out.println(u);
        //---------------------------------------------------------------------------------------------
        //ABBREVIATION operator
        // PLUS abbreviation
        p++;//add by 1
        System.out.println("p++= " +p);
        //MINUS abbreviation
        p--;// subtract by 1
        System.out.println("7-1= "+p);

        p+=3;//add by 3 or any number
        System.out.println("6+3=" +p);

        //product abbreviation
        p*=8;
        System.out.println("9*8= "+p);
        // division abbreviation
        p/=2;
        System.out.println("72/2= " +p);

    }
}