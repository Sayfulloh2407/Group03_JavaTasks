package week_02;

public class Gülnaz_02 {

    public static void main(String[] args) {

        int a = 35; // 20
        int b = 20; // 35

        a = a + b;  // a = 35+20 = 55
        b = a - b; // b = 55-20 = 35
        a = a - b; // a = 55-35 = 20

        System.out.println("a = " + a);  // 20
        System.out.println("b = " + b);  // 35


        System.out.println("---------------------------------------------------------------------------");

        int N = 30;

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                System.out.println("CodilityTestCoders");
            } else if (i % 2 == 0 && i % 3 == 0) {
                System.out.println("CodilityTest");
            } else if (i % 2 == 0 && i % 5 == 0) {
                System.out.println("CodilityCoders");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("TestCoders");
            } else if (i % 2 == 0) {
                System.out.println("Codility");
            } else if (i % 3 == 0) {
                System.out.println("Test");
            } else if (i % 5 == 0) {
                System.out.println("Coders");
            } else {
                System.out.println(i);
            }
        }

        System.out.println("-----------------------------------------------------------------------------");



            System.out.println("Divisible By 15:");
            for (int i = 1; i <= 100; i++) {
                if (i % 15 == 0) {
                    System.out.print(i + " ");
                }
            }

            System.out.println("\nDivisible By 3:");
            for (int i = 1; i <= 100; i++) {
                if (i % 3 == 0 && i % 15 != 0) {
                    System.out.print(i + " ");
                }
            }

            System.out.println("\nDivisible By 5:");
            for (int i = 1; i <= 100; i++) {
                if (i % 5 == 0 && i % 15 != 0) {
                    System.out.print(i + " ");
                }
            }
        }



    }



  /*1.Swap two variables values without using a third variable!

   2.Given positive integer N, prints consecutive numbers from 1 to N, each on a seperate line.
  Any number divisible by 2,3 or 5 should be replaced by the word Codility, Test or Coders respectively.
  If a number is divisible by more than one of the numbers: 2,3 or 5, it should be replaced by a concatenation of the
  respective words CodilityTest and numbers divisible by all three numbers: 2,3 and 5,should be replaced by
  CodilityTestCoders.

  3.Write a program that can print the numbers between 1~100 that can be divisible by 3,5 and 15.
  If the number can be divisible by 3,5 and 15, then it should only be displayed in DivisibleBy15' section.
  If the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibleBy3'
  section.
  If the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibleBy5'
  section.
  */


