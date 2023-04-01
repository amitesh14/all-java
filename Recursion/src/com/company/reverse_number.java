package com.company;

public class reverse_number {
    public static void main(String[] args) {
     int n= reverse(4456789);
        System.out.println(n);

    }
    static int  reverse(int n){


        if(n%10==n){
            return n;
        }
       int count=(int)(Math.log10(n))+1;//to count the number of digits

        int f=(int)(Math.pow(10,count-1));

        return n%10*f+reverse(n/10);


    }
}
