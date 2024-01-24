package week_09;

import java.util.ArrayList;
import java.util.Arrays;

public class Ümit {

    public static void main(String[] args) {

        //TASK 1 SOLUTIONS
        int[] array1 = {0,1,2,3};
        int[] array2 = {4,5,6,7};
        System.out.println(Arrays.toString(concatenation(array1, array2)));

        System.out.println(Arrays.toString(concatenation2(array1, array2)));

        System.out.println("------------------------------------------------");
        /*
        TASK 2) ArrayList - Remove "Ahmed"
        Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
        Write a java operation to remove all the names named Ahmed
       */
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed","John","Eric","Ahmed"));

        names.removeAll(Arrays.asList("Ahmed"));
        System.out.println(names);

        /*
       TASK 3) ArrayList - Remove some values
        Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100
       */

        ArrayList<Integer> values = new ArrayList<>(Arrays.asList(1,20,25,110,108,250,70,90,55,640,72,101,202));
        values.removeIf(p-> p > 100);
        System.out.println(values);




    }


    /*
    TASK 1) Array - Concat two arrays
    Write a return method that can concatenate two arrays
    SOLUTION 1
     */

    public static int[] concatenation(int[] arr1, int[] arr2){

        int [] result = new int[arr1.length+arr2.length];


        int position = 0;

        for (int each: arr1){
            result[position] = each;
            position++;
        }

        for (int each: arr2){
            result[position] = each;
            position++;
        }

        return result;

    }

        /*
       TASK 1) Array - Concat two arrays
        Write a return method that can concatenate two arrays
        SOLUTION 2
         */
    public static int[] concatenation2(int[] arr1, int[] arr2){

     int[] arr3 = Arrays.copyOf(arr1,arr1.length+ arr2.length);

        for (int i = 0, j = arr1.length; i<arr2.length ; i++, j++) {

          arr3[j] = arr2[i];

        }

        return arr3;

    }





}
