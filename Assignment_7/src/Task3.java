import javax.swing.*;
import java.util.Scanner;

interface First
{
    public void firstPrint();
    public void firstDisplay();
}
interface Second
{
    public void secondPrint();
    public void secondDisplay();
}
interface Third
{
    public void thirdPrint();
    public void thirdDisplay();
}

interface Fourth extends First,Second,Third
{
    public void fourthMethod();
}

class Child implements Fourth{

    @Override
    public void firstPrint() {
        System.out.println("This first print method");
    }

    @Override
    public void firstDisplay() {
        System.out.println("This is first display method");
    }

    @Override
    public void secondPrint() {
        System.out.println("This is second print method");
    }

    @Override
    public void secondDisplay() {
        System.out.println("This second display method");
    }

    @Override
    public void thirdPrint() {
        System.out.println("This is third print method");
    }

    @Override
    public void thirdDisplay() {
        System.out.println("This third display method");
    }

    @Override
    public void fourthMethod() {
        System.out.println("This is fourth method");
    }

    public void one(First firstObj)
    {

    }
    public void two(Second secondObj)
    {

    }
    public void three(Third third)
    {

    }
}
public class Task3 {

//    public static void main(String[] args) {
//        Fourth f=new Child();
//        String str;
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter the name of the interface:");
//        str=input.nextLine();
//        one(f);
//    }
}
