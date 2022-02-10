package MethodsPractice;

public class MethodCalls {
    public static void main(String[] args) {
        doSomething();
    }
    public static void doSomething()
    {
        System.out.println("In doSomething!");

        int result=getSomething();

        System.out.println(result);
    }
    public static int getSomething()
    {
        return 150;
    }
}
