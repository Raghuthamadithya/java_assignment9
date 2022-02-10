package com.company;

public class lsp_violate {
    public void printEmployeeDept() {
        System.out.println("prints the employee department");
    }

    public void printWorkingHours() {
        System.out.println("print the working hours of an employee");
    }
}

    class Manager extends lsp_violate
    {
        public void printEmployeeDept()
        {
            System.out.println("prints the department of clerk");
        }
    }
