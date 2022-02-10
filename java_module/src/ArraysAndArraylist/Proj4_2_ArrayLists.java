package ArraysAndArraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_2_ArrayLists {
    public static void main(String[] args) {
        ArrayList<Double> list=new ArrayList<>();
        Scanner input=new Scanner(System.in);
        double number;

            System.out.println("Enter number>=0 or -1 to exit");
            number = input.nextDouble();
            while(number>=0)
            {
                list.add(number);
                System.out.println("Enter number>=0 or -1 to exit");
                number = input.nextDouble();
            }

        for(int i=list.size()-1;i>=0;i--)
        {
            System.out.println(list.get(i));
        }
    }
}
