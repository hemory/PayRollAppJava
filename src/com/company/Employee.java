package com.company;

public class Employee {
    public double hourlyRate;
    public double hoursWorked;
    public String name;
    public double basePay;
    public double totalPay;

    public Employee()
    {
        //Sets a default value
        hourlyRate = 20.75;
    }

    public double CalculateTotalPay()
    {
        basePay = hoursWorked * hourlyRate;

        totalPay = basePay;

        return totalPay;
    }


}
