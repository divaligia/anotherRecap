package org.divaligia.WZut;

public class Zutat {

    public String name;
    public double menge;

    public Zutat(String name, double menge) {
        this.name = name;
        this.menge = menge;
    }

    public void print(){
        System.out.print(name + "\t");
        System.out.println(menge );
    }
}
