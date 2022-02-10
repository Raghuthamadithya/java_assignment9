package MethodsPractice;

public class MethodOverloading {
    public static void main(String[] args) {
        int result=getResult(10);
        System.out.println(result);

         result=getResult(10,20);
        System.out.println(result);

         result=getResult(10,"123");
        System.out.println(result);

        String str3=getResult("Raghu","Adithya");
        System.out.println(str3);

    }
    public static int getResult(int a)
    {
        return a*2;
    }
    public static int getResult(int a,int b)
    {
        return a*b;
    }
    public static int getResult(int a,String value)
    {
        return a*Integer.parseInt(value);
    }
    public static String getResult(String str1,String str2)
    {
        return str1 + " " + str2;
    }
}
