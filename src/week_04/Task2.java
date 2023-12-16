package week_04;

import java.util.Arrays;

public class Task2 {


    public class SameLetters {
        public boolean same(String str1, String str2) {
            // Removing spaces and converting strings to lowercase for case insensitivity
            str1 = str1.replaceAll(" ", "").toLowerCase();
            str2 = str2.replaceAll(" ", "").toLowerCase();

            // Converting strings to character arrays and sorting them
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // Comparing if the sorted arrays are equal
            return Arrays.equals(charArray1, charArray2);
        }


    }
}
