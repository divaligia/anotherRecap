package org.divaligia.WZut;

public class Rezept {

    public String name;
    public int personen;
    public Zutat[] zutaten;


    public Rezept(String name, int personen, Zutat[] zutaten) {
        this.name = name;
        this.personen = personen;
        this.zutaten = zutaten;
    }

    public void printRezept(){
        System.out.println(name + " für " + personen + " Personen");
        for (Zutat e : zutaten){
            e.print();
        }
    }
    public void umrechnen(int neueAnzahlPersonen){         // für jedes Element in Objekt org.divaligia.wdh.Zutat im Array zutaten
        for(Zutat e : zutaten){                            // rufe Element Menge auf und berechne neu
           e.menge = e.menge/personen * neueAnzahlPersonen;
        } personen = neueAnzahlPersonen;
    }

    public double gesamtGewicht(){
       double gesamtGewicht = 0;
        for(Zutat e : zutaten){                       // wieder wird jedes Element des Objekts org.divaligia.wdh.Zutat im Array zutaten
            gesamtGewicht += e.menge;                 // aufgerufen um vom jeweiligen element die menge zur gesamtMenge
        } return gesamtGewicht;                       // hinzuzurechnen
    }
}
