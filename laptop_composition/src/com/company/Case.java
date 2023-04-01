package com.company;

public class Case {
    private dimension theDimension;
    private int slots;
    private String color;
    private String manufacturer;
    private String material;
    private camera Camera;
    private speaker Speaker;
    private battery Battery;

    public Case(dimension theDimension, int slots, String color, String manufacturer, String material,camera Camera,speaker Speaker,battery Battery) {
        this.theDimension = theDimension;
        this.slots = slots;
        this.color = color;
        this.manufacturer = manufacturer;
        this.material = material;
        this.Camera=Camera;
        this.Speaker=Speaker;
        this.Battery=Battery;

    }

    public dimension getTheDimension() {
        return theDimension;
    }

    public int getSlots() {
        return slots;
    }

    public String getColor() {
        return color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getMaterial() {
        return material;
    }

    public camera getCamera() {
        return Camera;
    }

    public speaker getSpeaker() {
        return Speaker;
    }

    public battery getBattery() {
        return Battery;
    }
    public boolean buttonpressed(){
        System.out.println("button is pressed");
        return true;
    }
}
class dimension{
    private int length;
    private int width;
    private int height;

    public dimension(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
