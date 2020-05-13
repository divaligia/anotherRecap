package org.divaligia.WZut;

public class DemoKlasse {

    public static void main(String[] args) {

        Zutat[] nudeln = new Zutat[3];
        nudeln[0] = new Zutat("Teigwaren", 200);
        nudeln[1] = new Zutat("FavPesto", 50);
        nudeln[2] = new Zutat("Parmesan", 20);

        Rezept noodles = new Rezept("Nudeln",1, nudeln);
        noodles.printRezept();
        System.out.println();

        noodles.umrechnen(4);
        noodles.printRezept();
        System.out.println(noodles.gesamtGewicht());
        System.out.println("noodles.gesamtGewicht() = " + noodles.gesamtGewicht());
    }

}
