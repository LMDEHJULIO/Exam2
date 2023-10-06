package org.example;

public class FlyingCar extends Vehicle implements Flyable, Driveable{


    public FlyingCar(String name) {
        super(name);
    }

    @Override
    public void printSpeed() {

    }

    @Override
    public boolean transportsPassengers() {
        return false;
    }

    @Override
    public void printVehicleType() {

    }

    @Override
    public float getPriceAfterTax() {
        return 0;
    }
}
