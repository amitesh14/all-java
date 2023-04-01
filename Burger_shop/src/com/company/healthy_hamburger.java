package com.company;

import static com.company.Scanne.scan;

public class healthy_hamburger extends Hamburger{
    public healthy_hamburger( String meat) {
        super("brown", meat, 70);
    }

    @Override
    public void extra_item() {
       setSt(6);
        super.extra_item();
    }
}
