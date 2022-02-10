package StringPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class Proj5_1_NamePermutations {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<String> fName=new ArrayList<>();
        ArrayList<String> lName=new ArrayList<>();

        String name;

        for(int i=0;i<5;i++)
        {
            System.out.println("Enter the name:");
            name = input.nextLine();
            String first = name.substring(0, name.indexOf(" "));
            String last = name.substring(name.indexOf(" ") + 1);
            fName.add(first);
            lName.add(last);
        }
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.println(fName.get(i) + " " +lName.get(j));
            }
        }
    }

}
