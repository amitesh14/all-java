package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        options();
        int p;
        mobilePhone mobile =new mobilePhone(888776);
        do{
            System.out.println("enter your choice");
            p= scan.nextInt();
            scan.nextLine();
            switch (p){
                case 1:
                    options();
                    break;
                case 2:
                    System.out.println("enter the name to be added");
                    String name=scan.nextLine();
                    System.out.println("enter the mobile number");
                    int number= scan.nextInt();
                     mobile.addcontact(new Contacts(name,number));
                    break;
                case 3:
                    System.out.println("enter the name of contact to be removed");
                   // scan.nextLine();
                    name=scan.nextLine();
                   mobile.removeContact(new Contacts(name,0000));
                    break;
                case 4:
                    System.out.println("enter the item to be modified");
                    name=scan.nextLine();
                    System.out.println("enter the name to be added");
                    String item1=scan.nextLine();
                    System.out.println("enter the number to be added");
                    int num=scan.nextInt();

                    mobile.updateContact(new Contacts(name,0000),new Contacts(item1,num));
                    break;

                case 5:
                    System.out.println("enter the item ");
                    name=scan.nextLine();
                    mobile.findcontact(name);
                    break;
                case 6:

                    mobile.printContact();
                    break;



            }

        }while(p!=7);

    }
    public static void options(){
        System.out.println("press 1 to print the options \n press 2 to add contact\n" +
                "press 3 to remove contact\n press 4 to modify contact\n" +
                "press 5 to search contact\n press 6 to print contact \n press 7 to exit");
    }
}
