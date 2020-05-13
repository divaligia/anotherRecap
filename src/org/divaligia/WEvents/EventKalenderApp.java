package org.divaligia.WEvents;

import org.divaligia.WEvents.Event;
import org.divaligia.WEvents.EventKalender;

public class EventKalenderApp {

    public static void main(String[] args) {

        EventKalender kalender = new EventKalender();
        kalender.add(new Event("current value", "Graz", 30.0));
        kalender.add(new Event("Phace", "Graz", 40.0));
        kalender.add(new Event("current value", "Linz", 29.0));
        kalender.add(new Event("Krautrock", "Wien", 100));
        kalender.add(new Event("Krautrock", "Graz", 98));

        System.out.println("kalender.getAVGByOrt(\"Graz\") = " + kalender.getAVGByOrt("Graz"));
        System.out.println("kalender.getByTixPrice() = " + kalender.getByTixPrice(99, 101));
        System.out.println("kalender.getByOrt(\"Graz\") = " + kalender.getByOrt("Graz"));
        System.out.println("kalender.getByTitle(\"Krautrock\") = " + kalender.getByTitle("Krautrock"));

        System.out.println(kalender.getCountEventsByOrt());


    }


}
