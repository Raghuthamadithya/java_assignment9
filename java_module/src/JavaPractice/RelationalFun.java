package JavaPractice;

public class RelationalFun {
    public static void main(String[] args) {
        boolean myBool=true;
        boolean yourBool=false;
        int a=37;
        int b=20;
        int c=20;

        System.out.println("myBool is : "+myBool);
        System.out.println("yourBool is : "+yourBool);

        boolean valueComparison = a>b;
        System.out.println("a > b?: " + valueComparison);

        valueComparison = b>c;
        System.out.println("b > c?: " + valueComparison);

        valueComparison = b==c;
        System.out.println("b == c?: " + valueComparison);

        int currentAge =21;
        System.out.println("currentAge >= 21?: "+ (currentAge>=21));
    }
}
