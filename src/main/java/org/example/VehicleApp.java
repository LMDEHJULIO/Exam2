package org.example;


import java.util.*;
import java.util.stream.Stream;

public class VehicleApp {


//    Comparator sortBySpeed = new Comparator() {
//        @Override
//        public int compare(Object o1, Object o2) {
//            return 0;
//        }
//    }

    public static void printListOfVehicleNames(List<Vehicle> vehicleList){
        vehicleList.stream().forEach(vehicle -> System.out.println(vehicle.getName()));
    }

    public static void main(String[] args) {
//        List.of(new Car("Tesla"), new Car("Ford"), new Car("Audi"));

        printListOfVehicleNames(List.of(new Car("Tesla"), new Car("Ford"), new Car("Audi")));
    }

//    public void printListOfFlyableObjects(List<Flyable> flyableList){
//        System.out.println(Stream.of(flyableList).forEach(flyable -> flyable.getName()).toStirng());
//    }
//
//    public void sortAndPrintDriveableVehiclesBySpeed(List<Driveable>){
//        Collections.sort()
//    }
//
//    public void printPassengerNumbersOnly(Map<Integer, String> passengerNumberMap){
//        Stream.of(passengerNumberMap.entrySet()).forEach(set -> System.out.println(set.getValue));
//    }
}
