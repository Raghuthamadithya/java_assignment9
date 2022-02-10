package ArraysAndArraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_3_Parallel {
    public static void main(String[] args) {
        ArrayList<String> name=new ArrayList<>();
        ArrayList<Integer> age=new ArrayList<>();
        Scanner input=new Scanner(System.in);

        String personName;
        int personAge;
        int i=0;
        while(i<5)
        {
            System.out.println("enter person name:");
            personName=input.nextLine();
            name.add(personName);

            System.out.println("enter person age:");
            personAge= input.nextInt();
            age.add(personAge);

            input.nextLine();

            i++;
            System.out.println();
        }
        for(int j=0;j< name.size();j++)
        {
            System.out.println(name.get(j) +" is "+age.get(j)+" years old ");
        }
    }
}
