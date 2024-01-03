package week_05;

public class ümit {
    public static void main(String[] args) {

        String str = "AAABBBCCCDEF";
        System.out.println(uniqueChars(str));   //DEF


        String word = "ABCD";
        System.out.println(reverseString(word));


    }


    /*
    String -- Find the unique
    Write a return method that can find the unique characters from the String
    Ex: unique("AAABBBCCCDEF") ==> "DEF";
     */
    public static String uniqueChars(String str){

        String unique = "";


        for (int i = 0; i <str.length() ; i++) {

            char each = str.charAt(i);

            if (str.indexOf(each) == str.lastIndexOf(each)){

                unique += each;
            }

        }
        return unique;
    }


    /*
    String -- Reverse
    Write a return method that can reverse String
    Ex: Reverse("ABCD"); ==> DCBA
     */
    public static String reverseString (String str){

        String reversed = "";

        for (int i = str.length()-1; i >=0 ; i--) {

            reversed += str.charAt(i);
        }

        return reversed;
    }
}
