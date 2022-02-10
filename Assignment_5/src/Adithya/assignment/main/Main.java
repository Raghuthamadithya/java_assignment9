package Adithya.assignment.main;

import Adithya.assignment.data.Myclass;
import Adithya.assignment.singleton.SingletonClass;

public class Main {
    public static void main(String[] args)
    {
        Myclass obj1=new Myclass();
        obj1.printMembers();
        obj1.printLocalVariables(10,12);

//       SingletonClass obj2= new SingletonClass("hi");
//        obj2.display();
    }
}

