package week_04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static java.util.Collections.sort;

public class melike {
    public static void main(String[] args) {


        System.out.println(frequencyOfCharacter("AAABBCDD"));
        System.out.println(frequencyOfCharacter2("AAABBCDD"));

        System.out.println("==================================================================");

        System.out.println("sameLetter(\"abc\", \"cab\") = " + sameLetter("abc", "cab"));
        System.out.println("sameLetter(\"abc\", \"abb\") = " + sameLetter("abc", "abb"));

        System.out.println("==================================================================");

        System.out.println(removeDuplicates("AAABBBCCC"));
        System.out.println(removeDuplicates("AAABBBCCCDDDFFFGGHH"));


    }




    private static String frequencyOfCharacter(String word) {
        String result = "";

        for (char each : word.toCharArray()) {
            int total = 0;
            for (char each2 : word.toCharArray()) {
                if (each == each2) {
                    total++;
                }
            }
            if (!result.contains("" + each)) {
                result += "" + each + total;
            }

        }

        return result;

    }

    private static String frequencyOfCharacter2(String word) {
        String result = "";
        for (char each : word.toCharArray()) {
            //use frequency method to find frequency of each char
            //use split() method to return String Array and convert to ArrayList
            int frequency = Collections.frequency(Arrays.asList(word.split("")), "" + each);

            //avoid repetition
            if (result.contains("" + each)) {
                continue;
            }
            result += "" + each + frequency;
        }
        return result;

    }

    private static boolean sameLetter(String word1, String word2) {

        ArrayList<String> word1Chars = new ArrayList<>(Arrays.asList(word1.split("")));
        ArrayList<String> word2Chars = new ArrayList<>(Arrays.asList(word2.split("")));

        sort(word1Chars);
        sort(word2Chars);

        if(word1Chars.equals(word2Chars)){
            return true;
        }else {
            return false;
        }

    }

    private static String removeDuplicates(String word) {
        String result ="";

        for (char each : word.toCharArray()){
            if(result.contains(""+each)){
                continue;
            }
            result+=each;

        }

        return result;

    }

}
