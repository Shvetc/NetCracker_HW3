package com.netcracker.horstmannbigjava.ch9.ex9_1;

public class HourlyEmployee extends Employee {

    public HourlyEmployee(String name, double wage) {
        super(name, wage);
    }

    @Override
    public double getSalary() {
        return super.getSalary();
    }

    @Override
    public double weeklyPay(int hoursWorked) {
        double pay = hoursWorked * getSalary();
        if (hoursWorked > 40) {
            pay = pay + ((hoursWorked - 40) * 0.5) * getSalary();
        }
        return pay;
    }
}
