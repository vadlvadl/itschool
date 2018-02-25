package com.lizogub.OOPLesson3;

public class Plane extends Vehicle implements InterfacePlane {
    private int altitude;
    private int maxPassengers;

    @Override
    public int getAltitude() {
        return altitude;
    }

    @Override
    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    @Override
    public int getMaxPassengers() {
        return maxPassengers;
    }

    @Override
    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    @Override
    String getInfo() {
        return "Coordinates: " + longitude + ", " + latitude +
                "Altitude: "  + altitude +
                "Passengers: " + maxPassengers +
                "\nPrice: " + price +
                "\nSpeed: " + speed +
                "\nYear" + year;
    }
}
