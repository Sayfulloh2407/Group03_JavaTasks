package week_03;

public class Gülnaz_03 {

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }




    public static void main(String[] args) {
        int num = 23;  // e.g.
        String result = isPrime(num) ? " is a prime number." : " is not a prime number.";
        System.out.println(num + result);


        System.out.println("--------------------------------------------------------------------------------------");


            int originalNumber = -5678;
            int reversedNumber = reverseNegativeNumber(originalNumber);
            System.out.println("Original Number: " + originalNumber);
            System.out.println("Reversed Number: " + reversedNumber);
        }

        public static int reverseNegativeNumber(int number) {
            if (number < 0) {
                // If the number is negative, reverse its digits
                int reversed = 0;
                int positiveNumber = -number;
                while (positiveNumber > 0) {
                    reversed = reversed * 10 + positiveNumber % 10;
                    positiveNumber /= 10;
                }
                return -reversed;
            } else {
                // If the number is positive, return the number as it is
                return number;
            }
        }
    }
















/*
1.Write a method that can check if a number is prime or not!

2.Write a return method that can reverse negative number and return it as int!
 */









