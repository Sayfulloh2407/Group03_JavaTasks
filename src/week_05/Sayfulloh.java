package week_05;

public class Sayfulloh {
    public static void main(String[] arg){
        System.out.println("unique(\"ABGGHFFACRCTR\") = " + unique("ABGGHFFACRCTR"));
        System.out.println("Reverse(\"ABCD\") = " + Reverse("ABCD"));
    }

    public static String unique(String input){
        String result="";
        for (int i = 0; i < input.length(); i++) {
            if (input.indexOf(input.charAt(i))==input.lastIndexOf(input.charAt(i))){
                result+=input.charAt(i);
            }
        }

        return result;
    }

    public static String Reverse(String input){
        String result="";
        for (int i=input.length()-1;i>=0;i--){
            result+=input.charAt(i);
        }
        return result;
    }




}
