package week_07;

import java.util.Arrays;

public class melike {
    public static void main(String[] args) {

        /*
        Question1: Array - Find Minimum
        Write a method that can find the maximum number from an int Array
     */
        int[] array = {100, 40, 900, 15, 5, 8, 9};
        System.out.println("minimumNumber(array) = " + minimumNumber(array));

    /*
        Question2: Array - Sort Ascending
        Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
            Ex: int[] arr = {10, 9, 8, 7};
            arr = Sort(arr); ==>{ 7, 8, 9, 10}
     */
        int[] arr = {10, 9, 8, 7};
        System.out.println("sortAscending(arr) = " + Arrays.toString(sortAscending(arr)));

    /*
        Question3: Array - Sort Descending
        Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
            Ex: int[] arr = {10,20,7, 8, 90};
            arr = Sort(arr); ==> {90, 20, 10, 8, 7}
     */
        int[] arr1 = {10, 20, 7, 8, 90};
        System.out.println("sortDescending(arr1) = " + Arrays.toString(sortDescending(arr1)));


    }


    private static int minimumNumber(int[] array) {
        int min = array[0];

        for (int each : array) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }

    private static int[] sortAscending(int[] arr) {


        for (int i = 0; i < arr.length - 1; i++) {

            int minimumIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minimumIndex]) {
                    minimumIndex = j;
                }
            }
            // Swap arr[i] and arr[minIndex]
            int temp = arr[i];
            arr[i] = arr[minimumIndex];
            arr[minimumIndex] = temp;


        }
        return arr;
    }

    private static int[] sortDescending(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int maximumNumber = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[maximumNumber]) {
                    maximumNumber = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maximumNumber];
            arr[maximumNumber] = temp;

        }
        return arr;

    }
}
