import java.util.Scanner;

public class StringCheck {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String EnglishAlphabet;
        System.out.println("Enter the string:");
        EnglishAlphabet=input.next();
        check(EnglishAlphabet);
    }
    public static void check(String str)
    {
        int position=0;
        int f=0;
        int []list=new int[26];
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>='a' &&str.charAt(i)<='z')
            {
                position=str.charAt(i)-'a';
            }
            else if(str.charAt(i)>='A' &&str.charAt(i)<='Z')
            {
                position=str.charAt(i)-'A';
            }
            list[position]=1;
        }
        for(int i=0;i<26;i++)
        {
            if(list[i]==0)
            {
                f=1;
                break;
            }
        }
        if(f==1)
        {
            System.out.println("The String doesn't consist of all the letters of alphabet");
        }
        else {
            System.out.println("The String consist of all the letters of the alphabet");
        }
    }
}

//Time Complexity=O(lengthOfString)
//space Complexity=O(lengthOfString)
