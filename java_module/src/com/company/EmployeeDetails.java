package com.company;

public class EmployeeDetails
{
    public String name;
    public String employeeId;
    public String designation;

    public EmployeeDetails(String Name,String id,String position)
    {
        this.name=Name;
        this.employeeId=id;
        this.designation=position;
    }
    public void printDetails()
    {
        System.out.println("name: " +name + "employeeId: " +employeeId + "designation: " + designation );
    }
}






