package week_06.Ali;


import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.err.print("enter a String to find sum of digit characters: ");
        String str = scanner.nextLine();
        int sumDigChars = 0;
        for (int i = 0; i < str.length(); i++) {

            if(Character.isDigit(str.charAt(i))){
                sumDigChars += Integer.parseInt("" + str.charAt(i));


            }
        }
        System.out.println("sum of digit characters in string = " + sumDigChars);
    }


}

/*
      String -- sum of digits in a string
         Write a method that can return the sum of the digits in a string
*/
