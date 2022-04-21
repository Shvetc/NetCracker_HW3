package com.netcracker.horstmannbigjava.ch3;

import com.netcracker.horstmannbigjava.ch3.p3_9.Battery;

public class TestBattery {
    public static void main(String[] args) {
        Battery battery = new Battery(250.00);
        printInfoAboutBattery(battery);
    }

    static void printInfoAboutBattery(Battery battery) {

        battery.drain(100.00);
        System.out.println("Remaining capacity after drain 100 mAh: " + battery.getRemainingCapacity());

        battery.charge();
        System.out.println("Original capacity: " + battery.getRemainingCapacity());
    }
}
