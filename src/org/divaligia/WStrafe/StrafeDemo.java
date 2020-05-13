package org.divaligia.WStrafe;

public class StrafeDemo {
    public static void main(String[] args) {

        Verwaltungsstrafe zetterl = new Verwaltungsstrafe("Susi", "Rasant", "VO-LM137");

        zetterl.strafe(30);
        zetterl.alkohol(2.0);
     //   zetterl.verbandspaket();
        zetterl.sonstiges(30);



        System.out.println(zetterl.strafe + "€ Strafe");

        System.out.println(zetterl.getAnzahl() +" Vergehen macht ticket.getStrafe() €: " +zetterl.getStrafe() );

    }
}

