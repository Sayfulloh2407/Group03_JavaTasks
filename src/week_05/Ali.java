package javaTaksMentor;

public class Ali {

    public static void main(String[] args) {
        String strForUnique = "AAABBBCCCDEF";
        String strForReverse = "ABCD";

        System.out.println("unique " + strForUnique+ " ==> " + uniqueChars(strForUnique));
        System.out.println("Reverse " + strForReverse +" ==> " +reverse(strForReverse));
    }

    public static String uniqueChars(String strA){  // removes repetition from a string and gives string
        String strB = "";
        int aa = strA.length(), b=0;

        while (aa > b) {
//            if (strA.substring(0, b).contains("" + strA.charAt(b))) {
            if (countOccurrences(strA,(strA.charAt(b))) !=1) {  // if occurs a char more than one than it will not be added to result string

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

        for (int i = str.length()-1; i >=0 ; i--) {   // i : index number of the given string starting from last index to index 0
            reverse += str.charAt(i);              //so that from the given string all characters will be able to added from last to first

        }
        return reverse;
    }
}
    /*      String -- Find the unique
            Write a return method that can find the unique characters from the String
            Ex: unique("AAABBBCCCDEF") ==> "DEF";
            String -- Reverse
            Write a return method that can reverse String
            Ex: Reverse("ABCD"); ==> DCBA*/

