package com.company;

public class Contractor {

    public double hourlyRate;
    public double hoursWorked;
    public String name;
    public double basePay;
    public double totalPay;
    public double overtimeRate;
    public double overtimeHours;

    public Contractor()
    {
        //Sets a default value
        hourlyRate = 30;
    }

    public double CalculateTotalPay()
    {
        basePay = hoursWorked * hourlyRate;

        totalPay = basePay + CalculateOvertimeRate();



        return totalPay;
    }

    //Private because its only used in class
    private double CalculateOvertimeRate()
    {
        double overTimeTotal = 0;
        overtimeRate = 40; // TODO: Change to time and a half
        if (hoursWorked > 40)
        {
            overtimeHours = hoursWorked - 40;
            overTimeTotal = overtimeHours * overtimeRate;
        }

        return overTimeTotal;
    }
}
