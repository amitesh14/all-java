package com.company;


class car{
    private int wheel;
    private int cylinder;
    private String engineType;
    private boolean engine;

    public car(int cylinder, String engineType) {
        this.cylinder = cylinder;
        this.engineType = engineType;
        this.engine=true;
        this.wheel=4;
    }


    public int getCylinder() {
        return cylinder;
    }

    public String getEngineType() {
        return engineType;
    }
    public String startEngine(){
        return getClass().getSimpleName()+ " engine has started";
    }
   public String brake(){
        return "brake has been applied";
   }
    public String accelerate(){
        return getClass().getSimpleName()+" accelerates";
    }
}
class audi extends car{
    public audi(int cylinder, String engineType) {
        super(cylinder, engineType);
    }
}
class bugati extends car{
    public bugati(int cylinder, String engineType) {
        super(cylinder, engineType);
    }
}

public class Main {

    public static void main(String[] args) {
        audi Audi= new audi(6,"electric");
        System.out.println(audi.class.getSimpleName()+" has "+ Audi.getCylinder()+"cylinders");
        System.out.println( Audi.accelerate());

        bugati Bugati= new bugati(8,"disel");
        System.out.println(Bugati.getCylinder());
        System.out.println(Bugati.accelerate());

        car Car =new car(5,"petrol");
        System.out.println(Car.accelerate());

    }
}
