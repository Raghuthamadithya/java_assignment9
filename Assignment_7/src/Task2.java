abstract class Cycle
{
    public abstract  void balance();
}
class Unicycle extends Cycle{
    public void balance()
    {
        System.out.println("Balance method of Unicycle");
    }
}
class Bicycle extends Cycle
{
    public void balance()
    {
        System.out.println("Balance method in Bicycle");
    }
}
//class Tricycle extends Cycle
//{
// Getting an error because there is no balance() method for Tricycle
//}
public class Task2 {
    public static void main(String[] args) {
        Cycle[] c=new Cycle[3];
        c[0]=new Unicycle();
        c[0].balance();
        c[1]=new Bicycle();
        c[1].balance();
       //c[2]=new Tricycle();
        //c[2].balance();
    }
}
