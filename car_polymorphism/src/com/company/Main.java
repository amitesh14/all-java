package com.company;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
        for (int i=1;i<11;i++){
            car Car=randomnumbergenerator();
            System.out.println("car # "+i+" \n name is "+Car.getName()+" it has wheels "+Car.getWheel()+"has engine"+Car.getEngine());
            Car.engine_Start();

            Car.accelerate();

            Car.brake();
            System.out.println("\n");




        }





    }
    public static car randomnumbergenerator(){
        int random_number=(int)(Math.random()*4)+1;
        switch (random_number){
            case 1:
                return new lambo();

            case 2:
                return new audi();

            case 3:
                return new ferrari();
             case 4:
                return new maruti();


        }
        return null;

    }
}
class car{
    private String name;
    private int cylinder;
    private int wheel;
    private boolean has_engine;
    private String engine;
    private String type;

    public car(String name, int cylinder, String engine, String type) {
        this.name = name;
        this.cylinder = cylinder;
        this.wheel = 4;
        this.has_engine = true;
        this.engine = engine;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getCylinder() {
        return cylinder;
    }

    public int getWheel() {
        return wheel;
    }

    public boolean isHas_engine() {
        return has_engine;
    }

    public String getEngine() {
        return engine;
    }

    public String getType() {
        return type;
    }

    public void engine_Start(){
        System.out.println("the engine has started");
    }

    public void accelerate(){
        System.out.println("car is accelerating");
    }
    public void brake (){
        System.out.println("brake is applied");
    }


}
class lambo extends car{
    public lambo() {
        super("lambo", 8, "V8", "automatic");
    }

    @Override
    public void engine_Start() {
        System.out.println("engine of "+getName()+" has started");
    }

    @Override
    public void accelerate() {
        System.out.println("lambo is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("lambo brake is applied");
    }
}
class audi extends car{
    public audi() {
        super("Audi", 6, "twin air", "manual");
    }

    @Override
    public void accelerate() {
        System.out.println("audi is accelerating");
    }
}
class ferrari extends car{
    public ferrari() {
        super("ferrari", 8, "v8", "semi automatic");
    }

    @Override
    public void accelerate() {
        System.out.println("ferrari is accelerating");
    }
}
class maruti extends car{
    public maruti() {
        super("maruti", 4, "petrol", "manual");
    }

    @Override
    public void accelerate() {
        System.out.println("maruti is accelerating");
    }
}
