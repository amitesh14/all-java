package com.company;

public class Main {

    public static void main(String[] args) {

        Case theCase=new Case(new dimension(15,12,3),7,"grey","Dell","plastic",new camera("sony",12,true)

                ,new speaker("harmercarden",4),new battery(2,120,34,false));
        Screen screen=new Screen(new dimension(15,12,2),new resolution(2104,1980),"Dell","Amoled");
        motherboard Motherboard=new motherboard("Dell",16,"ryzen 7",1024,8,8);
        Laptop laptop=new Laptop(theCase,screen,Motherboard,"DEll",92000);
        laptop.getTheCase().buttonpressed();
        laptop.getTheMotherboard().on();
        laptop.getScreen().drawsymbol(100,12);
        boolean p;
        laptop.powerup();

    }
}
