package ArraysAndArraylist;

import java.util.Scanner;

public class Proj4_1_Arrays {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter the  number"+(i+1));
            arr[i]=input.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            System.out.println(arr[i]*2);
        }
    }
}
