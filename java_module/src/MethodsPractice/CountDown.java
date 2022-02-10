package MethodsPractice;

public class CountDown {
    public static void main(String[] args) {
        //countDown(10);
        countUpTo(2,10);

    }
    public static void countDown(int num)
    {
        if(num>=0)
        {
            System.out.println(num);
            countDown(num-1);
        }
    }
    public static void countUpTo(int a,int b)
    {
        if(a<=b)
        {
            System.out.println(a);
            countUpTo(a+1,b);
        }

    }
}
