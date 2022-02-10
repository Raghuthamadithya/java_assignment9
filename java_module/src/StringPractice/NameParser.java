package StringPractice;

import java.util.Scanner;

public class NameParser {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String name;
        System.out.print("Enter the first name and last name" +"\t");
        name= input.nextLine();
        String first = name.substring(0,name.indexOf(" "));
        String last=name.substring(name.indexOf(" ")+1);
        System.out.println(first.toUpperCase());
        System.out.println(last.toLowerCase());
    }
}
