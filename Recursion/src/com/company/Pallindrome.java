package com.company;

public class Pallindrome {
    public static void main(String[] args) {
        int t=22322;
        int n= reverse(t);
        if(t==n)
        System.out.println("yes it is a pallindrome number");

        else
            System.out.println("not a pallindrome");

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
