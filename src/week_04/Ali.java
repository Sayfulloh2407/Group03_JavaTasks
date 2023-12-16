package week_04;

import java.util.Arrays;

public class Ali {


    public static void main(String[] args) {
//    FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
        String charsFreq = "AAABBCDD",
//        Ex: same("abc", "cab"); -> true
//        same("abc", "abb"); -> false:
                charsComp1 ="abc",
                charsComp2 = "cab",
                charsComp3 = "abb";


        System.out.println("char and number its repetition = " + FrequencyOfChars(charsFreq)); // expected : A3B2C1D2
        System.out.println("compare if both string include the same chars = " + compareCharOf2Str(charsComp1, charsComp2));  // expected : true
        System.out.println("comparing if both string include the same chars = " + compareCharOf2Str(charsComp1,charsComp3));  // expected: false

        System.out.println("comparing if both string include the same chars = " + compareCharOf2Str("abcc","aabc"));  // expected: true

    }

    public static String unrepeatedSubStr(String strA){  // removes repetition from a string and gives string
        String strB = "";
        int aa = strA.length(), b=0;

        while (aa > b) {
            if (strA.substring(0, b).contains("" + strA.charAt(b))) {

            } else {
                strB = strB + strA.charAt(b);
            }
            b++;

        }
        return strB;
    }

    public static String FrequencyOfChars(String strA){  // bir stringin elemanlarını ve kaç tane geçtiğini bulur characteri ve tekrar sayısını character character yazar.
        String strC= "";
        String strB = unrepeatedSubStr(strA);
        for (int i = 0; i < strB.length(); i++) {
            strC = strC + strB.charAt(i) + countOccurrences(strA,strB.charAt(i));
        }
        return strC;
    }

    static int countOccurrences(String str, char targetChar) {  // bir karakterin tekrar sayısını verir.
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == targetChar) {
                count++;
            }
        }

        return count;
    }
    public static boolean compareCharOf2Str(String strA, String strB){
        strA = unrepeatedSubStr(strA);
        strB = unrepeatedSubStr(strB);
        return sortCharacters(strA).equals(sortCharacters(strB));
    }

    public static String sortCharacters(String str) {  // bir stringin characterlerini ascending order sort yapar
        // Convert the string to a char array
        char[] charArray = str.toCharArray();

        // Sort the char array in ascending order
        Arrays.sort(charArray);

        // Create a new string from the sorted char array
        return new String(charArray);
    }
}

//    -----------------DESCRİPTİON---------------
/*
String -- Frequency of Characters
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
String -- Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
String -- Remove Duplicates
Write a return method that can remove the duplicated values from
String
Ex: removeDup("AAABBBCCC") ==> ABC
*/
