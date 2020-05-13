package org.divaligia.WBestellverwaltung;

public class BestellungDemo {
    public static void main(String[] args) {


       // Bestellung b = new Bestellung(Bestellzeile x = new Bestellzeile("lala", 1, "musik", 2));
        Bestellzeile bz1 = new Bestellzeile("lala", 1, "haushalt", 12);

        Bestellung shop = new Bestellung("A-123");
        shop.addBestellzeile(bz1);
        shop.addBestellzeile(new Bestellzeile("lulu",5,"haushalt",13));

        shop.printBestellung();
        System.out.println(shop.getKosetn());
        System.out.println(shop.getAnzahlJeProduktkategorie());


    }
}
