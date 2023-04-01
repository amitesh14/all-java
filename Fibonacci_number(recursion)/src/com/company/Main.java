package com.company;

public class Main {
   //static int count=0;

    public static void main(String[] args) {
        System.out.print(fibo(6));
    }
    static int fibo(int n){


       /* if(count==n){
            return;
        }
        System.out.print(a+",");
        int c=b;

        count++;

        fibo(c,b+a,n);*/
        if(n<2){
            return n;

        }

        return fibo(n-1)+fibo(n-2);



    }
}
