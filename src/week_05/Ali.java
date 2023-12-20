package week_05;

public class Ali {

    public static void main(String[] args) {
        String strForUnique = "AAABBBCCCDEF";
        String strForReverse = "ABCD";

        System.out.println("uniques " + strForUnique + " ==> " + charsUniqueOnes(strForUnique));
        System.out.println("uniques2 " + strForUnique + " ==> " + charsUniqueOnes2(strForUnique));
        System.out.println("Reverse " + strForReverse + " ==> " + reverse(strForReverse));
    }

    public static String charsUniqueOnes(String strA) {  // removes repetition from a string and gives string
        String strB = "";
        int aa = strA.length(), b = 0;

        while (aa > b) {
//            if (strA.substring(0, b).contains("" + strA.charAt(b))) {
            if (countOccurrences(strA, (strA.charAt(b))) != 1) {  // if occurs a char more than one than it will not be added to result string

            } else {
                strB += strA.charAt(b);
            }
            b++;
        }
        return strB;
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

    public static String reverse(String str) {
        String reverse = "";   // to contain all the characters of the given in reverse method;

        for (int i = str.length() - 1; i >= 0; i--) {   // i : index number of the given string starting from last index to index 0
            reverse += str.charAt(i);              //so that from the given string all characters will be able to added from last to first
        }
        return reverse;
    }

    public static String charsUniqueOnes2(String strA) {  // removes repetition from a string and gives string
        String strB = "";

        while (strA.length() > 0) {

//            if (!countOccurrences(strA,(strA.charAt(0))==1  ) !=1) {
            if (!strB.contains(strA.substring(0, 1)) && countOccurrences(strA, (strA.substring(0,1).charAt(0))) == 1) {
//                strB += strA.charAt(0);
                strB += strA.substring(0,1);
            }
            strA = strA.replaceAll(strA.substring(0, 1), "");
        }
        return strB;
    }

}
    /*      String -- Find the unique
            Write a return method that can find the unique characters from the String
            Ex: unique("AAABBBCCCDEF") ==> "DEF";
            String -- Reverse
            Write a return method that can reverse String
            Ex: Reverse("ABCD"); ==> DCBA*/

