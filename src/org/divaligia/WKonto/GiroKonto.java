package org.divaligia.WKonto;

public class GiroKonto extends Konto {
    protected double limit;

    public GiroKonto(String inhaber, double limit) {
        super(inhaber);
        this.limit = limit;
    }

    public GiroKonto(String inhaber) {
        super(inhaber);
    }

    @Override
    public void einzahlen(double wert) {
        if(wert < 0){                         // Überprüfung ob Eingabe gültig
            return;
        }
        super.einzahlen(wert);
    }

    @Override
    public double auszahlen(double wert) {
        if(wert < 0) {
            return 0;
        }
        if (wert > (kontostand + limit)){      // Vergleich, überschritt der auszuzahlende Wert
            wert = kontostand + limit;         // die Höhe des Ktostands + Limits, so über nimmt
            kontostand = -limit;               // Wert Summe KtoStand + Limit und wird diesen
            return wert;                       // zurückliefern - dh. in Berücksichtigung des
        }                                      // vorgegebenen Limits wird ausgezahlt
        return super.auszahlen(wert);
    }

}
