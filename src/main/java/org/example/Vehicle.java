package org.example;

public abstract class Vehicle extends Product{
    private String name;
    private int speed;
    private float price;
    private Engine engine;
    protected final float TAX_AMT = .10F;


    public Vehicle(String name) {
        super(name);
    }

//    public Vehicle(String name, int speed, float price, Engine engine){
//        super(name);
//        this.speed = speed;
//        this.price = price;
//        this.engine = engine;
//    }

//    public abstract float getPrice();

    public abstract void printVehicleType();

    public abstract float getPriceAfterTax();
}
