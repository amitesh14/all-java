package com.company;

import static com.company.Scanne.scan;


public class Hamburger {
    private int st;
    private String bread_roll;
    private String meat;
    private int base_price;

    public Hamburger(String bread_roll, String meat, int base_price) {
        this.bread_roll = bread_roll;
        this.meat = meat;
        this.base_price = base_price;
    }

    public String getBread_roll() {
        return bread_roll;
    }

    public String getMeat() {
        return meat;
    }

    public int getSt() {
        return st;
    }

    public void setSt(int st) {
        this.st = st;
    }

    public int getBase_price() {
        return base_price;
    }
    public void extra_item(){
        System.out.println("base price is "+getBase_price());
        int t=getSt();
        if(t==0){
            System.out.println("no extra items can be added" +
                    "\nyou get additional drink of 50  and chips of 30");

        }
        else {
            System.out.println("enter number of extra items you want to add(max " + getSt() + ")");
            int i = scan.nextInt();


            if (i >= 0 && i <= getSt()) {
                int d = getBase_price();
                for (int p = 1; p <= i; p++) {
                    System.out.println("press 1 to add carrot->10\n" +
                            "press 2 to add lettuce->15\n" +
                            "press 3 to add tomato->13\n" +
                            "press 4 to add mayonese->18\n" +
                            "press 5 to add chese->25\n" +
                            "press 6 to add onion->12");
                    int s = scan.nextInt();
                    switch (s) {
                        case 1:
                            System.out.println("carrot is added");
                            d += 10;
                            break;
                        case 2:
                            System.out.println("lettuce is added");
                            d += 15;
                            break;
                        case 3:
                            System.out.println("tomato is added");
                            d += 13;
                            break;
                        case 4:
                            System.out.println("mayonese is added");
                            d += 18;
                            break;
                        case 5:
                            System.out.println("cheese is added");
                            d += 25;
                            break;
                        case 6:
                            System.out.println("onion is added");
                            d += 12;
                            break;


                    }
                    System.out.println("do you want to know your total price?" +
                            "\n press 1 to know the price press 2 to continue adding or press 0 to exit");
                    int ch = scan.nextInt();
                    if (ch == 1) {
                        System.out.println("your total is " + d);
                        System.out.println("do you want to continue adding?\n" +
                                "press 1 to add press 0 to exit");
                        ch= scan.nextInt();
                        if(ch==0)
                            break;

                    }
                    else if(ch==0){
                        break;
                    }
                }
                int total_price = d;
                System.out.println("your total price is " + total_price+"\n\n\n");
            } else {
                System.out.println("-1");
            }
        }
}}
