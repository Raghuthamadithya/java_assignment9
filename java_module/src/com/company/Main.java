package com.company;

public class Main {

    public static void main(String[] args) {
        EmployeeDetails ed=new EmployeeDetails("akash","abc","manager");
        ed.printDetails();
        System.out.println();

        Compensation com=new Compensation(400000,26);
        System.out.println(com.printSalary());
        System.out.println();

        Income i=new Income();
        System.out.println(i.calculateSalary(25000));
        System.out.println();

        Increment inc=new Increment();
        System.out.println(inc.calculateHike(4));
        System.out.println();

        Employee emp=new Employee();
        emp.printEmployeeDept();
        System.out.println();

        Clerk c=new Clerk();
        c.printEmployeeDept();
        System.out.println();

        Salesman s=new Salesman();
        s.printDepartment();
        System.out.println();

        EmployeeDetails_violate edv=new EmployeeDetails_violate("ashish",1234,"Accountant");
        edv.printDetails();
        System.out.println();

        lsp_violate lv=new lsp_violate();
        lv.printEmployeeDept();
        lv.printWorkingHours();
        System.out.println();

        ocp_violate ov=new ocp_violate();
        System.out.println(ov.display(DepartmentType.Sales));
        System.out.println();

        isp_violate iv=new isp_violate();
        System.out.println(iv.calculateSalary(30000));
        System.out.println(iv.calculateHike(3));
        System.out.println();

        Project p=new Project();
        p.implement();
        System.out.println();

        FrontEndNonViolate fnv=new FrontEndNonViolate();
        BackEndNonViolate  bnv=new BackEndNonViolate();

        ProjectNonViolate pnv=new ProjectNonViolate();
        pnv.implement(fnv);
        pnv.implement(bnv);

        // write your code here
    }
}