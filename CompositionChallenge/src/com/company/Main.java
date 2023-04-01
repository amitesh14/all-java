package com.company;

public class Main {

    public static void main(String[] args) {
	room p= new room(2,4,new Objects(new table("wood",4),new tv("lg",30,20,"led")),1);
    p.getFurnitures().getTv().pressPowerButton();
    p.getFurnitures().draweropen();


    }
}
