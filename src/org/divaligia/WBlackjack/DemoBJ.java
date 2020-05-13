package org.divaligia.WBlackjack;

public class DemoBJ {
    public static void main(String[] args) {

        Blackjack blackTable = new Blackjack();

        Player p1 = new Player("Susi", 21);
        Player p2 = new Player("konrad", 21);
        blackTable.add(p1);
        System.out.println(blackTable.addCard(p1, 12));

        System.out.println(blackTable.add(new Player("Hans",26)));
      //  System.out.println(p.add(new Player("Hans",26)));

        System.out.println("-------");


        System.out.println("-------");
        System.out.println(blackTable.getValue(p1));
        System.out.println(blackTable.getValue(p2));





    }
}
