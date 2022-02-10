package controlStatements;

import java.util.Scanner;

public class Fraternity {
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        int age;
        char gender;

        System.out.println("Enter your age:\t");
        age=key.nextInt();
        System.out.println("Enter your gender :\t");
        gender=key.next().charAt(0);

        if(age>=19 && gender=='M')
        {
            System.out.println("You can join the fraternity");
        }
        else
        {
            System.out.println("you cannot join the fraternity");
        }
    }
}
