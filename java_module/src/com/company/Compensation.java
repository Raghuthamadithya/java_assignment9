package com.company;

public class Compensation {
    public int salary;
    public int days;
    public Compensation(int amount,int numberOfDays)
    {
        this.salary=amount;
        this.days=numberOfDays;
    }
    public int printSalary()
    {
        return salary*days;
    }
}
