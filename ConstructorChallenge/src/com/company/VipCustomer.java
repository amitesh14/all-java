package com.company;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer(){
        this("Default name", 0.00,"Default email");
        System.out.println("Empty called");
        System.out.println(getName());
        System.out.println(getEmail());
        System.out.println(getCreditLimit());


    }
    public VipCustomer(String name, double creditLimit, String email){
        this.name=name;
        this.creditLimit=creditLimit;
        this.email=email;
        System.out.println("1st class called");
    }
    public VipCustomer(double creditLimit, String email){
        this.name="default name";
        this.creditLimit=creditLimit;
        this.email=email;

    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public double getCreditLimit(){
        return creditLimit;
    }
}
