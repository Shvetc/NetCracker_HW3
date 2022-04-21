package com.netcracker.horstmannbigjava.ch3.p3_1_2;

import java.util.Scanner;

/**
 * A cash register totals up sales and computes change due.
 */
public class CashRegister {
    private double purchase;
    private double payment;
    private int itemCount;
    private double taxRate;
    private double totalTax;

    public CashRegister(double taxRate) {
        this.taxRate = taxRate;
    }

    public void recordPurchase(double amount) {
        System.out.print("Whether is the item  taxable ? (yes - 1/no - 0): ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.nextInt() == 1) {
            recordTaxablePurchase(amount);
        }
        purchase += amount;
        itemCount++;
    }

    private void recordTaxablePurchase(double amount) {
        totalTax += amount * taxRate / 100;
    }

    public void receivePayment(double amount) {
        payment += amount;
    }

    public double giveChange() {
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        return change;
    }

    public int getItemCount() {
        return itemCount;
    }

    public double getTotalTax() {
        return totalTax;
    }
}
