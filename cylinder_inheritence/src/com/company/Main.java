package com.company;

import java.util.Scanner;


public class Main {
    static  Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter the radius");
        double r=scanner.nextDouble();
        System.out.println("enter the height");
        double h=scanner.nextDouble();

        volume volume=new volume(r,h,3.14);
        volume.calculate_volume();
        surfaceArea s=new surfaceArea(r,h,3.14);
        s.calculate_surfcearea();

    }
}
class volume{
    private double radius;
    private double height;
    private double pi;

    public volume(double radius, double height, double pi) {
        this.radius = radius;
        this.height = height;
        this.pi = pi;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }
    public double getPi(){
        return this.pi;
    }
    public void calculate_volume(){
        double v=pi*radius*radius*height;
        System.out.println("the volume of cylinder of radius "+getRadius()+" and height "+getHeight()+" is "+v);
    }
}
class surfaceArea extends volume{
    public surfaceArea(double radius, double height, double pi) {
        super(radius, height, pi);
    }
    public void calculate_surfcearea(){
        double v=2*getPi()*(getRadius()+getHeight());
        System.out.println("the surface area of cylinder of radius "+getRadius()+" and height "+getHeight()+" is "+v);
    }
}
