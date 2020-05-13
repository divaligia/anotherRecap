package org.divaligia.WKonto;

public class KontoDemo {
    public static void main(String[] args) {

        GiroKonto g = new GiroKonto("Amon Schlucker", 1000);

        //g.einzahlen(4000);
        g.auszahlen(1200);
        System.out.println(g.getKontostand());

        JugendGiroKonto j = new JugendGiroKonto("Hans Maulwurf", 200, 400);
        j.auszahlen(450);
        System.out.println(j.getKontostand());

        SparKonto s = new SparKonto("Hans Maulwurf");
        s.einzahlen(20);
        System.out.println(s.auszahlen(30));          // !! Um den ausgezahlten Betrag zu sehen muss
        System.out.println(s.getKontostand());              // man ihn auch mit sout aufrufen!



    }
}
