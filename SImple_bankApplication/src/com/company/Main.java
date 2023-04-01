package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scan=new Scanner(System.in);
    ArrayList<Bank> banks=new ArrayList<>();


    public  void main(String[] args) {
        int p= scan.nextInt();
        switch (p){
            case 1:
                String q;
                System.out.println("eneter the name");
                q = scan.nextLine();
                Bank bankk=new Bank(q);
                addBank(bankk);
                break;
            case 2:
                bankdisplay();
            case 3:
                System.out.println("search the bank you want to add branch in");
                String n=scan.nextLine();
              int s=  searchbank(n);
               String st=scan.nextLine();
               branch branchs=new branch(st);
                banks.get(s).addBranch(branchs);
            case 4:
                System.out.println("search the bank you want to add branch in");
                String stp=scan.nextLine();
                int sst=  searchbank(stp);
                System.out.println("search the branch you want to add customer ");
                String ssp= scan.nextLine();
               int pp= banks.get(sst).search(ssp);
                System.out.println("enter the customer details");
                System.out.println("eneter customer name");
                String name=scan.nextLine();
                System.out.println("enter initial amount");
                int am= scan.nextInt();
                customer Customer=new customer(name,am);
                banks.get(sst).b













        }






    }
    public  void addBank(Bank bank) {


        banks.add(bank);

    }
    public void bankdisplay() {
        for (int i = 0; i <banks.size(); i++) {
            System.out.println((i + 1) + ".  " + banks.get(i).getBankname());


        }
    }
    public int searchbank(String name){
        for(int i=0;i<banks.size();i++){
            Bank bankss=banks.get(i);
            if(bankss.getBankname().equals(name)){
                return i;

            }


        }
        return -1;
    }

}
