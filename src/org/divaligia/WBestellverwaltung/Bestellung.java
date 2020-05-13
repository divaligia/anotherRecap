package org.divaligia.WBestellverwaltung;

import java.util.ArrayList;
import java.util.HashMap;

public class Bestellung {
    private String nummer;
    private ArrayList<Bestellzeile> bestellzeilen = new ArrayList<>();

    public Bestellung(String nummer) {
        this.nummer = nummer;
    }

    public String getNummer() {
        return nummer;
    }

    public ArrayList<Bestellzeile> getBestellzeile() {
        return bestellzeilen;
    }

    public void addBestellzeile(Bestellzeile b){
        bestellzeilen.add(b);
    }

    public void printBestellung(){
        for(Bestellzeile b : bestellzeilen){
            System.out.println(b);
        }
    }

    public double getKosetn(){
        double sum = 0.0;
        for(Bestellzeile bz : bestellzeilen){
            sum += bz.getKosten();
        }return sum;
    }

    public HashMap<String, Integer> getAnzahlJeProduktkategorie(){
        HashMap<String, Integer> anzJeKat = new HashMap<>();
        int anzahl = 0;
        for(Bestellzeile bz : bestellzeilen){
            if(anzJeKat.containsKey(bz.getProduktkategorie())){
                anzahl += bz.getMenge();
                anzJeKat.put(bz.getProduktkategorie(),anzahl);
            } else if (!anzJeKat.containsKey(bz.getProduktkategorie())){
                anzahl = bz.getMenge();
                anzJeKat.put(bz.getProduktkategorie(), anzahl);
            }
        } return anzJeKat;

    }
}
