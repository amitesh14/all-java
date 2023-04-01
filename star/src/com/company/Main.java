package com.company;

public class Main {

    public static void main(String[]args) {
        int c=0;
        int d;
        int e;
        for(int l=1;l<3;l++) {

            d=c+1;
            e=c+5;
                for (int i = d; i <= e; i++) {
                    for (int k = e; k >= i; k--) {
                        System.out.print(" ");
                    }
                    for (int j = d; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                    c++;
                }
            }

        /*for(int i=5;i>=1;i--){
            for(int k=5;k>=i;k-- )
            {
                System.out.print(" ");
            }
            for(int j=1;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }*/
    }
}
