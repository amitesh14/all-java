package com.company;

public class Main {

    public static void main(String[] args) {
        Car porshe=new Car();// we have to specify new car else it will show it has  not been initialised
        porshe.model("Carrera");
        System.out.println("MOdel is "+porshe.getModel());
    }
}
