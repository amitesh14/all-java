package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    private String bankname;
    ArrayList<branch> bank = new ArrayList<>();
    private static Scanner scan = new Scanner(System.in);

    public Bank(String bankname) {
        this.bankname = bankname;
        this.bank = new ArrayList<branch>();
    }

    public String getBankname() {
        return bankname;
    }

    public void addBranch(branch Branch) {
        String p;
        System.out.println("eneter the name");
        p = scan.nextLine();
        Branch = new branch(p);
        bank.add(Branch);

    }

    public void branchdisplay() {
        for (int i = 0; i < bank.size(); i++) {
            System.out.println((i + 1) + ".  " + bank.get(i).getBranch_name());


        }
    }
    public int search(String name){
        for(int i=0;i<bank.size();i++){
            branch Branch=bank.get(i);
            if(Branch.getBranch_name().equals(name)){
                return i;

            }


        }
        return -1;
    }
    public void displaycustomers(customer cp){
        System.out.println("enter the customer name");
        String s=scan.nextLine();
        int p=search(s);
        if(p>=0){
            bank.get(p).cuatomerdisplay();


        }
        else {
            System.out.println("contact doesnot exists");
        }




    }

    }
