package week_06;

public class melike {
    //String -- Password Validation Task
    //1. Write a return method that can verify if a password is valid or not.
    //requirements:
    //1. Password MUST be at least have 6 characters and should not contain space
    //2. PassWord should at least contain one upper case letter
    //3. PassWord should at least contain one lowercase letter
    //4. Password should at least contain one special characters
    //5. Password should at least contain a digit
    //if all requirements above are met, the method returns true, otherwise returns false
    //-------------------------------------------------------------------------------
    //Array -- Find Maximum
    //Write a method that can find the maximum number from an int Array
    //-------------------------------------------------------------------------------
    //String -- sum of digits in a string
    //Write a method that can return the sum of the digits in a string

    public static void main(String[] args) {

        System.out.println(validPassword("As?6g7"));
        System.out.println(validPassword("as?6g7"));
        System.out.println(validPassword("a  s?6g7"));

        int[] number = {1, 4, 9, 15, 5, 8, 9};
        System.out.println(maximum(number));

        int[] number1 = {100, 40, 900, 15, 5, 8, 9};
        System.out.println(maximum(number1));

        int[] number2 ={};
        //System.out.println(maximum(number2));

        System.out.println(sumOfDigits("246Melike98"));

    }



    private static boolean validPassword(String password) {
        int upperCase = 0, lowerCase = 0, special = 0, digit = 0;

        if (password.length() < 6 && password.contains(" ")) {
            return false;
        }

        for (int i = 0; i < password.length(); i++) {
            char each = password.charAt(i);

            if (Character.isUpperCase(each)) {
                upperCase++;
            } else if (Character.isLowerCase(each)) {
                lowerCase++;
            } else if (!Character.isLetterOrDigit(each)) {
                special++;
            } else if (Character.isDigit(each)) {
                digit++;
            }

        }
        return upperCase >= 1 && lowerCase >= 1 && special >= 1 && digit >= 1;

    }

    private static int maximum(int[] number) {
        if(number.length == 0){
            System.err.println("Array size is 0");
            System.exit(1);
        }

        int max = number[0];
        for (int each : number) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }

    private static int sumOfDigits(String word) {
        int sum = 0;
        for (int i = 0; i < word.length(); i++) {
            char each = word.charAt(i);
            if(Character.isDigit(each)){
                sum+= Integer.parseInt(""+each);
            }
        }
        return sum;
    }
}
