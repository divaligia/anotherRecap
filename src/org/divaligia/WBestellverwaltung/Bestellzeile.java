package org.divaligia.WBestellverwaltung;

public class Bestellzeile {

    private String name;
    private int menge;
    private String produktkategorie;
    private double preis;

    public Bestellzeile(String name, int menge, String produktkategorie, double preis) {
        this.name = name;
        this.menge = menge;
        this.produktkategorie = produktkategorie;
        this.preis = preis;
    }

    public String getName() {
        return name;
    }

    public int getMenge() {
        return menge;
    }

    public String getProduktkategorie() {
        return produktkategorie;
    }

    public double getPreis() {
        return preis;
    }

    public double getKosten(){
        double sum = 0.0;
        sum = menge * preis;
        return sum;
    }

    @Override
    public String toString() {
        return "Bestellzeile{" +
                "name='" + name + '\'' +
                ", menge=" + menge +
                ", produktkategorie='" + produktkategorie + '\'' +
                ", preis=" + preis +
                '}';
    }
}
