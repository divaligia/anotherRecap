package org.divaligia.WLand;

import java.util.ArrayList;

public class Bundesstaat extends Land {
    private ArrayList<Land> laender;

    public Bundesstaat() {
        laender = new ArrayList<>();
    }

    public void addLand(Land l) {
        laender.add(l);
    }

    @Override
    public double getBruttosozialProdukt() {
        double sum = 0;
        for (Land l : laender) {
            sum += l.getBruttosozialProdukt();
        } return sum;
    }
}
