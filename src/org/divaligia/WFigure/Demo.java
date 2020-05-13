package org.divaligia.WFigure;

public class Demo {

    public static void main(String[] args) {
        FigureManager fm = new FigureManager();

        fm.add(new Circle(50));
        fm.add(new Rectangle(100, 100));
        fm.add(new Rectangle(10, 10));
        fm.add(new Rectangle(20, 20));
        fm.add(new Rectangle(40, 40));

        System.out.println(fm.getMaxPerimeter());
        System.out.println(fm.getAverageAreaSize());
        System.out.println(fm.getAreaBySizeCategories());



    }
}
