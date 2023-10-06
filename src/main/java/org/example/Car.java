package org.example;

public class Car extends Vehicle implements Driveable{
    private String name;
    private int numberOfDoors;
    private float extraTax = .05F;
    private float price;
    private int speed;
    Engine engine;

    public Car(String name) {
        super(name);
    }

    public Car(String name, int speed, float price, Engine engine, int numberOfDoors) {
        super(name);
        this.speed = speed;
        this.price = price;
        this.engine = engine;
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getExtraTax() {
        return extraTax;
    }

    public void setExtraTax(float extraTax) {
        this.extraTax = extraTax;
    }

    public void printNumberOfDoors(){
        System.out.println(this.getNumberOfDoors());
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void printSpeed() {
        System.out.println(getSpeed());
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfDoors=" + getNumberOfDoors() +
                ", extraTax=" + getExtraTax() +
                ", price=" + getPrice() +
                ", speed=" + getSpeed() +
                ", engine=" + getEngine() +
                ", printNumberOfDoors=" + getNumberOfDoors()+
                ", name='" + getName() + '\'' +
                '}';
    }


// Using main to test class
    public static void main(String[] args) {
        Car car1 = new Car("Tesla Model 3", 120, 49999.00F,  new Engine(Size.SMALL), 4);

        car1.printVehicleType();
        car1.printVehicleType();
        car1.printNumberOfDoors();
        System.out.println(car1.getPriceAfterTax());
        System.out.println(car1.getPrice());
        car1.printSpeed();
        car1.toString();
    }

    @Override
    public void printVehicleType() {
        System.out.println(this.getClass());
    }

    @Override
    public float getPriceAfterTax() {
        return this.price + (this.price * (TAX_AMT + this.extraTax));
    }
}
