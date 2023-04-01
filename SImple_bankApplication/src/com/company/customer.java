package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class customer {
    public static Scanner scan=new Scanner(System.in);
    private String customer_name;
    private int amount;

    public int getAmount() {
        return amount;
    }

    ArrayList<Double> transaction = new ArrayList<>();

    public customer(String customer_name, int amount) {
        this.customer_name = customer_name;
        this.amount=amount;


    }

    public String getCustomer_name() {
        return customer_name;
    }

   // public ArrayList<Double> getTransaction() {
       // return transaction;
 //   }
    public double addTransaction(){
        System.out.println("enter the amount you want to add");
        double x=scan.nextDouble();
        transaction.add(x);

        return x;

    }
    public void displaytransactions(){
        for (int i=0;i<transaction.size();i++){
            System.out.println((i+1)+". "+transaction.get(i));
        }

    }

}
