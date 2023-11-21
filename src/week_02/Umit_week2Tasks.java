package week_02;

import java.util.Scanner;

public class Umit_week2Tasks {

    public static void main(String[] args) {

        //1- swap two numbers--swap two variables' values without using a third variable

        int a = 20; // 10
        int b = 10; // 20

        a = a + b;  // a = 20+10 = 30
        b = a - b; // b = 30-10 = 20
        a = a - b; // a = 30-20 = 10

        System.out.println("a = " + a);  // 10
        System.out.println("b = " + b);  // 20


        //2- numbers divisible by 3, 5, 15

        String divisibleBy15 = "";   //divisible by 3,5,15
        String divisibleBy3 = "";    //divisible by 3 but NOT 15
        String divisibleBy5 = "";    // divisible by 5 but NOT 15


        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i % 15 == 0) {
                divisibleBy15 += " " + i;
            }
            if (i % 3 == 0 && i % 15 != 0) {
                divisibleBy3 += " " + i;
            }
            if (i % 5 == 0 && i % 15 != 0) {
                divisibleBy5 += " " + i;
            }


        }
        System.out.println("divisibleBy15 = " + divisibleBy15); //divisibleBy15 =  15 30 45 60 75 90
        System.out.println("divisibleBy3 = " + divisibleBy3);//divisibleBy3 =  3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
        System.out.println("divisibleBy5 = " + divisibleBy5);//divisibleBy5 =  5 10 20 25 35 40 50 55 65 70 80 85 95 100


        //3-Print consecutive numbers

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive number");

        int numb = input.nextInt();

        input.close();


        for (int i = 1; i <= numb; i++) {
            String result = "";
            if (i % 2 == 0) {
                result += "Codility";
            }
            if (i % 3 == 0) {
                result += "Test";
            }
            if (i % 5 == 0) {
                result += "Coders";
            }
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
                result += i;
            }
            System.out.println(result);


        }


    }
}

