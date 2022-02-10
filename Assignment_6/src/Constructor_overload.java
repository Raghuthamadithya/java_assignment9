public class Constructor_overload {
    Constructor_overload()
    {
        this(15,5);
        System.out.println("This is first constructor");
    }
    Constructor_overload(int num1,int num2)
    {
        System.out.println("The sum is:"+(num1+num2));
    }

    public static void main(String[] args) {
        new Constructor_overload();
    }
}
