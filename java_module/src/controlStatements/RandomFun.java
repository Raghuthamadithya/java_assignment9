package controlStatements;

import java.util.Random;

public class RandomFun {
    public static void main(String[] args) {
        Random random=new Random();
        int randomNumber;

        randomNumber=random.nextInt();
        System.out.println("the random number is: "+randomNumber);

        randomNumber=random.nextInt(1000);
        System.out.println("The number is b/w 0-999 : "+randomNumber);



    }
}
