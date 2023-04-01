package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class branch {
    private static Scanner scan=new Scanner(System.in);
      private String branch_name;

    ArrayList<customer> newcustomer= new ArrayList<>();

    public branch(String branch_name) {
        this.branch_name = branch_name;
        this.newcustomer=new ArrayList<customer>();
    }

    public String getBranch_name() {
        return branch_name;
    }

    public void addnewcustomer(customer cc){

    String p;
    int a;
    System.out.println("eneter the name");
    p=scan.nextLine();
    System.out.println("entre the amount");
    a= scan.nextInt();
     cc=new customer(p,a);
    newcustomer.add(cc);


}
public void cuatomerdisplay(){
    for(int i=0;i<newcustomer.size();i++)
    {
        System.out.println((i+1)+".  "+newcustomer.get(i).getCustomer_name()+",and has balance"+newcustomer.get(i).getAmount());



    }






}
public void displaytransaction(){
    System.out.println("enter the customer name");
    String s=scan.nextLine();
    int p=search(s);
    if(p>=0){
        newcustomer.get(p).displaytransactions();


    }
    else {
        System.out.println("contact doesnot exists");
    }




}
public int search(String name){
    for(int i=0;i<newcustomer.size();i++){
        customer cust=newcustomer.get(i);
        if(cust.getCustomer_name().equals(name)){
            return i;

        }


        }
    return -1;
    }



}



