package ClassAndObject;

public class CircleDemo {
    public static void main(String[] args) {
        Circle c1=new Circle();
        Circle c2=new Circle(5);
        Circle c3=new Circle(12.75);

        printCircleData(c1);
        printCircleData(c2);
        printCircleData(c3);


    }
    public static void printCircleData(Circle circle)
    {
        System.out.println("r = "+circle.getRadius());
        System.out.println("C = "+String.format("%.2f",circle.circumference()));
        System.out.println("A = "+String.format("%.2f",circle.area()));
        System.out.println();
    }
}
