package week_09;

import java.util.ArrayList;
import java.util.Arrays;

public class melike {


    public static void main(String[] args) {


    /*
        1) Array - Concat two arrays
        Write a return method that can concat two arrays
     */
        int[] array1 = {2, 7, 10, -19};
        int[] array2 = {2, 7, 10, -19, 5, 8, 12};

        System.out.println("concatArray(array1, array2) = " + Arrays.toString(concatArray(array1, array2)));

    /*
        2) ArrayList - Remove "Ahmed"
        Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
        Write a java operation to remove all the names named Ahmed
     */
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Adam"));

        list1.removeIf(p -> p.equalsIgnoreCase("Ahmed"));
        System.out.println("list1 = " + list1);


    /*
        3) ArrayList - Remove some values
        Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100
     */
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 208, 43, 104, 75, 16, 100));
        System.out.println(removeGreater100(list2));

    }


    private static int[] concatArray(int[] array1, int[] array2) {
        int[] concatArray = new int[array1.length + array2.length];

        for (int i = 0; i < concatArray.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                concatArray[i++] = array1[j];
            }
            for (int j = 0; j < array2.length; j++) {
                concatArray[i++] = array2[j];
            }
        }

        return concatArray;
    }

    private static ArrayList<Integer> removeGreater100(ArrayList<Integer> list) {

        list.removeIf(p -> p > 100);

        return list;

    }


}
