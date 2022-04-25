package com.netcracker.horstmannbigjava.ch9.ex9_1;

public class Manager extends SalariedEmployee {
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary();
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double weeklyPay(int hoursWorked) {

        return super.weeklyPay(hoursWorked) + bonus;
    }
}
