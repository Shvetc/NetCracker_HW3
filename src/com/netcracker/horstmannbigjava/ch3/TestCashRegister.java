package com.netcracker.horstmannbigjava.ch3;

import com.netcracker.horstmannbigjava.ch3.p3_1_2.CashRegister;

public class TestCashRegister {
    public static void main(String[] args) {
        CashRegister cashRegister = new CashRegister(13.00);
        cashRegister.recordPurchase(35.00);
        cashRegister.recordPurchase(9.00);
        cashRegister.receivePayment(50.00);

        printInfoCashRegister(cashRegister);

    }

    static void printInfoCashRegister(CashRegister cashRegister) {
        System.out.println("Change: " + cashRegister.giveChange());
        System.out.println("Item count: " + cashRegister.getItemCount());
        System.out.println("Total tax: " + cashRegister.getTotalTax());
    }
}
