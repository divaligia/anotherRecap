package org.divaligia.WTiere;

public class Lion extends Animal {

    public Lion(String color, int countEyes) {
        super(color, countEyes);
    }

    @Override
    public void walk() {
        System.out.println("Lion walks");
    }

    @Override
    public void makeNoise() {
        System.out.println("Lion roars");
    }

    public void roar(){
        System.out.println("Lion roars roars");
    }
}
