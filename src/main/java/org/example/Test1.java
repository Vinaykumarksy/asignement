package org.example;

import java.util.Date;

public class Test1 {
    public static void main(String[] args) {
        empo[] employees = new empo[3];

        employees[0] = new empo("Nakula", 78750.0, new Date(1987, 12, 15));
        employees[1] = new empo("Sahadev", 60000, new Date(1989, 10, 01));
        employees[2] = new empo("ashwathama", 70000, new Date(1990, 03, 15));

        for (empo employee : employees) {
            employee.raiseSalary(5);
            System.out.println("Name= " + employee.getName() + ",Salary= " + employee.getSalary() + ", hireDay: "+ employee.getDateOfJoining());
        }
    }
}
