package org.example;

public class Boat extends Vehicle {

    private boolean hasGps;

    public Boat(String name) {
        super(name);
    }

    public Boat(String name, boolean hasGps){
        super(name);
        this.hasGps = hasGps;
    }

    public void printHasGps(){
        System.out.println(this.hasGps);
    }

    @Override
    public void printVehicleType() {

    }

    @Override
    public float getPriceAfterTax() {
        return 0;
    }
}
