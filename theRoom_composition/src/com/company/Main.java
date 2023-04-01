package com.company;

public class Main {

    public static void main(String[] args) {
furniture thefurniture=new furniture(new Bed(new dimension(30,25,10),"wood","mango","sleepwell")
        ,new Table(new dimension(15,10,20),"wood","mango",new Laptop("Dell",new dimension(5,4,1)))
        ,new Sofa(new dimension(20,15,8),"wood","mango")
        ,new Chair(new dimension(5,4,8),"plastic", "mango"));
thefurniture.getTable().getLaptop().poweron();
        bedroom r=new bedroom(new dimension(100,80,5),thefurniture,new doors(new dimension(30,15,5),2)
        ,new windows(new dimension(10,6,3),7));
      r.ispacked(true);

    }
}
