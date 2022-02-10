package controlStatements;

import java.util.Scanner;

public class DivisibleByThree {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a;
        System.out.println("Enter the number: ");
        a=input.nextInt();
        if(a%3==0)
        {
            System.out.println(a+" is divisible by 3");
        }
        else
        {
            System.out.println(a+" is not divisible by 3");
        }
    }
}
