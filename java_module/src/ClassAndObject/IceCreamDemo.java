package ClassAndObject;

public class IceCreamDemo {
    public static void main(String[] args) {
        IceCream ic1=new IceCream("Chocolate",3,2);
        IceCream ic2=new IceCream("Strawberry",2,1);

        ic1.addTopping("nuts");
        ic1.addTopping("cherries");

        ic2.addTopping("springles");

        printIC(ic1);
        printIC(ic2);

    }
    public static void printIC(IceCream icecream)
    {
        System.out.println(icecream.getName());
        System.out.println("Cost : $"+ icecream.getCost());
        System.out.println("Topped with :");
        icecream.printToppings();
        System.out.println();
    }
}
