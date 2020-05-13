package org.divaligia.WTiere;

public class Cat extends Animal{

    public Cat(String color, int countEyes) {
        super(color, countEyes);
    }

    @Override
    public void walk() {
        System.out.println("Cat walks on catwalk");
    }

    @Override
    public void makeNoise() {
        System.out.println("Cat meows");
    }
}
