package com.netcracker.horstmannbigjava.ch9.ex9_1;

public class SalariedEmployee extends Employee {

    public SalariedEmployee(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double weeklyPay(int hoursWorked) {
        final int WEEKS_PER_YEAR = 52;
        return getSalary() / WEEKS_PER_YEAR;
    }
}
