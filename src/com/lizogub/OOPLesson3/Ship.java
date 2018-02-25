package com.lizogub.OOPLesson3;

public class Ship extends Vehicle implements InterfaceShip {
    private int maxPassengers;
    private String registerPort;

    @Override
    public int getMaxPassengers() {
        return maxPassengers;
    }

    @Override
    public void setMaxPassengers(int count) {
        maxPassengers = count;
    }

    @Override
    public String getRegPort() {
        return registerPort;
    }

    @Override
    public void setRegPort(String port) {
        registerPort = port;
    }

    @Override
    String getInfo() {
        return "Coordinates: " + longitude + ", " + latitude +
                "Port: " + registerPort +
                "Passengers: " + maxPassengers +
                "\nPrice: " + price +
                "\nSpeed: " + speed +
                "\nYear" + year;
    }
}
