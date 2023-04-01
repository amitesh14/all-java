package com.company;

public class Concept {
    public static void main(String[] args) {

    }
    public static void con(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
       // con(n--);
        //here n-- goes to an infinite loop because it first passes n and then subtract do make it valid we should use --n
        con(--n);
    }
}
