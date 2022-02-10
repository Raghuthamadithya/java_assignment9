package MethodsPractice;

import java.util.ArrayList;

public class Proj6_1_SumOfElements {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);
        int sum=sumElements(myList);

        System.out.println(sum);

    }
    public static int sumElements(ArrayList<Integer> list) {
        int sum=0;
        for(int i=0;i< list.size();i++)
        {
            sum+=list.get(i);
        }
        return sum;
    }

}
