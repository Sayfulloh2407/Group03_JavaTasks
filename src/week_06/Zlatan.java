package week_06;

public class Zlatan {
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