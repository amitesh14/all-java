package com.company;

class BaseHamburger {
    private String BreadRollType;
    private String MeatType;
    private int BasePrice;
    private String item1Name;
    private double item1Price;
    private String item2Name;
    private double item2Price;
    private String item3Name;
    private double item3Price;
    private String item4Name;
    private double item4Price;
    public BaseHamburger(String breadRollType, String meatType, int basePrice) {
        BreadRollType = breadRollType;
        MeatType = meatType;
        BasePrice = basePrice;
    }
    public void Item1(String name, double price){
        this.item1Name=name;
        this.item1Price=price;
    }
    public void Item2(String name, double price){
        this.item2Name=name;
        this.item2Price=price;
    }
    public void Item3(String name, double price){
        this.item3Name=name;
        this.item3Price=price;
    }
    public void Item4(String name, double price){
        this.item4Name=name;
        this.item4Price=price;
    }
    public double itemisingBurger(){
        double Hamburgerprice= this.BasePrice;
        System.out.println("the hamburger is on "+ BreadRollType +" bread "+ " with "+MeatType+" having a base price of "+ BasePrice);

        if(item1Name!= null){
            Hamburgerprice +=item1Price;
            System.out.println("item added "+ item1Name+" for extra of "+item1Price);

        }
        if(item2Name!= null){
            Hamburgerprice +=item2Price;
            System.out.println("item added "+ item2Name+" for extra of "+item2Price);

        }
        if(item3Name!= null){
            Hamburgerprice +=item3Price;
            System.out.println("item added "+ item3Name+" for extra of "+item3Price);

        }
        if(item4Name!= null){
            Hamburgerprice +=item4Price;
            System.out.println("item added "+ item4Name+" for extra of "+item4Price);

        }

      return Hamburgerprice;
    }
}



public class Main {

    public static void main(String[] args) {
	BaseHamburger baseHamburger=new BaseHamburger("brown","bacon",80);
       baseHamburger.Item1("carrot",13);
       baseHamburger.Item2("lettuce",15);
        System.out.println("total price "+ baseHamburger.itemisingBurger());
}
}

