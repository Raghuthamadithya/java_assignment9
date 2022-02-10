interface Cycle1
{
    void code();
    void factory();
}
class Unicycle1 implements Cycle1{

    @Override
    public void code() {
        System.out.println("Code of unicycle");
        factory();
    }
    @Override
    public void factory() {
        System.out.println("Factory of Unicycle");
    }
}
class Bicycle1 implements Cycle1{

    @Override
    public void code() {
        System.out.println("Code of bicycle");
        factory();
    }
    @Override
    public void factory() {
        System.out.println("Factory of Bicycle");
    }
}
class Tricycle1 implements Cycle1{

    @Override
    public void code() {
        System.out.println("Code of tricycle");
        factory();
    }
    @Override
    public void factory() {
        System.out.println("Factory of Tricycle");
    }
}
public class Task4 {
    public static void main(String[] args) {

        Unicycle1 uni = new Unicycle1();
        uni.code();
        Bicycle1 bi=new Bicycle1();
        bi.code();
        Tricycle1 tri=new Tricycle1();
        tri.code();
    }
}
