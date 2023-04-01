package com.company;

import static com.company.Scanne.scan;

public class Base_hamburger extends Hamburger{
    public Base_hamburger(String bread_roll, String meat) {
        super(bread_roll, meat, 60);
    }

    @Override
    public void extra_item() {
        setSt(4);

        super.extra_item();
    }
}
