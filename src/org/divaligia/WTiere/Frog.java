package org.divaligia.WTiere;

public class Frog extends Animal {

    public Frog(String color, int countEyes) {
        super(color, countEyes);
    }

    @Override
    public void makeNoise() {
        System.out.println("Frog quaks");
    }

    @Override
    public void walk() {
        System.out.println("Frog jumps");
    }
}
