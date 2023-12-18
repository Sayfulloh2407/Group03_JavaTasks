package week_04;

import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Collections.sort;

public class Sayfulloh {
    /*Task1..
    * Write a return method that can find the frequency of characters
    * Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
    * */
    public static String FrequencyOfChars(String input){
        String result="";
        do {
            String char1 = input.charAt(0)+"";
            int counter=input.length();
            input=input.replace(char1,"");
             counter -= input.length();
            result+=char1+counter;
        }while (input.length()>0);
        return result;
    }

    /*Task2..
    * Write a return method that check if a string is build out of the
    * same letters as another string.
    * Ex: same("abc", "cab"); -> true
    * same("abc", "abb"); -> false:
    * */
    public static boolean same(String value1,String value2){
        ArrayList<String> value1_CharList;
        value1_CharList = new ArrayList<>(Arrays.asList(value1.split("")));
        sort(value1_CharList);

        ArrayList<String> value2_CharList;
        value2_CharList= new ArrayList<>(Arrays.asList(value2.split("")));

        sort(value2_CharList);

        if(value1_CharList.equals(value2_CharList)){
            return true;
        }else {
            return false;
        }
    }
    /*
    * Write a return method that can remove the duplicated values from String
    * Ex: removeDup("AAABBBCCC") ==> ABC*/
    public static String removeDup(String value){
        String result="";
        String char1="";
        for (int i = 0; i < value.length(); i++) {
            char1 = value.charAt(i) + "";
            if (result.contains(char1)) {
                continue;
            } else {
                result+=char1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(FrequencyOfChars("BBCAAAB"));
        /*System.out.println(same("klj", "ljk"));
        System.out.println(removeDup("AAABBBCCd"));*/
    }
}
