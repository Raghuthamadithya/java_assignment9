package controlStatements;

import java.util.Scanner;

public class GradeFun {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char Grade;

        System.out.println("Enter a grade");
        Grade=input.next().charAt(0);

        switch(Grade)
        {
            case 'A' :
            case 'a' :
                System.out.println("Great Job!");
                break;
            case 'B' :
            case 'b' :
                System.out.println("Good Job.");
                break;
            case 'C' :
            case 'c' :
                System.out.println("You can do better");
            case 'D' :
            case 'd' :
                System.out.println("You're getting pretty close to failing");
            case 'F' :
            case 'f' :
                System.out.println("You are failing the course!");
                break;
            default:
                System.out.println("You have entered an invalid grade.");
        }
    }
}
