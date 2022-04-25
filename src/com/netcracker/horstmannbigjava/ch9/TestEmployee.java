package com.netcracker.horstmannbigjava.ch9;

import com.netcracker.horstmannbigjava.ch9.ex9_1.Employee;
import com.netcracker.horstmannbigjava.ch9.ex9_1.HourlyEmployee;
import com.netcracker.horstmannbigjava.ch9.ex9_1.Manager;
import com.netcracker.horstmannbigjava.ch9.ex9_1.SalariedEmployee;

import java.util.Scanner;

public class TestEmployee {
    public static void main(String[] args) {
        printInfoAboutEmployee(inputEmployee());
    }

    static Employee[] inputEmployee() {
        Employee[] staff = new Employee[3];
        staff[0] = new HourlyEmployee("Morgan, Harry", 30);
        staff[1] = new SalariedEmployee("Lin, Sally", 5200);
        staff[2] = new Manager("Smith, Mary", 104000, 50);
        return staff;
    }

    static void printInfoAboutEmployee(Employee[] employees) {
        Scanner in = new Scanner(System.in);
        for (Employee e : employees) {
            System.out.print("Hours worked by " + e.getName() + ": ");
            int hours = in.nextInt();
            System.out.println("Salary: " + e.weeklyPay(hours));
        }
    }
}
