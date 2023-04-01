package com.company;

import java.util.Scanner;

public class pascal_triangle {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int i,j,k,n,p,f=1;
        n= scan.nextInt();
        for(i=0;i<n;i++){
            for(p=1;p<=n-i-1;p++){
                System.out.print(" ");}
            for (j=0;j<=i;j++){

                if(j==0||i==0){
                    f=1;}
                else

                {

                    f=f*(i-j+1)/j;


                }
                System.out.print(f+" ");

            }


            System.out.println();


        }
        System.out.println();

    }
}
