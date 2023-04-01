package com.company;

public class audi extends car{
    private int roadService;

    public audi( int roadService) {
        super("audi", "4WD", 4, 4, 6, false);
        this.roadService = roadService;
    }
    public void accelerate(int rate){
        int newVelocity=((getCurrentVelocity())+rate);
        if (newVelocity == 0) {
            stop();
            setCurrentGear(1);
        }else if(newVelocity>0 && newVelocity<=30){
            setCurrentGear(1);
        }
        else if(newVelocity>30 && newVelocity<=50){
            setCurrentGear(2);
        }
        else if(newVelocity>50 && newVelocity<=70){
            setCurrentGear(3);
        }
        else if(newVelocity>70 && newVelocity<=100){
            setCurrentGear(4);
        }
        else if(newVelocity>100 && newVelocity<=120){
            setCurrentGear(5);
        }
        else {
            setCurrentGear(6);
        }
        if (newVelocity>0){
            changespeed(newVelocity, getCurrentDirection());
        }

    }

}
