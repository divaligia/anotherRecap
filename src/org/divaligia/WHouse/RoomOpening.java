package org.divaligia.WHouse;

public abstract class RoomOpening {
    private double posx;
    private double posy;
    private double width;
    private double height;

    public RoomOpening(double posx, double posy, double width, double height) {
        this.posx = posx;
        this.posy = posy;
        this.width = width;
        this.height = height;
    }

    public double getPosx() {
        return posx;
    }

    public void setPosx(double posx) {
        this.posx = posx;
    }

    public double getPosy() {
        return posy;
    }

    public void setPosy(double posy) {
        this.posy = posy;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
