package com.company;

public class Fish extends Animal{
    private int fins;
    private int gills;
    private int backfin;

    public Fish(String name, int brain, int body, int size, int weight, int fins, int gills, int backfin) {
        super(name, brain, body, size, weight);
        this.fins = fins;
        this.gills = gills;
        this.backfin = backfin;
    }
    private void moveBackfin(){
        System.out.println("fish.move backfin called");

    }
    private void moveMuscle(){


    }
    public void  swim(int speed){
        System.out.println("Fish.swim is called");
        moveBackfin();
        moveMuscle();
       super. move(10);
    }
}
