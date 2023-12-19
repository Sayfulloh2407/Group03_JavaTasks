package week_05;

public class melike {

    public static void main(String[] args) {

        System.out.println(unique("AAABBBCCCDEF"));
        System.out.println(unique("BBDDGGKLMBD"));

        System.out.println(reverse("ABCD"));
        System.out.println(reverse("MELIKE"));

    }

    private static String reverse(String word) {
        String result="";

        for (int i = word.length()-1; i >=0 ; i--) {
            result+=word.charAt(i);
        }
        return result;
    }

    private static String unique(String word) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            int total = 0;
            char each = word.charAt(i);
            for (int j = 0; j < word.length(); j++) {
                char each2 = word.charAt(j);
                if (each == each2) {
                    total++;
                }
            }
            if (total == 1 && !result.contains("" + each)) {
                result += each;
            }
        }
        return result;
    }


}
