package week_07;

import java.util.Arrays;

public class Ümit {


    public static void main(String[] args) {

        int[] array1 = {50,5,100,250,-10};
        System.out.println("minimum number = " + findMinimum(array1)); //-10

        System.out.println("-----------------------------------------------------");

        int[] array = {5,1,6,4,3,7,2};
        int[] sortedArray = sortAscending(array);
        System.out.println(Arrays.toString(sortedArray));

        System.out.println("-----------------------------------------------------");

        int[] array2 = {20,70,10,90,80,5};
        int[] sortedArray2 = sortDescending(array2);
        System.out.println(Arrays.toString(sortedArray2));


    }


    /*
    Question1: Array - Find Minimum
    Write a method that can find the maximum number from an int Array
     */
    public static int findMinimum(int[] arr){

        int min = arr[0];

        for (int each: arr){
            if (each < min){
                min = each;
            }
        }
        return min;
    }



    /*
    Question2: Array - Sort Ascending
    Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
    Ex: int[] arr = {10, 9, 8, 7};
     arr = Sort(arr); ==>{ 7, 8, 9, 10};
     */

    public static int[] sortAscending(int[] arr){

        for (int i = 0; i < arr.length-1 ; i++) {

            int minIndex = i;

            for (int j = i+1 ; j < arr.length ; j++) {

                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
                
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;



        }
        return arr;

    }


    /*
    Question3: Array - Sort Descending
    Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
    Ex: int[] arr = {10,20,7, 8, 90};
    arr = Sort(arr); ==> {90, 20, 10, 8, 7};
     */

    public static int[] sortDescending(int[] arr){

        for (int i = 0; i < arr.length-1 ; i++) {

            int maxIndex = i;

            for (int j = i+1 ; j < arr.length ; j++) {

                if (arr[j] > arr[maxIndex]){
                    maxIndex = j;
                }

            }

            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;



        }
        return arr;

    }
}
