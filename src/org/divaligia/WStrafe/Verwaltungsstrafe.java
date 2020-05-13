package org.divaligia.WStrafe;

public class Verwaltungsstrafe {
    public String vorname;
    public String nachname;
    public String kennzeichzen;
    public int strafnummer;
    public double strafe;
    public int anzahl;

    public Verwaltungsstrafe(String vorname, String nachname, String kennzeichzen) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.kennzeichzen = kennzeichzen;
        strafnummer = 3;
    }

    public void strafe(int geschwindigkeitsUeberschreitung){
        anzahl ++;
        if (geschwindigkeitsUeberschreitung > 100){
            strafe += 1500;
        } else if (geschwindigkeitsUeberschreitung > 50){
            strafe += 500;
        } else if (geschwindigkeitsUeberschreitung > 30){
            strafe += 100;
        } else if (geschwindigkeitsUeberschreitung > 20){
            strafe += 50;
        } else if (geschwindigkeitsUeberschreitung < 20){
            strafe += 30;
        }
    }

    public void verbandspaket(){
        anzahl ++;
        strafe += 25;
    }

    public void alkohol(double wert){
        anzahl += 2;
        if (wert > 3.0){
            strafe += 5000;
        } else if (wert > 2.0){
            strafe += 1000;
        } else if (wert > 1.0){
            strafe += 400;
        } else if ( wert <= 1.0 && wert >= 0.5){
            strafe += 100;
        }
    }

    public double getStrafe(){

        switch (anzahl){
            case 1: strafe *= 0.7; break;
            case 2: strafe *= 0.8; break;
            case 3: strafe *= 0.9; break;
        }return strafe;
    }

    public void sonstiges(double wert){
            anzahl++;
            strafe += wert;
    }


    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public String getKennzeichzen() {
        return kennzeichzen;
    }

    public int getStrafnummer() {
        return strafnummer;
    }

    public int getAnzahl() {
        return anzahl;
    }
}
