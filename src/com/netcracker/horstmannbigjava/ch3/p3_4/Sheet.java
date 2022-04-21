package com.netcracker.horstmannbigjava.ch3.p3_4;

import java.util.InputMismatchException;

public class Sheet {
    private double width;
    private double height;
    private int numberOfCuts;

    public Sheet() {
        this.width = 841;
        this.height = 1189;
    }

    public void cutInHalf() {
        int maxNumberOfCuts = 10;
        if (numberOfCuts <= maxNumberOfCuts) {
            height = Math.floor(height / 2);
            swap(width, height);
            numberOfCuts++;
        } else {
            throw new InputMismatchException("You have got the smallest possible paper size");
        }
    }

    private void swap(double width, double height) {
        this.width = height;
        this.height = width;
    }

    @Override
    public String toString() {
        return "Sheet A" + numberOfCuts + " with size: " + width + "x" + height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
