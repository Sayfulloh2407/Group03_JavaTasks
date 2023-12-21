package week_06.Ali;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("enter password"+ System.lineSeparator() );
            String passwordInput = scanner.nextLine();
            boolean verifyResult = verifyPassword(passwordInput);
            if(verifyResult==false){
                System.err.println(verifyResult);
            }else {
                System.out.println(verifyResult + System.lineSeparator()+ "verifying succesfull");
                break;
            }

        }
    }

    private static boolean verifyPassword(String password) {
        // Define a regular expression to match special characters
        String regex = "[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?]+";

        // Create a Pattern object
        Pattern pattern = Pattern.compile(regex);

        // Create a Matcher object
        Matcher matcher = pattern.matcher(password);

        int upperOccurs = 0, lowerOccurs = 0, spaceOccurs = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                upperOccurs += 1;
            } else {
                lowerOccurs += 1;
            }
            if (password.charAt(i) == 32) {
                spaceOccurs += 1;
            }

        }
        return matcher.find() && upperOccurs > 0 && lowerOccurs > 0 && spaceOccurs == 0;// Check if the Matcher finds a match
    }

}

/*
String -- Password Validation Task
        1. Write a return method that can verify if a password is valid or not.
        requirements:
        1. Password MUST be at least have 6 characters and should not contain space
        2. PassWord should at least contain one upper case letter
        3. PassWord should at least contain one lowercase letter
        4. Password should at least contain one special characters
        5. Password should at least contain a digit
        if all requirements above are met, the method returns true, otherwise returns false
        Array -- Find Maximum
        Write a method that can find the maximum number from an int Array
        String -- sum of digits in a string
        Write a method that can return the sum of the digits in a string
*/
