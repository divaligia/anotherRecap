package org.divaligia.WTiere;

import java.util.ArrayList;

public class Nature {
    private ArrayList<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal a){
        animals.add(a);
    }

    public int countColor(String color){
        int counter = 0;
        for(Animal a : animals){
            if(a.color.equals(color)){
                ++ counter;
            }
        } return counter;
    }




    @Override
    public String toString() {
        return "Nature{" +
                "animals=" + animals +
                '}';
    }
}
