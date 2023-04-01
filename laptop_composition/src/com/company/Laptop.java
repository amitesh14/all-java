package com.company;

public class Laptop {
    private Case theCase;
    private Screen screen;
    private motherboard theMotherboard;
    private String manufacturer;
    private int price;

    public Laptop(Case theCase, Screen screen, motherboard theMotherboard, String manufacturer, int price) {
        this.theCase = theCase;
        this.screen = screen;
        this.theMotherboard = theMotherboard;
        this.manufacturer = manufacturer;
        this.price = price;
    }
   public void powerup(){
        theCase.buttonpressed();
            screen.drawsymbol(1200,200);


    }
    public Case getTheCase() {
        return theCase;
    }

    public Screen getScreen() {
        return screen;
    }

    public motherboard getTheMotherboard() {
        return theMotherboard;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getPrice() {
        return price;
    }
}
