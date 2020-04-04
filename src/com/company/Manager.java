package com.company;

public class Manager {

    public double hourlyRate;
    public double hoursWorked;
    public String name;
    public double basePay;
    public double totalPay;
    public double allowances;

    public Manager() {

        //Sets a default value
        hourlyRate = 50.00;
        allowances = 100.00;
    }

    public double CalculateTotalPay() {
        basePay = hoursWorked * hourlyRate;

        totalPay = basePay + allowances;

        return totalPay;
    }
}
