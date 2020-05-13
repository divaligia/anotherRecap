package org.divaligia.WKindergarten;

import java.util.Comparator;

public class AlphabeticalComparator implements Comparator<Kind> {
    @Override
    public int compare(Kind k1, Kind k2){
        String k1Name = k1.getNname() + " " + k1.getVname();
        String k2Name = k2.getNname() + " " + k2.getVname();

        return k1Name.compareTo(k2Name);
    }
}
