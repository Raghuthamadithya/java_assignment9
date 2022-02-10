package StringPractice;

public class StringMethods1 {
    public static void main(String[] args) {
        String str1="John Baugh";
        String str2="John Baugh";
        String str3="Rob Percival";

        for(int i=0;i<str1.length();i++)
        {
            System.out.print(str1.charAt(i)+" ");
        }
        System.out.println( );

        if(str1.equals(str2))
        {
            System.out.println("The names are equal");
        }
        else
        {
            System.out.println("Names are not equal");
        }
        if(str1.compareTo(str3)>0)
        {
            System.out.println("str1 > str3");
        }
        else
        {
            System.out.println("str1 <= str3");
        }

        String str4="Ed Mortram";
        if(str4.compareTo(str3)>0)
        {
            System.out.println("str4 > str3");
        }
        else
        {
            System.out.println("str4 <= str3");
        }


    }
}
