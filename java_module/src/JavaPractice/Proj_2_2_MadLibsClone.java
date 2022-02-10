package JavaPractice;
import java.util.Scanner;

public class Proj_2_2_MadLibsClone {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);

        String adjective1;
        String girlsName;
        String adjective2;
        String occupation1;
        String placeName;
        String clothing;
        String hobby;
        String adjective3;
        String occupation2;
        String boysName;
        String mansName;

        System.out.println("enter adjective1:");
        adjective1=scr.nextLine();
        System.out.println("enter girlsName:");
        girlsName=scr.nextLine();
        System.out.println("enter adjective2:");
        adjective2=scr.nextLine();
        System.out.println("enter occupation1:");
        occupation1=scr.nextLine();
        System.out.println("enter placeName:");
        placeName=scr.nextLine();
        System.out.println("enter clothing:");
        clothing=scr.nextLine();
        System.out.println("enter hobby:");
        hobby=scr.nextLine();
        System.out.println("enter adjective3:");
        adjective3=scr.nextLine();
        System.out.println("enter occupation2:");
        occupation2=scr.nextLine();
        System.out.println("enter boysName:");
        boysName=scr.nextLine();
        System.out.println("enter mansName:");
        mansName=scr.nextLine();

        System.out.println("There once was a " + adjective1 + " girl named " + girlsName + " who was a " + adjective2 +" " + occupation1 + " in the Kingdom of "+ placeName + " " +
                ".");
        System.out.println("She loved to wear "+ clothing +" and to "+hobby+" . She wanted to marry the "
                + adjective3 +" "+ occupation2+" named "+boysName+" but her father,King " +mansName+ " forbid for her from seeing him.");

    }
}
