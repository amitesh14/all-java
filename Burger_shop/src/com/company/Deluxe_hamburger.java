package com.company;

import static com.company.Scanne.scan;

public class Deluxe_hamburger extends Hamburger{
    public Deluxe_hamburger(String bread_roll, String meat) {
        super(bread_roll, meat, 70);
    }

    @Override
    public void extra_item() {
        setSt(0);



        super.extra_item();
        int tp=getBase_price();
        int total=tp+30+50;
        System.out.println("your total price is " + total+"\n\n\n");
    }
}
