package MethodsPractice;

//import java.util.Random;
import java.util.Scanner;

public class FunWith2DArrays {
    public static void main(String[] args) {
        int[][]two2DArr=new int [2][3];
        fill2DArray(two2DArr);
        print2DArray(two2DArr);

    }
    public static void fill2DArray(int[][] twoDArr)
    {
        //Random rand=new Random();
        Scanner input=new Scanner(System.in);
        for(int i=0;i<twoDArr.length;i++)
        {
            for(int j=0;j<twoDArr[i].length;j++)
            {
                twoDArr[i][j]=input.nextInt();
                //twoDArr[i][j]=rand.nextInt(100);
            }
        }
    }
    public static void print2DArray(int[][] twoDArr)
    {
        for (int[] arr:twoDArr)
        {
            for (int num:arr)
            {
                System.out.print(2*num +" ");
            }
            System.out.println();
        }
    }
}
