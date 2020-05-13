package org.divaligia.WTiere;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class AnimalDemo {
    public static void main(String[] args) {


        Frog quax = new Frog("blue", 2);
        Animal quaxiAsAnimal = (Animal) quax;
        Frog againQuaxi = (Frog) quaxiAsAnimal;

        quax.makeNoise();
        quaxiAsAnimal.makeNoise();
        againQuaxi.makeNoise();

        Nature outside = new Nature();
        outside.addAnimal(quax);
        outside.addAnimal(new Animal("blue", 4));
        outside.addAnimal(new Animal("blue", 1));
        System.out.println(outside.countColor("blue"));



    }
}
