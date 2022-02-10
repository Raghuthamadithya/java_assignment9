import java.util.HashMap;
import java.io.*;

class CharacterCheck {

    HashMap<Character,Integer> myMap=new HashMap<>();
    public void diffCharacters()
    {
        try
        {
            FileReader fr=new FileReader("input.txt");
            int index;
            while((index=fr.read())!=-1)
            {
                if(!Character.isWhitespace((char)index))
                {
                    if(myMap.containsKey((char)index))
                    {
                        myMap.put((char)index,myMap.get((char)index)+1);
                    }
                    else
                    {
                        myMap.put((char)index,1);
                    }
                }
            }
            insertResultInToNewFile();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    public void insertResultInToNewFile()
    {
        PrintWriter pw;
        try
        {
            pw = new PrintWriter("output.txt");
            pw.println(myMap.toString());
            pw.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}

    public class Main {
        public static void main(String[] args) {
            CharacterCheck c = new CharacterCheck();
            c.diffCharacters();
        }
}
