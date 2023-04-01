package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] arr=new int[6];
        for(int i=0;i< arr.length;i++){
            arr[i]= scan.nextInt();
        }
        int l=0;
        int sum=0, avg=0,avg1=0,avg2=0;
        int u= arr.length;

        while (l<u){

            int size=(u+1)-l;
            int p=l;
            int q=u;
            sum=0;
             for(int i=p;i<=q&&q<arr.length;i++){
                 sum+=arr[i];

                   if(i==q) {

                       avg = sum/size;

                       p++;
                       q++;
                       i=p-1;
                       sum=0;
                   }

                 if(avg>avg1){
                     avg1=avg;
                 }




             }
          u--;
             if(avg1>avg2){
                 avg2=avg1;

             }


        }

        System.out.println("the highest average is"+avg2);




    }

}
