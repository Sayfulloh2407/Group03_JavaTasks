package week_03;

public class Task1 {


    //Prime number can be divided only with nr. 1 and itself
    static boolean isPrime(int n) {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;

    }

    public static int reverseInteger(int number) {
        boolean isNegative = number < 0 ? true : false;
        if(isNegative){
            number = number * -1;
        }
        int reverse = 0;
        int lastDigit = 0;

        while (number >= 1) {
            lastDigit = number % 10; // gives you last digit
            reverse = reverse * 10 + lastDigit;
            number = number / 10; // get rid of last digit
        }

        return isNegative == true? reverse*-1 : reverse;
    }






















}
