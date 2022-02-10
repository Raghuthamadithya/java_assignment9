abstract class Rodent
{
    Rodent()
    {
        System.out.println("Constructor of the Rodent");
    }
    public abstract void run();
    public abstract void print();
}

class Mouse extends Rodent
{
    Mouse()
    {
        System.out.println("Constructor of Mouse");
    }
    @Override
    public void run()
    {
        System.out.println("Mouse is running");
    }
    @Override
    public void print()
    {
        System.out.println("This is mouse class");
    }
}

class Gerbil extends Rodent
{
    Gerbil()
    {
        System.out.println("Constructor of Gerbil");
    }
    @Override
    public void run() {
        System.out.println("Gerbil is running");
    }
    @Override
    public void print() {
        System.out.println("This is Gerbil class");
    }
}

class Hamster extends Rodent
{
    Hamster()
    {
        System.out.println("Constructor of Hamster");
    }
    @Override
    public void run() {
        System.out.println("Hamster is running");
    }
    @Override
    public void print() {
        System.out.println("This is Hamster class");
    }
}
public class Task1 {
    public static void main(String[] args)
    {
        Rodent[] r = new Rodent[3];
        r[0] = new Mouse();
        r[0].run();
        r[0].print();
        System.out.println();
        r[1]=new Gerbil();
        r[1].run();
        r[1].print();
        System.out.println();
        r[2]=new Hamster();
        r[2].run();
        r[2].print();
    }
}
