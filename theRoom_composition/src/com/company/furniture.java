package com.company;

public class furniture {
    private Bed bed;
    private Table table;
    private Sofa sofa;
    private Chair chair;

    public furniture(Bed bed, Table table, Sofa sofa, Chair chair) {
        this.bed = bed;
        this.table = table;
        this.sofa = sofa;
        this.chair = chair;
    }




    public Bed getBed() {
        return bed;
    }

    public Table getTable() {
        return table;
    }

    public Sofa getSofa() {
        return sofa;
    }

    public Chair getChair() {
        return chair;
    }
}
class dimension{
    private int length;
    private int breadth;
    private int height;

    public dimension(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public int getHeight() {
        return height;
    }
}
class Bed{
    private dimension Dimenssion;
    private String material;
    private String manufacturer;
    private String materessManudacturer;

    public Bed(dimension dimenssion, String material, String manufacturer, String materessManudacturer) {
        Dimenssion = dimenssion;
        this.material = material;
        this.manufacturer = manufacturer;
        this.materessManudacturer = materessManudacturer;
    }

    public dimension getDimenssion() {
        return Dimenssion;
    }

    public String getMaterial() {
        return material;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getMateressManudacturer() {
        return materessManudacturer;
    }
}
class Table{
    private dimension dimension;
    private String material;
    private String manufacturer;
    private Laptop laptop;

    public Table(dimension dimension, String material, String manufacturer,Laptop laptop) {
        this.dimension = dimension;
        this.material = material;
        this.manufacturer = manufacturer;
        this.laptop=laptop;}
    public void poweron(){
        laptop.poweron();
    }



    public com.company.dimension getDimension() {
        return dimension;
    }

    public String getMaterial() {
        return material;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Laptop getLaptop() {
        return laptop;
    }


}
class Sofa{
    private dimension Dimension;
    private String material;
    private String manufacturer;
    public Sofa(dimension dimension, String material, String manufacturer) {
        Dimension = dimension;
        this.material = material;
        this.manufacturer = manufacturer;
    }

    public dimension getDimension() {
        return Dimension;
    }

    public String getMaterial() {
        return material;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
class Chair{
    private dimension Dimension;
    private String material;
    private String manufacturer;
    public Chair(dimension dimension, String material, String manufacturer) {
        Dimension = dimension;
        this.material = material;
        this.manufacturer = manufacturer;
    }

    public dimension getDimension() {
        return Dimension;
    }

    public String getMaterial() {
        return material;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
class Laptop{
    private String manufacturer;
    private dimension dimension;

    public Laptop(String manufacturer, com.company.dimension dimension) {
        this.manufacturer = manufacturer;
        this.dimension = dimension;
    }
    public void poweron(){
        System.out.println("button is pressed . laptop is on");
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public com.company.dimension getDimension() {
        return dimension;
    }
}
