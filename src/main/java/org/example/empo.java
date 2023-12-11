package org.example;
import java.util.Scanner;
import java.util.*;
public class empo {
    private String name;
    private double salary;
    private Date dateOfJoining;

    public empo(String name, double salary, Date dateOfJoining) {
        this.name = name;
        this.salary = salary;
        this.dateOfJoining = dateOfJoining;


    }
    public void raiseSalary(double percentage) {
        double increaseAmount = this.salary * percentage / 100;
        this.salary += increaseAmount;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

}
