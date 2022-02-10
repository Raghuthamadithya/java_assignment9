package ArraysAndArraylist;

import java.util.ArrayList;

public class WrapperFun {
    public static void main(String[] args) {
        ArrayList<Integer> myList=new ArrayList<>();
        myList.add(22);
        myList.add(10);
        for(int i=0;i<myList.size();i++)
        {
            System.out.println(myList.get(i));
        }

        String number="450";
        int myNumber=Integer.parseInt(number);
        myNumber+=10;
        System.out.println(myNumber);

        String myString="3.14159";
        double theNumber=Double.parseDouble(myString);
        System.out.println(theNumber);
    }
}
