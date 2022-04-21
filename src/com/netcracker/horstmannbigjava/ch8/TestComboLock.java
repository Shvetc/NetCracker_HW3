package com.netcracker.horstmannbigjava.ch8;

import com.netcracker.horstmannbigjava.ch8.p8_1.ComboLock;

public class TestComboLock {
    public static void main(String[] args) {
        ComboLock comboLock = new ComboLock(25, 10, 1);
        printInfoAboutComoLock(comboLock);
    }

    static void printInfoAboutComoLock(ComboLock comboLock) {
        comboLock.turnRight(25);
        comboLock.turnLeft(15);
        comboLock.turnRight(31);
        if (comboLock.open()) {
            System.out.println("The lock is opened");
        } else {
            System.out.println("The lock is not opened");
        }
    }
}
