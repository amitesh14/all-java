package com.company;

import java.util.StringTokenizer;

public class tv {
    private String manufacturer;
    private int length;
    private int breath;
    private String type;


    public void pressPowerButton() {
        System.out.println("tv is on");
        System.out.println("WELCOME");
    }


    public String getManufacturer() {
        return manufacturer;
    }

    public int getLength() {
        return length;
    }

    public int getBreath() {
        return breath;
    }

    public String getType() {
        return type;
    }

    public tv(String manufacturer, int length, int breath, String type) {
        this.manufacturer = manufacturer;
        this.length = length;
        this.breath = breath;
        this.type = type;
    }

}