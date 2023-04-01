package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int m= scan.nextInt();
        int n= scan.nextInt();
        int ar=m*n;
        int count =0;
        if(n>m){
            int p=m;
            do{
                if(ar>=(p*p)){
                    ar-=p*p;
                    count++;
                    p--;
                }
                else{
                    p--;
                }




            }while(ar!=0);

        }
        else if(m>n){
            int p=n;
            do{
                if(ar>=(p*p)){
                    ar-=p*p;
                    count++;
                    p--;
                }
                else{
                    p--;
                }

            }while(ar!=0);

        }
        else{
            count=1;
        }
        System.out.println("the number of squares needed ="+count);
    }
}
