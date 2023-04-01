package com.company;

public class Screen {
    private dimension the_dimension;
    private resolution the_resolution;
    private String Manufacturer;
    private String type;

    public Screen(dimension the_dimension, resolution the_resolution, String manufacturer, String type) {
        this.the_dimension = the_dimension;
        this.the_resolution = the_resolution;
        Manufacturer = manufacturer;
        this.type = type;
    }

    public dimension getThe_dimension() {
        return the_dimension;
    }

    public resolution getThe_resolution() {
        return the_resolution;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public String getType() {
        return type;
    }
    public void drawsymbol(int x,int y){
        System.out.println("symbol is drawn at "+x+","+y+" pixel");
    }
}
class resolution{
    private int height;
    private int breath;

    public resolution(int height, int breath) {
        this.height = height;
        this.breath = breath;
    }

    public int getHeight() {
        return height;
    }

    public int getBreath() {
        return breath;
    }

}
