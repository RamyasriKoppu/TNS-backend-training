package com.tnsif.abstraction;
//abstraction by using interface
interface Vehicle {
    void start(); // abstract method by default
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting with key");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike is starting with self-start");
    }
}

public class VehicleExample {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        
        v1.start();
        v2.start();
    }
}


