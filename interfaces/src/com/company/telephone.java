package com.company;

public class telephone implements Itelephone{
    private int number;

    public telephone(int number) {
        this.number = number;
    }

    @Override
    public void powerOn() {

    }

    @Override
    public boolean isRinging(int no) {

        if(no==number){
            return true;
        }
        return false;
    }

    @Override
    public void dial(int phone) {
        System.out.println("dialing "+phone);
    }
}
