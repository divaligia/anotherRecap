package org.divaligia.WKonto;

public class JugendGiroKonto extends GiroKonto{
    protected double buchungslimit;

    public JugendGiroKonto(String inhaber, double limit, double buchungslimit) {
        super(inhaber, limit);
        this.buchungslimit = buchungslimit;
    }

    @Override
    public void einzahlen(double wert) {
        if (wert < 0) {
            return;
        }
        super.einzahlen(wert);
    }

    @Override
    public double auszahlen(double wert) {
        if(wert > (kontostand + limit)){
            wert = kontostand + limit;
        } if (wert > buchungslimit){
            wert = buchungslimit;
        }
        return super.auszahlen(wert);
    }
}
