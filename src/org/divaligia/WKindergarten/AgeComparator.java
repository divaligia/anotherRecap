package org.divaligia.WKindergarten;

import java.util.Comparator;

public class AgeComparator implements Comparator<Kind> {
    @Override
    public int compare(Kind k1, Kind k2) {
        // Variante 1 mit if Abfrage
        if (k1.getAlter() < k2.getAlter()) {
            return -1;
        }
        if (k1.getAlter() > k2.getAlter()){
            return 1;
    } return 0;
       // Variante 2 ueber statische Methode in Wrapper Klasse
       // return Integer.compare(k1.getAlter(), k2.getAlter());
       // Variante 3 verwendet compareto von Wrapper Klasse
       // return ((Integer)k1.getAlter()).compareTo(k2.getAlter());
    }
}
