package org.divaligia.WLand;

public class Bundesland extends Land {
    private double bruttoSozialProdukt;

    public Bundesland(double bruttoSozialProdukt) {
        this.bruttoSozialProdukt = bruttoSozialProdukt;
    }

    @Override
    public double getBruttosozialProdukt() {
        return bruttoSozialProdukt;                        // nicht als return als super, weil sonst 0 rauskommt
    }                                                      // mit übergebenem Wert überschreiben!
}
