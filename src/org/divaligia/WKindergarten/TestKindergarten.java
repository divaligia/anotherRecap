package org.divaligia.WKindergarten;
import java.util.ArrayList;
import java.util.Collections;

public class TestKindergarten {

    public static void main(String[] args) {
        Kindergarten kiga = new Kindergarten("Storchi");

        kiga.addKind(new Kind("Tobias", "Penz", 4));
        kiga.addKind(new Kind("Renate", "Reussl", 3));
        kiga.addKind(new Kind("Andrea", "Penz", 2));

        System.out.println(kiga.getKinder());

        System.out.println("-----");

        kiga.sortAlphabetical();
        System.out.println(kiga.getKinder());

        System.out.println("-----");

        kiga.sortAge();
        System.out.println(kiga.getKinder());


    }
}
