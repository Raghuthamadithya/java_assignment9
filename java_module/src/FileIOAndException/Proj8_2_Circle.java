package FileIOAndException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Proj8_2_Circle {
    public static void main(String[] args) {
        ArrayList<Circle> circleList;
        circleList=new ArrayList<>();

        fillArrayList(circleList);
        printCircles(circleList);


    }
    public static void fillArrayList(ArrayList<Circle> circleAL)
    {
        Scanner infile;

        try
        {
            infile=new Scanner(new File("circle_data.txt"));
            Circle temp;
            double radius;

            while(infile.hasNext())
            {
                radius= infile.nextDouble();
                temp = new Circle(radius);
                circleAL.add(temp);
            }

            infile.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error accessing file!");
        }
    }
    public static void printCircles(ArrayList<Circle> circleAL)
    {
        PrintWriter pw;
        try {
            pw=new PrintWriter("circles_output.txt");
            for (Circle c : circleAL) {
                System.out.println("radius :" + c.getRadius());
                System.out.println("Area :" + c.area());
                System.out.println("Circumference : " + c.circumference());
                System.out.println();

                pw.println("radius :" + c.getRadius());
                pw.println("Area :" + c.area());
                pw.println("Circumference : " + c.circumference());
                pw.println();
            }
            pw.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Couldn't access the file");
        }
    }

}
