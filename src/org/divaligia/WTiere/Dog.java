package org.divaligia.WTiere;

public class Dog extends Animal {

    public Dog(String color, int countEyes) {
        super(color, countEyes);
    }

    @Override
    public void makeNoise() {
        System.out.println("Dog barks");
    }

    @Override
    public void walk() {
        System.out.println("Dog walks");
    }

}
