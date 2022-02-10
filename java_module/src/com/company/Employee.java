package com.company;

class Employee
{
    void printEmployeeDept()
    {
        System.out.println("prints the employee department");
    }
}
class Clerk extends Employee
{
    void printEmployeeDept()
    {
        System.out.println("prints the department of clerk");
    }
}
