package com.company;

public class Main {

    public static void main(String[] args) {

        // For statement is used to execute a code n number of times

        for (int i=0;i<=5;i++){ // here (i=0 is initialiasation point; i<=5 is termination point; i++ is increment in value of i)
            System.out.println("hello "+i+ " world");
        }
        System.out.println("----------------------------------------------------------------------------------------");

//-----------------------------------------------------------------------------------------------------------------------------
        //Challenge

           calculateInterest(10000,2);
           calculateInterest(10000);
    }
        public static double calculateInterest(double amount, double interestRate){
            double p=interestRate;
        for (p=2; p<=8;p++){

        System.out.println ("10000 at"+p+"% interest = "+ amount*(p/100));}
            System.out.println("----------------------------------------------------------------------------------------");
        return amount*(p/100);
    }
    //------------------------------------------------------------------------------------------------------------------

    public static double calculateInterest(double amount){
        double p=8;
        for (p=8; p>=2;p--){

            System.out.println ("10000 at"+p+"% interest = "+ amount*(p/100));}
        return amount*(p/100);
    }

}
