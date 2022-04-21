package com.netcracker.horstmannbigjava.ch3.p3_9;

import java.util.InputMismatchException;

public class Battery {
    private final double capacity;
    private double dynamicCapacity;

    public Battery(double capacity) {
        if (capacity > 2000 || capacity < 3000) {
            this.capacity = capacity;
            this.dynamicCapacity = capacity;
        } else {
            throw new InputMismatchException("Your capacity is out of bounds ( must be  2000 < capacity < 3000)");
        }
    }

    public void drain(double amount) {
        dynamicCapacity -= amount;
    }

    public void charge() {
        dynamicCapacity = capacity;
    }

    public double getRemainingCapacity() {
        return dynamicCapacity;
    }

}
