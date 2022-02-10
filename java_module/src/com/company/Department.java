package com.company;
interface Department
{
    void printDepartment();
}

class Salesman implements Department
{
    public void printDepartment() {
        System.out.println("Department: Sales");
    }
}


class Production implements Department
{
    public void printDepartment() {
        System.out.println("Department: Production");
    }
}


/*
public String display(DepartmentType objEmployeeType) {
        objEmployeeType.printDepartment();
    }
 */
