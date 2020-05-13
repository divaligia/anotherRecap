package org.divaligia.WKindergarten;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kindergarten {

    private String klasse;                                        // Klasse ≙ dem Namen der Kindergartenklasse
    private ArrayList<Kind> kinder;


    public Kindergarten(String klasse){
        this.klasse = klasse;
        this.kinder = new ArrayList<>();
    }

    public String getKlasse() {
        return klasse;
    }

    public ArrayList<Kind> getKinder() {
        return kinder;
    }

    public void addKind(Kind k){
        kinder.add(k);
    }


    public void sortAlphabetical() {
        Collections.sort(kinder, new AlphabeticalComparator());
    }

    public void sortAge(){
        Collections.sort(kinder, new AgeComparator());
    }

}
