package week_03;

public class Umit_week03_Tasks {
    public static void main(String[] args) {


        boolean result = isPrime(15);
        System.out.println(result); //false

        boolean result2= isPrime(11);
        System.out.println(result2); //true

        boolean result3 = isPrime(2);
        System.out.println(result3); //true

        System.out.println("----------------------------------------");

        System.out.println(reverseNegative(-2585)); // -5852
        System.out.println(reverseNegative(789654));//it doesn't reverse the positive numbers


    }

    // 1. Write a method that can check if a number is prime or not
    public static boolean isPrime(int num){

       if(num <=1){
           return false;
       }

        for (int i = 2; i <= num / 2 ; i++) {
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
    
    // Write a return method that can reverse negative number and return it as int

    public static int reverseNegative(int number){

        if (number<0){

            int reversedVersion = 0;
            int positiveNum = number * -1;


            while (positiveNum > 0){

                reversedVersion = reversedVersion * 10 + positiveNum % 10;
                positiveNum /= 10;
            }
            return reversedVersion * -1;
        }else{
            return number;
        }


    }
}
/*
1. Numbers -- Prime Number
    Write a method that can check if a number is prime or not
    
2. Numbers -- Reverse negative number
    Write a return method that can reverse negative number and return it as int
    
 */