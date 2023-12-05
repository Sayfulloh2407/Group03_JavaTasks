package week_04;

import java.util.Arrays;
import java.util.Collections;

public class Ümit_Week4_Tasks {
    public static void main(String[] args) {

        characterFrequency("AAABBCDD"); //A3B2C1D2

        System.out.println("---------------------------------------");
        boolean r1 = sameLetters("abc","cba");
        System.out.println("r1 = " + r1); //true

        boolean r2 = sameLetters("abcd", "abce");
        System.out.println("r2 = " + r2); //false

        boolean r3 = sameLetters(" a b c", "bc a");
        System.out.println("r3 = " + r3); //true

        System.out.println("---------------------------------------");

        System.out.println(removeDuplicate("AAABBBCCC"));  //ABC


    }

    public static void characterFrequency(String str){

        /*
        String -- Frequency of Characters
        Write a return method that can find the frequency of
        characters
        Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
         */


        String result ="";



        for (int j = 0; j < str.length() ; j++) {

            char ch = str.charAt(j);

            int count = 0;

            for (int i = 0; i < str.length() ; i++) {

                char each =str.charAt(i);

                if (ch == each){
                    count++;
                }
            }

            if (result.contains(""+ch)){
               continue;
            }

            result += ch;
            result += count;



        }
        System.out.println(result);

    }


    public static boolean sameLetters(String str1, String str2){

        /*
        String -- Same letters
        Write a return method that check if a string is build out of the
        same letters as another string.
        Ex: same("abc", "cab"); -> true
        same("abc", "abb"); -> false:
         */

        //first replace spaces in case there are any.
        //then change the string chars to lower case
        str1 = str1.replaceAll(" ","").toLowerCase();
        str2 = str2.replaceAll(" ","").toLowerCase();


        //To be able to "sort" the characters in the string we have to convert each to "char" and implement to arrays
        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();

        //Now we can use "sort" method from Arrays class

        Arrays.sort(charArr1); // these two sort methods will sort the letters according to their ascii table values
        Arrays.sort(charArr2); //ex: bca --- abc

        //Now we will check if the two array characters are equal
        return Arrays.equals(charArr1,charArr2);

    }


    public static String removeDuplicate (String str){

        /*
        String -- Remove Duplicates
        Write a return method that can remove the duplicated values from
        String
        Ex: removeDup("AAABBBCCC") ==> ABC
         */

        String result = "";

        for (int i = 0; i <str.length() ; i++) {

            if (result.contains(""+str.charAt(i))){ //if the character is already contained in new string
                continue;  //then skip it
            }
            result += str.charAt(i);
        }
       return result;
    }
}
