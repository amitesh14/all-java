package com.company;
// in  this we have to find number of steps to make a number zero if the number is even we have to divide by 2 and if the number is odd we substract 1

public class number_of_steps_to_reduce_to_zero {
    public static void main(String[] args) {
        System.out.println(func(8,0));
    }
    static int func(int n,int t){


        if(n==0){
            return t;

        }
        else if(n%2==0){

          return  func(n/2,++t);
        }
        else
          return  func(n-1,++t);


    }



}
