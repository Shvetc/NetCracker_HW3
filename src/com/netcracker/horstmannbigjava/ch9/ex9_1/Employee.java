package com.netcracker.horstmannbigjava.ch9.ex9_1;

public class Employee {
    private String name;
    private double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setBaseSalary(double newSalary) {
        baseSalary = newSalary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return baseSalary;
    }

    public double weeklyPay(int hoursWorked) {
        return 0;
    }
}
