package week_08;

import java.util.Arrays;

public class Zlatan {
    public static void main(String[] args) {

        int[] array1 = {1,4,-2,-3};
        System.out.println("arraySum(array1) = " + arraySum(array1));

        int[] array2 = {-8,4,-2,5,1};
        System.out.println("arraySum(array2) = " + arraySum(array2));




    }

    private static boolean arraySum(int[] array){
        if(array.length <=1 || array.length >=100){
            System.err.println("Array is invalid");
            System.exit(1);
        }
        for (int i = 0; i < array.length; i++) {
            int each = array[i];
            for (int j = i+1; j < array.length; j++) {
                if(each==array[j]){
                    System.err.println("Arrays can not be identical");
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
    private static int[] descend(int[]array){
        int[] resultArray = new int[array.length];

        for (int i = 0,j = 0; i < array.length; i++) {

            if(array[i]!= 0){
                resultArray[j++] = array[i];
            }
        }
        return resultArray;

    }
}

