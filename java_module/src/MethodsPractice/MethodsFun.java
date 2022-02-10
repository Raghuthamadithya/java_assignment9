package MethodsPractice;

public class MethodsFun {
    public static void main(String[] args) {
        printHello();
        printNUmber(10);
        int ans=giveMe10();
        System.out.println(ans);
        ans = addThese(10, 20);
        System.out.println(ans);
        double result = printSquare(7.25);
        System.out.println(result);
    }
    public static void printHello()
    {
       System.out.println("Hello there!");
    }
    public static void printNUmber(int a)
    {
        System.out.println("the number is :" +a);
    }
    public static int giveMe10()
    {
        return 10;
    }
    public static int addThese(int num1,int num2)
    {
        return num1+num2;
    }

    public static double printSquare(double n) {
        return n*n;
    }

}
