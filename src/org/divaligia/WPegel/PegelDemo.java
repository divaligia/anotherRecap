package org.divaligia.WPegel;

public class PegelDemo {

    public static void main(String[] args) {


        WasserstandManager w1 = new WasserstandManager();
        w1.add(new Wasserstand(1, "Mur", 2.05, 3.0, 1500));
        w1.add(new Wasserstand(1, "Mur", 1.05, 3.0, 6000));
        w1.add(new Wasserstand(1, "Mur", 2.5, 3.0, 80000));
        w1.add(new Wasserstand(1, "Mur", 1.8, 3.0, 10));
        w1.add(new Wasserstand(2, "Inn", 3.05, 3.0, 1500));
        w1.add(new Wasserstand(3, "Donau", 5.05, 5.0, 1500));
        w1.add(new Wasserstand(4, "Ybbs", 2.05, 3.0, 1500));
        w1.add(new Wasserstand(2, "Mur", 2.05, 3.0, 1500));
        w1.add(new Wasserstand(3, "Donau", 4.05, 3.0, 1500));

        System.out.println("w1.calcMittlererWasserstand() = " + w1.calcMittlererWasserstand());
        System.out.println("w1.findById(4) = " + w1.findById(4));
        System.out.println("w1.findForAlarmierung() = " + w1.findForAlarmierung());
        System.out.println("w1.findAllByGewaesser(\"Donau\") = " + w1.findAllByGewaesser("Donau"));
        System.out.println("w1.findLastWasserstand(\"Mur\") = " + w1.findLastWasserstand("Mur"));

        System.out.println(w1.getSummeByGewaesser());

    }
}
