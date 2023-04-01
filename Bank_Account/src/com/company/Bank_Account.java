package com.company;

public class Bank_Account {
    private int account_number;
    private int balance;
    private String customer_name;
    private String email;
    private long phone_number;

    public int getAccount_number() {
        return account_number;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(long phone_number) {
        this.phone_number = phone_number;
    }
    public int deposite_funds(int deposite){
       this.balance+=deposite;
        System.out.println("the amount deposited is "+deposite+" new balance is "+balance);
        return this.balance;

    }
    public int withdraw_fund(int withdraw){
        if(withdraw>balance){
            System.out.println("balance is insufficient");
            return balance;
        }
        else{
            this.balance-=withdraw;
            System.out.println("the amount withdraw is "+withdraw+"the balance is "+this.balance);
            return balance;
        }


    }


}
