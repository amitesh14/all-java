package com.company;

public class reverse_number {
    public static void main(String[] args) {
      reverse(523);
    }
    static void reverse(int n){
        if(n==0){
            return;
        }
        System.out.print(n%10);
        reverse(n/10);


    }
}
