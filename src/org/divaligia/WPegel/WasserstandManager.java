package org.divaligia.WPegel;

import java.util.ArrayList;
import java.util.HashMap;

public class WasserstandManager {
    private ArrayList<Wasserstand> wstaende = new ArrayList<>();

    public void add(Wasserstand w){
        wstaende.add(w);
    }

    public Wasserstand findById(int id){
        for(Wasserstand w : wstaende){
        if(w.getId() == id)
            return w;
        } return null;
    }

    public ArrayList<Wasserstand> findAllByGewaesser(String gewaesserName){
        ArrayList<Wasserstand> wByName = new ArrayList<>();
        for(Wasserstand w : wstaende){
            if(w.getGewaesserName().equals(gewaesserName)){
                wByName.add(w);
            }
        } return wByName;
    }

    public Wasserstand findLastWasserstand(String gewaesserName){
        ArrayList<Wasserstand> wByLastStand = findAllByGewaesser(gewaesserName);
        int max = 0;
        for(Wasserstand w : wByLastStand){
            if(w.getZeitpunkt() >= max){
                max = w.getZeitpunkt();
            }
        } for (Wasserstand w : wByLastStand){
            if(w.getZeitpunkt() == max)
                return w;
        } return null;
    }

    public ArrayList<Wasserstand> findForAlarmierung(){
        ArrayList<Wasserstand> wByAlarm = new ArrayList<>();
        for(Wasserstand w : wstaende){
            if(w.getMessWertFuerAlarmierung() >= w.getMessWert())
                wByAlarm.add(w);
        }
        return wByAlarm;
    }

    public double calcMittlererWasserstand(){
        int avg = 0;
        for(Wasserstand w : wstaende){
            avg += w.getMessWert();
        } return avg /= wstaende.size();
    }

    public HashMap<String, Double> getSummeByGewaesser(){
        HashMap<String, Double> sumGew = new HashMap<>();
        double sum = 0.0;
        for(Wasserstand w : wstaende){
            if (sumGew.containsKey(w.getGewaesserName())){
                sum += w.getMessWert();
                sumGew.put(w.getGewaesserName(), sum);
            } else sumGew.put(w.getGewaesserName(), w.getMessWert());
        } return sumGew;
    }


}
