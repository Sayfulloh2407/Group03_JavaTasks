package week_08;

import java.util.Arrays;

public class ümit {


    public static void main(String[] args) {

        int[] array = {2,4};
        System.out.println("arraySumZero(array) = " + arraySumZero(array)); //false

        int[] array2 = {2,4,-2,-4};
        System.out.println("arraySumZero(array2) = " + arraySumZero(array2)); //true

        System.out.println("-------------------------------------------------");

        int[] moveZeros = {0,1,0,0,0,2,3,4};
        System.out.println(Arrays.toString(moveZeroToEnd(moveZeros))); //[1, 2, 3, 4, 0, 0, 0, 0]


    }




    /*
        Array - N unique integers that sum up to 0
    Write a function that given an integer N (1 < N < 100), returns an array
    containing N unique integers that sum up to 0. The function can return any
    such array.
    For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
    The answer [1, - 1,1,3] would be incorrect (because value 1 occurs twice).
    For N = 3 one of the possible answers is [-1,0,1] (but there are many more
    correct answers).
     */

    public static boolean arraySumZero(int[] arr){

        if (arr.length<=1 || arr.length >=100){
            System.err.println("Invalid array number");
            System.exit(1);
        }

        for (int i = 0; i <arr.length ; i++) {
            int each = arr[i];

            for (int j = i+1; j <arr.length ; j++) {
                if (each == arr[j] ){
                    System.err.println("Numbers must be unique");
                    System.exit(1);
                }

            }

        }
        int sum = 0;
        for (int each : arr){
            sum += each;
        }
        return sum == 0;
    }



    public static int[] moveZeroToEnd(int[]array){
        int[] result = new int[array.length];

        for (int i = 0,j = 0; i < array.length; i++) {

            if(array[i]!= 0){
                result[j++] = array[i];
            }
        }
        return result;

    }

}
