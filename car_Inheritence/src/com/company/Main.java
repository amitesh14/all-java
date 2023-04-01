package com.company;

public class Main {

    public static void main(String[] args) {
	vehicle v=new vehicle("car",4,6,1);
    lambo l=new lambo("lamborginin",4,5,"automatic","petrol",4,true,"climate detector");

    l.changeDirection(30);
    l.changeDirection(21);
    l.move(23,23);
    l.move(34,23);


    }
}
class vehicle{
    private String name;

    private int wheel;
    private int gear;
    private int engine;
    private int currentspeed=0;
    private int currenrtDirection=0;


    public vehicle(String name, int wheel, int gear, int engine) {
        this.name = name;
        this.wheel = wheel;
        this.gear = gear;
        this.engine = engine;

    }

    public String getName() {
        return name;
    }

    public int getWheel() {
        return wheel;
    }

    public int getGear() {
        return gear;
    }

    public int getEngine() {
        return engine;
    }
    public int changeDirection(int direction){
        currenrtDirection+=direction;
        System.out.println("vehicle is moving at "+ currenrtDirection+" degrees");
        return currenrtDirection;
    }


    public void move(int s,int direction){
currenrtDirection+=direction;
        System.out.println("vehicle is moving at speed "+s+" in direction "+currenrtDirection  +" degrees");

    }

}
class car extends vehicle{
    private String type;
    private String power_type;
    private int seats;
    private boolean sunroof;
    private int p=0;
    private int s=0;

    public car(String name, int gear, int engine, String type, String power_type, int seats, boolean sunroof) {
        super(name, 4, gear, engine);
        this.type = type;
        this.power_type = power_type;
        this.seats = seats;
        this.sunroof = sunroof;
    }

    public String getType() {
        return type;
    }

    public String getPower_type() {
        return power_type;
    }

    public int getSeats() {
        return seats;
    }

    public boolean isSunroof() {
        return sunroof;
    }



    @Override
    public void move(int rate, int direction) {
        s+=rate;
         p+= direction;
        if(s>=0&&s<=20){
            System.out.println(getName()+" is moving at speed "+s+" in the direction "+p+" at gear 1");
        }
       else if(s>=20&&s<=50){
            System.out.println(getName()+" car is moving at speed "+s+" in the direction "+p+" at gear 2");
        }
       else if(s>=50&&s<=80){
            System.out.println(getName()+" car is moving at speed "+s+" in the direction "+p+" at gear 3");
        }
        else if(s>=80&&s<=110){
            System.out.println(getName()+" car is moving at speed "+s+" in the direction "+p+" at gear 4");
        }


    }
}
class lambo extends car{
    private String specialFeature;

    public lambo(String name, int gear, int engine, String type, String power_type, int seats, boolean sunroof, String specialFeature) {
        super(name, gear, engine, type, power_type, seats, sunroof);
        this.specialFeature = specialFeature;
    }

    public String getSpecialFeature() {
        return specialFeature;
    }


}
