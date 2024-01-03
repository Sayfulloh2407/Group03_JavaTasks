package week_06;



public class Ümit_Week_6 {
    public static void main(String[] args) {

        String password = "Ab!1ko";
        System.out.println(isValidPassword(password)); //true

        System.out.println("----------------------------------------------------");

        int[] example = {8,15,50,1,2,3,4,5};
        System.out.println(maxNumber(example)); //max= 50


    }


   /*
   1. Write a return method that can verify if a password is valid or not.
    requirements:
    1. Password MUST be at least have 6 characters and should not contain space
    2. PassWord should at least contain one upper case letter
    3. PassWord should at least contain one lowercase letter
    4. Password should at least contain one special characters
    5. Password should at least contain a digit
    */

    public static boolean isValidPassword(String password){

        if (password.length()<6 || password.contains(" ")){
            return false;
        }
        if (!containsUpperCase(password)){
            return false;
        }
        if (!containsLowerCase(password)){
            return false;
        }
        if (!containsSpecialChar(password)){
            return false;
        }
        if (!containsDigit(password)){
            return false;
        }


        return true;




    }
    public static boolean containsUpperCase(String str){
        for (char character : str.toCharArray()) {
           if (Character.isUpperCase(character)){
               return true;
           }
        }
        return false;
    }
    public static boolean containsLowerCase(String str){
        for (char character : str.toCharArray()) {
            if (Character.isLowerCase(character)){
                return true;
            }
        }
        return false;
    }
    public static boolean containsSpecialChar(String str){
        for (char character : str.toCharArray()) {
            if (!Character.isLetterOrDigit(character)){
                return true;
            }
        }
        return false;
    }
    public static boolean containsDigit(String str){
        for (char character : str.toCharArray()) {
            if (Character.isDigit(character)){
                return true;
            }
        }
        return false;
    }


    /*
    Array -- Find Maximum
   Write a method that can find the maximum number from an int Array
     */

    public static int maxNumber (int[] arr){

        int max = arr[0];

        for (Integer each : arr){

            if (each>max){
                max = each;
            }

        }
        return max;
    }
}
