package controlStatements;

import java.util.Scanner;

public class SumFun {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sum=0;
        int number;

        System.out.println("Enter the number:");
        number=input.nextInt();
        while(number>=0)
        {
            sum+=number;
            System.out.println("Enter another number:");
            number= input.nextInt();
        }
        System.out.println("The sum is :" + sum);
    }
}
