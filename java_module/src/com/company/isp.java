package com.company;
interface Salary
{
int calculateSalary(int monthlysalary);
}

interface Hike
{
     int calculateHike(int experienceyears);
}

class Income implements Salary
{
    public int calculateSalary(int monthlysalary)
    {
        return monthlysalary*12;
    }
}

class Increment implements Hike
{
    public int calculateHike(int experienceyears)
    {
        return 50000*experienceyears;
    }
}


