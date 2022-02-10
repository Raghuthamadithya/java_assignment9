package FileIOAndException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteNames {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>();
        list.add("Adithya");
        list.add("Ramesh");
        list.add("Abhilash");
        list.add("Suresh");
        list.add("Suman");

        try
        {
            PrintWriter pw=new PrintWriter("names.txt");
            for(String name:list)
            {
                pw.println(name);
            }
            pw.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Can't write to file!");
        }
    }
}
