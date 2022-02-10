package com.company;
enum DepartmentType {
    Sales,
    Production,
    Testing
}
public class ocp_violate
{

    public String display(DepartmentType objEmployeeType) {
        if (objEmployeeType == DepartmentType.Sales) {
            return "Sales";
        } else if (objEmployeeType == DepartmentType.Production) {
            return "Production";
        } else if (objEmployeeType == DepartmentType.Testing) {
            return "Testing";
        }
        else
        {
            return "Not a correct department type";
        }
    }
}
