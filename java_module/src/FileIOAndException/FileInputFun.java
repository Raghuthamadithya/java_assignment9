package FileIOAndException;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileInputFun {
    public static void main(String[] args) {
        Scanner infile;
        int sum=0;
        try
        {
            infile=new Scanner(new File("input.txt"));
            int input;
            while(infile.hasNext())
            {
                input=infile.nextInt();
                System.out.println(input);
                sum+=input;
            }
            System.out.println("The sum is: "+sum);
            infile.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Can't find the file");
            System.out.println(e.getMessage());
        }
        catch(InputMismatchException e)
        {
            System.out.println("Error reading input!");

        }
    }
}
