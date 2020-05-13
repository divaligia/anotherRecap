package org.divaligia.WLand;

public class LandDemo {
    public static void main(String[] args) {

        Bundesland steiermark = new Bundesland(4604);
        Bundesland wien = new Bundesland(9657);
        Bundesstaat oesterreich = new Bundesstaat();
        System.out.println(steiermark.getBruttosozialProdukt());

        oesterreich.addLand(steiermark);
        oesterreich.addLand(wien);
        System.out.println(oesterreich.getBruttosozialProdukt());

    }
}
