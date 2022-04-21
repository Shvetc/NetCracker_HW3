package com.netcracker.horstmannbigjava.ch3;

import com.netcracker.horstmannbigjava.ch3.p3_4.Sheet;

public class TestSheet {
    public static void main(String[] args) {
        Sheet sheet = new Sheet();
        printInfoSheet(sheet);
    }

    static void printInfoSheet(Sheet theSheet) {
        System.out.println(theSheet);
        for (int i = 0; i < 10; i++) {
            theSheet.cutInHalf();
            System.out.println(theSheet);
        }
    }
}
