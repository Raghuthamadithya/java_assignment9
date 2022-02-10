package JavaPractice;
import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String name;
        int age;
        String city;
        double realNumber;

        System.out.println("What is your name?:");
        name=s.nextLine();

        System.out.println("What's your age?: ");
        age=s.nextInt();

        System.out.println("Enter the number");
        realNumber=s.nextDouble();
        s.nextLine();
        realNumber*=2;



        System.out.println("Where do you live?:");
        city=s.nextLine();

        System.out.println("Hello, " + name);
        System.out.println("Age is " +age);
        System.out.println("city is: " +city);
        System.out.println("Twice of realNumber is :" +realNumber);

    }
}
