package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        /*Bank_Account bank=new Bank_Account();
        System.out.println("enter customer name");
        bank.setCustomer_name(scan.nextLine());
        System.out.println("enter customer email");
        bank.setEmail(scan.nextLine());
        System.out.println("enter customer account number");
        bank.setAccount_number(scan.nextInt());
        System.out.println("enter account balance");
        bank.setBalance(scan.nextInt());
        System.out.println("enter customer phone number");
        bank.setPhone_number(scan.nextLong());
        int p;

        do {
            System.out.println("enter 1 to deposit fund and 2 to withdraw fund");

            int  s=scan.nextInt();
            switch (s){
                case 1:
                    System.out.println("enter amount to be deposited");
                bank.deposite_funds(scan.nextInt());
                break;
                case 2:
                    System.out.println("enter amount to be withdrawn");

                    bank.withdraw_fund(scan.nextInt());

            }
            System.out.println("enter 0 to exit or any other number to continue ");

            p=scan.nextInt();


        }while (p!=0);
        System.out.println("\n\n\n*******************************************************************");

        System.out.println("customer name : "+bank.getCustomer_name());
        System.out.println("customer email : "+bank.getEmail());
        System.out.println("customer Account number : "+bank.getAccount_number());
        System.out.println("Final balance : "+bank.getBalance());
        System.out.println("customer phone number : "+bank.getPhone_number());*/

        Vip_account vip= new Vip_account();
        System.out.println("customer name "+vip.getCustomer_name());
        System.out.println("customer email"+vip.getCustomer_email());
        System.out.println("credit limit"+vip.getCredit_limit());

        Vip_account Amitesh=new Vip_account(scan.nextLine(),scan.nextLine(), scan.nextInt());
        System.out.println("customer name "+Amitesh.getCustomer_name());
        System.out.println("customer email"+Amitesh.getCustomer_email());
        System.out.println("credit limit"+Amitesh.getCredit_limit());

        Vip_account aman=new Vip_account(scan.nextLine(),scan.nextLine());
        System.out.println("customer name "+aman.getCustomer_name());
        System.out.println("customer email"+aman.getCustomer_email());
        System.out.println("credit limit"+aman.getCredit_limit());





    }
}
