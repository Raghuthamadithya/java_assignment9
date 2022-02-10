package Adithya.assignment.singleton;

public class SingletonClass {
    String stringMember;

    static SingletonClass method(String str)
    {
        str="hello";
        return new SingletonClass();
    }
    void display()
    {
        System.out.println(stringMember);
    }
}
