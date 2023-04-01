package com.company;

public class Dog extends Animal {
    private int teeth;
    private int legs;
    private String type;
    private int eyes;
    private String coat;

    public Dog(String name, int brain, int body, int size, int weight,int teeth,int legs,int eyes,String type, String coat) {
        super(name, brain, body, size, weight);
        this.coat=coat;
        this.legs=legs;
        this.eyes=eyes;
        this.teeth=teeth;
        this.type=type;
    }
    private void chew(){
        System.out.println("chew is called");
    }


    @Override
    public void eat() {
        chew();
        super.eat();
    }
    public void walk(){
        System.out.println("walk is called");
        move(5);


    }

  public void run(){
      System.out.println("run is called");
      move(10);
  }
}
