package week_08;

import java.util.Arrays;

public class melike {
    public static void main(String[] args) {
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
        int[] array = {2,7,10,-19};
        System.out.println("arraySumUp0(array) = " + arraySumUp0(array));

        int[] array1 = {2,7,10,-19,5,8,12};
        System.out.println("arraySumUp0(array1) = " + arraySumUp0(array1));

        /*
        Array - Move Zeros to the End
    Write a method that can move all the zeros to last indexes of the array (Do
    Not Use Sort Method) Ex: input: {1,0,2,0,3,0,4,0}; output: [1, 2, 3, 4, 0, 0, 0, 0]
         */

        int[] array2 = {1,0,2,0,3,0,4,0};
        System.out.println("moveToZeroEnd(array2) = " + Arrays.toString(moveToZeroEnd(array2)));

        int[] array3 = {0,6,0,0,8,5,0,3,0,4,1};
        System.out.println("Arrays.toString(moveToZeroEnd(array3)) = " + Arrays.toString(moveToZeroEnd(array3)));

    }

    private static boolean arraySumUp0(int[] array){
        if(array.length <=1 || array.length >=100){
            System.err.println("array length is not valid");
            System.exit(1);
        }
        for (int i = 0; i < array.length; i++) {
            int each = array[i];
            for (int j = i+1; j < array.length; j++) {
                if(each==array[j]){
                    System.err.println("array must be contain unique integers");
                    System.exit(1);
                }
            }
        }
        int sum= 0;
        for (int each : array) {
            sum+=each;
        }
        return sum==0;
    }

    private static int[] moveToZeroEnd(int[]array){
        int[] resultArray = new int[array.length];

        for (int i = 0,j = 0; i < array.length; i++) {

            if(array[i]!= 0){
                resultArray[j++] = array[i];
            }
        }
        return resultArray;

    }
}
