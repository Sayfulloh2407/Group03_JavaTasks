package week_06.Ali;

import java.util.Scanner;

public class FindMaximum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.print("Enter a number to determine the number of elements of the array: ");
        int numOfLength = scanner.nextInt();
        scanner.nextLine();
        int [] intArray = new int[numOfLength];
//        while (numOfLength > 0){
//        }
        System.err.println("enter array's integer elements you determined the number above: ");
        for (int i= 0 ; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
            scanner.nextLine();
        }

        int maxElement = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i]>maxElement){
                maxElement = intArray[i];
            }
        }
        System.out.print("entered array's elements: ");

        for (int element : intArray) {
            System.out.print(element + " ");
        }

        System.out.println("");

        System.out.print("maximum element in array: ");
        System.out.println(maxElement);
    }

}
/*
        Array -- Find Maximum
                Write a method that can find the maximum number from an int Array
*/
