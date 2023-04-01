package com.company;

public class bedroom {
    private dimension dimension;
    private furniture furniture;
    private doors doors;
    private windows windows;

    public bedroom(com.company.dimension dimension, com.company.furniture furniture, com.company.doors doors, com.company.windows windows) {
        this.dimension = dimension;
        this.furniture = furniture;
        this.doors = doors;
        this.windows = windows;
    }
    public void ispacked(boolean p){
        doors.closed(p);
    }
}
class doors{
    private dimension dimension;
    private int number;

    public doors(com.company.dimension dimension, int number) {
        this.dimension = dimension;
        this.number = number;
    }
    public void closed(boolean p){
        if(p){
            System.out.println("doors are closed");
        }
        else
            System.out.println("doors are open");
    }
}
class windows{
    private dimension dimension;
    private int number;

    public windows(com.company.dimension dimension, int number) {
        this.dimension = dimension;
        this.number = number;
    }

}
