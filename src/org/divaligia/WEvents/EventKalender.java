package org.divaligia.WEvents;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EventKalender {

    ArrayList<Event> events = new ArrayList<>();   // AL die mit Objekten bzw deren Attribute befüllt wird

    public void add(Event e) {                   // Methode um AL zu füllen, dabei ruft man die methoden mit Punkt auf
        events.add(e);
    }

    public Event getByTitle(String title) {       // for each um durchzugehen, ob ein Event mit Titel der als
        for (Event e : events) {                  // Parameter übergeben wird, bereits angelegt wurde
            if (e.getTitle().equals(title))       // wenn kein Event mit dem Namen gespeichert ist --> return null
                return e;
        } return null;
    }

    public ArrayList<Event> getByOrt(String location) {   // for each um Events nach Ort zu suchen, Ort wird als Para
        ArrayList<Event> result = new ArrayList<>();      // übergeben und alle Events in der location werden in
        for (Event e : events) {                          // neuer AL angelegt, diese wird dann ausgegeben
            if (e.getLocation().equals(location))
                result.add(e);
        } return result;
    }

    public ArrayList<Event> getByTixPrice(double min, double max) {    // for each um weitere Liste zu erstellen
        ArrayList<Event> nachPreis = new ArrayList<>();                // hier um den min. und max. Betrag
        for (Event e : events) {                                       // des Eintrittpreises anzugeben und mit diesen
            if ((e.getTixPrice() > min) && e.getTixPrice() < max) {    // Grenzwerten ein Event zu finden & speichern
                nachPreis.add(e);                                      // wird auch als Liste ausgegeben
            }
        } return nachPreis;
    }

    public double getAVGByOrt(String location) {                // Liste wird erstellt, die Ursprungsliste wird mittels
        double sum = 0.0;                                       // getByOrt örtlich eingegrenzt, Ergebnisse wieder in
        ArrayList<Event> avgOrt = getByOrt(location);           // einer neue angelegten AL gespeichert, die Preise der
        for (Event e : avgOrt) {                                // Ergebnisse werden aufsummiert und schlussendlich nach
            sum += e.getTixPrice();                             // der Anzahl der gefundenen Events dividiert
        } return sum / avgOrt.size();                           // -> Durchschnittspreis anhand Ort wird ausgegeben
    }

    public HashMap<String, Integer> getCountEventsByOrt() {            // Hashmap erstellen um Liste mit Orten + Anzahl
        HashMap<String, Integer> countByOrt = new HashMap<>();         // der dort stattfindenden Veranstaltungen
        for (Event e : events) {                                       // auszugeben, zuerst durch Events iterieren
            if (countByOrt.containsKey(e.getLocation())) {             // dann abfragen, ob Ort (als Key in HM) schon
                Integer count = countByOrt.get(e.getLocation()) + 1;   // existiert, wenn ja, soll anzahl +1 gerechnet
                countByOrt.put(e.getLocation(), count);                // werden und neu in die HM eingefügt werden
            } else {                                                   // enthält die HM den Ort noch nicht, soll dieser
                countByOrt.put(e.getLocation(), 1);                    // hier mit Anzahl 1 in die HM hinzugefügt werden
            }
        } return countByOrt;
    }



}
