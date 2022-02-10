class A
{
    A()
    {
        System.out.println("This is outer class of A");
    }
    class Ainner
    {
        Ainner(String str)
        {
            System.out.println("The string is: "+str);
        }
    }
}
class B extends A
{
    B()
    {
        System.out.println("This is the outer class of B");
    }
    class Binner
    {
        Binner(int num)
        {
            System.out.println("The value of num is: "+num);
        }
    }
}
public class Task5 {
    public static void main(String[] args) {
        B.Binner b=new B().new Binner(12);
    }
}
