package controlStatements;

import java.util.Scanner;

public class Proj3_1_LearningPackages {
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        int numberOfCourses;
        int pack;
        int basicCost;
        int costPerCourse;
        int included;
        int cost;
        System.out.println("Which packages do you want?");
        pack=key.nextInt();
        System.out.println("enter the number of courses?");
        numberOfCourses=key.nextInt();
        if(pack==1)
        {
            basicCost=10;
            costPerCourse=6;
            included=2;

        }
        else if(pack==2)
        {
            basicCost=12;
            costPerCourse=4;
            included=4;
        }
        else
        {
            basicCost=15;
            costPerCourse=3;
            included=6;
        }
        if(numberOfCourses>included)
        {
            cost=basicCost+(numberOfCourses-included)*costPerCourse;
        }
        else
        {
            cost=basicCost;
        }
        System.out.println("total cost is: $"+cost);
    }
}
