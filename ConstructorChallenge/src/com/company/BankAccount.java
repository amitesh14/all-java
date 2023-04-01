package com.company;

public class BankAccount {
    private int accountNumber;
    private int balance;
    private String customername;
    private String email;
    private String phonenumber;

    public BankAccount() {

    }

    public BankAccount(int accountNumber, int balance, String customername, String email, String phonenumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customername = customername;
        this.email = email;
        this.phonenumber = phonenumber;

    }


    public void Deposit(int deposite) {
        this.balance += deposite;
        System.out.println("deposited amount = " + deposite + ". new balace= " + this.balance);
    }

    public void Withdraw(int withdraw) {
        if (this.balance - withdraw < 0) {
            System.out.println("Available balance is not enough for this transaction.");
        } else {
            this.balance -= withdraw;
            System.out.println("the whidrawn amount = " + withdraw + ". New balance is " + (this.balance));
        }
    }


    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customername) {
        this.customername = customername;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public String getCustomername() {
        return customername;
    }

    public String getEmail() {
        return email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }


}
