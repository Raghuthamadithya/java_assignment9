package JavaPractice;

public class ArithmeticFun {
    public static void main(String[] args) {
        int a=20;
        int b=15;

        int sum = a+b;
        int diff = a-b;
        int product = a*b;
        int quotient = a/b;
        int remainder=a%b;

        System.out.println("the sum is: " + sum);
        System.out.println("the difference is: " + diff);
        System.out.println("the product is: " + product);
        System.out.println("the quotient is: " + quotient);
        System.out.println("the remainder is: " + remainder);
        product*=2;
        System.out.println("the final product is: " + product);

    }
}
