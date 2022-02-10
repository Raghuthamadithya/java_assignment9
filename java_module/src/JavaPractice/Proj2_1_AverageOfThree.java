package JavaPractice;
import java.util.Scanner;

public class Proj2_1_AverageOfThree {
    public static void main(String[] args) {
        Scanner inputNumber=new Scanner(System.in);
        double number1;
        double number2;
        double number3;
        double average;

        System.out.println("Enter first number?:");
        number1=inputNumber.nextDouble();

        System.out.println("Enter second number?:");
        number2=inputNumber.nextDouble();

        System.out.println("Enter third number?:");
        number3=inputNumber.nextDouble();

        average=(number1+number2+number3)/3.0;

        System.out.println("the average of three numbers is: " +average);

    }
}
