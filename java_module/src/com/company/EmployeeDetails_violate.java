package com.company;

public class EmployeeDetails_violate {
    private  int days;
    public String name;
    public int employeeId;
    public String designation;
    public int salary;

    public EmployeeDetails_violate(String Name,int id,String position)
    {
        this.name=Name;
        this.employeeId=id;
        this.designation=position;
    }
    public void printDetails()
    {
        System.out.println("name: " +name + "employeeId: " +employeeId + "designation: " + designation );
    }
    public EmployeeDetails_violate(int amount,int numberOfDays)
    {
        this.salary=amount;
        this.days=numberOfDays;
    }
        public int printSalary()
        {
            return salary*days;
        }
}
