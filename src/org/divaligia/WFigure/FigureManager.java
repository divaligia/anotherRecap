package org.divaligia.WFigure;

import java.util.ArrayList;
import java.util.HashMap;

public class FigureManager {
    protected ArrayList<Figure> figures = new ArrayList();

    public void add(Figure f){
        figures.add(f);
    }


    public double getMaxPerimeter(){
        double maxP = 0.0;
        for(Figure f : figures){
            if(f.getPerimeter()>= maxP)
            maxP = f.getPerimeter();
        } return maxP;
    }

    public double getAverageAreaSize(){
        double avgSize = 0.0;
        for (Figure f : figures){
            avgSize += f.getArea();
        } return avgSize / figures.size();
    }

    public HashMap<String, Double> getAreaBySizeCategories(){
        HashMap<String, Double> bySizes = new HashMap<>();
        double klein = 0, mittel = 0, groß = 0;
        for(Figure f : figures){
            if (f.getArea() < 1000) {
                klein += f.getArea();
                bySizes.put("Klein", klein);
            } else if (f.getArea() < 4999){
                mittel += f.getArea();
                bySizes.put("Mittel", mittel);
            } else groß += f.getArea();
                bySizes.put("Groß", groß);
        }
        return bySizes;
    }

}
