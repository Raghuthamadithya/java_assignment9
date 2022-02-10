package StringPractice;


public class StringMethods2 {
    public static void main(String[] args) {
        String name="John Baugh";
        String upper=name.toUpperCase();
        String lower=name.toLowerCase();

        int whereIsB=name.indexOf('B');

        String lastName=name.substring(5);

        System.out.println("upper is "+upper);
        System.out.println("lower is "+lower);
        System.out.println("Index of B is "+whereIsB);
        System.out.println("Last name is "+lastName);

    }
}
