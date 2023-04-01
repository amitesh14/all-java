package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        options();
        int p;
        Grocery_list grocery_list=new Grocery_list();


        do{
            System.out.println("enter your choice");
            p= scan.nextInt();
            scan.nextLine();
            switch (p){
                case 1:
                    options();
                    break;
                case 2:
                    System.out.println("enter the item ");

                    String item=scan.nextLine();
                    grocery_list.additem(item);
                    break;
                case 3:
                    System.out.println("enter the item to be removed");
                    item=scan.nextLine();
                     grocery_list.removeItem(item);
                     break;
                case 4:
                    System.out.println("enter the item to be modified");
                    item=scan.nextLine();
                    System.out.println("enter the item to be added");
                    String item1=scan.nextLine();
                    grocery_list.modifyItem(item,item1);
                    break;

                case 5:
                     System.out.println("enter the item ");
                     item=scan.nextLine();
                     grocery_list.search(item);
                     break;
                case 6:

                    grocery_list.print();
                    break;



            }

        }while(p!=7);

    }
    public static void options(){
        System.out.println("press 1 to print the options \n press 2 to add the item\n" +
                "press 3 to remove the item\n press 4 to modify the item\n" +
                "press 5 to search the item\n press 6 to print \n press 7 to exit");
    }
}
