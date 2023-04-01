package com.company;

public class Main {

    public static void main(String[] args) {
        Dog dog= new Dog("dog",1,1,6,70,30,4,2,"labrador","silky hairy");
        dog.eat();
        dog.walk();
        dog.run();
        Fish fish= new Fish("Shark",1,1,30,80,4,6,1);
        fish.swim(10);
    }
}
