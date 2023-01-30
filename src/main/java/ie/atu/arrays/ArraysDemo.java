package ie.atu.arrays;

import java.util.Scanner;

public class ArraysDemo {

    public static void main(String[] args) {

        int[] anArray;

        anArray = new int[10];

        anArray[0] = 100;
        anArray[1] = 200;
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        int indexValue = 0;

        for(int value: anArray){
            System.out.println("Element at index " + indexValue + " :" + value);
            indexValue++;
        }


        Scanner myScan = new Scanner(System.in);
         try{
             System.out.println("please enter a number: ");
             anArray[10] = myScan.nextInt();
         }
         catch(ArrayIndexOutOfBoundsException aiob)
         {
             System.out.println("went outside memory block");
         }
    }
}
