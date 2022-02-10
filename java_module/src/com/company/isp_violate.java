package com.company;
interface CostOfCompany
{
    int calculateSalary(int monthlysalary);
    int calculateHike(int experienceyears);
}

public class isp_violate implements CostOfCompany {


    @Override
    public int calculateSalary(int monthlysalary) {
        return monthlysalary * 12;
    }

    @Override
    public int calculateHike(int experienceyears) {
        System.out.println("I don't want to implement this method");
        return 0;
    }
}
