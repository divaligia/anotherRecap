package org.divaligia.WEvents;

public class Event {

    public String title;
    public String location;
    public double tixPrice;

    public Event(String title, String location, double tixPrice) {
        this.title = title;
        this.location = location;
        this.tixPrice = tixPrice;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getTixPrice() {
        return tixPrice;
    }

    public void setTixPrice(double tixPrice) {
        this.tixPrice = tixPrice;
    }

    @Override
    public String toString() {
        return "Event{" +
                "title='" + title + '\'' +
                ", location='" + location + '\'' +
                ", tixPrice='" + tixPrice + '\'' +
                '}';
    }
}

